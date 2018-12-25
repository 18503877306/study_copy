package ueditor;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.io.IOUtils;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.FileUploadBase.InvalidContentTypeException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;

/**
 * UEditor�ļ��ϴ�������
 * 
 */
public class Uploader {

	// �ļ���С����, ��λkb
	private static final int MAX_SIZE = 500 * 1024;
	// ����ļ���ַ
	private String url = "";
	// �ϴ��ļ���
	private String fileName = "";
	// ״̬
	private String state = "";
	// �ļ�����
	private String type = "";
	// ԭʼ�ļ���
	private String originalName = "";
	// �ļ���С
	private String size = "";

	private HttpServletRequest request = null;
	private String title = "";

	// ����·��
	private String savePath = "upload";
	// �ļ�������ʽ
	private String[] allowFiles = { ".rar", ".doc", ".docx", ".zip", ".pdf",
			".txt", ".swf", ".wmv", ".gif", ".png", ".jpg", ".jpeg", ".bmp" };
	// �ļ���С���ƣ���λByte
	private long maxSize = 0;

	private HashMap<String, String> errorInfo = new HashMap<String, String>();
	private Map<String, String> params = null;
	// �ϴ����ļ�����
	private InputStream inputStream = null;

	public static final String ENCODEING = System.getProperties().getProperty(
			"file.encoding");

	public Uploader(HttpServletRequest request) {
		this.request = request;
		this.params = new HashMap<String, String>();

		this.setMaxSize(Uploader.MAX_SIZE);

		HashMap<String, String> tmp = this.errorInfo;
		tmp.put("SUCCESS", "SUCCESS"); // Ĭ�ϳɹ�
		// δ�����ļ��ϴ���
		tmp.put("NOFILE",
				"\\u672a\\u5305\\u542b\\u6587\\u4ef6\\u4e0a\\u4f20\\u57df");
		// ���������ļ���ʽ
		tmp.put("TYPE",
				"\\u4e0d\\u5141\\u8bb8\\u7684\\u6587\\u4ef6\\u683c\\u5f0f");
		// �ļ���С��������
		tmp.put("SIZE",
				"\\u6587\\u4ef6\\u5927\\u5c0f\\u8d85\\u51fa\\u9650\\u5236");
		// �������ʹ���
		tmp.put("ENTYPE", "\\u8bf7\\u6c42\\u7c7b\\u578b\\u9519\\u8bef");
		// �ϴ������쳣
		tmp.put("REQUEST", "\\u4e0a\\u4f20\\u8bf7\\u6c42\\u5f02\\u5e38");
		// δ�ҵ��ϴ��ļ�
		tmp.put("FILE", "\\u672a\\u627e\\u5230\\u4e0a\\u4f20\\u6587\\u4ef6");
		// IO�쳣
		tmp.put("IO", "IO\\u5f02\\u5e38");
		// Ŀ¼����ʧ��
		tmp.put("DIR", "\\u76ee\\u5f55\\u521b\\u5efa\\u5931\\u8d25");
		// δ֪����
		tmp.put("UNKNOWN", "\\u672a\\u77e5\\u9519\\u8bef");

		this.parseParams();

	}

	public void upload() throws Exception {
		boolean isMultipart = ServletFileUpload
				.isMultipartContent(this.request);
		if (!isMultipart) {
			this.state = this.errorInfo.get("NOFILE");
			return;
		}

		if (this.inputStream == null) {
			this.state = this.errorInfo.get("FILE");
			return;
		}

		// �洢title
		this.title = this.getParameter("pictitle");

		try {
			String savePath = this.getFolder(this.savePath);

			if (!this.checkFileType(this.originalName)) {
				this.state = this.errorInfo.get("TYPE");
				return;
			}

			this.fileName = this.getName(this.originalName);
			this.type = this.getFileExt(this.fileName);
			this.url = savePath + "/" + this.fileName;

			FileOutputStream fos = new FileOutputStream(
					this.getPhysicalPath(this.url));
			BufferedInputStream bis = new BufferedInputStream(this.inputStream);
			byte[] buff = new byte[128];
			int count = -1;

			while ((count = bis.read(buff)) != -1) {

				fos.write(buff, 0, count);

			}

			bis.close();
			fos.close();

			this.state = this.errorInfo.get("SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			this.state = this.errorInfo.get("IO");
		}

	}

	/**
	 * ���ܲ�������base64��ʽ�ϴ����ļ�
	 * 
	 * @param fieldName
	 */
	public void uploadBase64(String fieldName) {
		String savePath = this.getFolder(this.savePath);
		String base64Data = this.request.getParameter(fieldName);
		this.fileName = this.getName("test.png");
		this.url = savePath + "/" + this.fileName;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			File outFile = new File(this.getPhysicalPath(this.url));
			OutputStream ro = new FileOutputStream(outFile);
			byte[] b = decoder.decodeBuffer(base64Data);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			ro.write(b);
			ro.flush();
			ro.close();
			this.state = this.errorInfo.get("SUCCESS");
		} catch (Exception e) {
			this.state = this.errorInfo.get("IO");
		}
	}

	public String getParameter(String name) {

		return this.params.get(name);

	}

	/**
	 * �ļ������ж�
	 * 
	 * @param fileName
	 * @return
	 */
	private boolean checkFileType(String fileName) {
		Iterator<String> type = Arrays.asList(this.allowFiles).iterator();
		while (type.hasNext()) {
			String ext = type.next();
			if (fileName.toLowerCase().endsWith(ext)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ��ȡ�ļ���չ��
	 * 
	 * @return string
	 */
	private String getFileExt(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}

	private void parseParams() {

		DiskFileItemFactory dff = new DiskFileItemFactory();
		try {
			ServletFileUpload sfu = new ServletFileUpload(dff);
			sfu.setSizeMax(this.maxSize);
			sfu.setHeaderEncoding(Uploader.ENCODEING);

			FileItemIterator fii = sfu.getItemIterator(this.request);

			while (fii.hasNext()) {
				FileItemStream item = fii.next();
				// ��ͨ�����洢
				if (item.isFormField()) {

					this.params.put(item.getFieldName(),
							this.getParameterValue(item.openStream()));

				} else {

					// ֻ����һ��
					if (this.inputStream == null) {
						this.inputStream = item.openStream();
						this.originalName = item.getName();
						return;
					}

				}

			}

		} catch (Exception e) {
			this.state = this.errorInfo.get("UNKNOWN");
		}

	}

	/**
	 * ����ԭʼ�ļ����������ļ���
	 * 
	 * @return
	 */
	private String getName(String fileName) {
		Random random = new Random();
		return this.fileName = "" + random.nextInt(10000)
				+ System.currentTimeMillis() + this.getFileExt(fileName);
	}

	/**
	 * �����ַ�����������Ŀ¼ ���������ڽ�����Ŀ¼����
	 * 
	 * @param path
	 * @return
	 */
	private String getFolder(String path) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
		path += "/" + formater.format(new Date());
		File dir = new File(this.getPhysicalPath(path));
		if (!dir.exists()) {
			try {
				dir.mkdirs();
			} catch (Exception e) {
				this.state = this.errorInfo.get("DIR");
				return "";
			}
		}
		return path;
	}

	/**
	 * ���ݴ��������·����ȡ����·��
	 * 
	 * @param path
	 * @return
	 */
	private String getPhysicalPath(String path) {
		String servletPath = this.request.getServletPath();
		String realPath = this.request.getSession().getServletContext()
				.getRealPath(servletPath);
		return new File(realPath).getParent() + "/" + path;
	}

	/**
	 * ���������л�ȡ�ַ�������
	 * 
	 * @param in
	 *            �������������� ����ַ������Ӹ����ж�ȡ
	 * @return �����ж�ȡ�����ַ���
	 */
	private String getParameterValue(InputStream in) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		String result = "";
		String tmpString = null;

		try {

			while ((tmpString = reader.readLine()) != null) {
				result += tmpString;
			}

		} catch (Exception e) {
			// do nothing
		}

		return result;

	}

	private byte[] getFileOutputStream(InputStream in) {

		try {
			return IOUtils.toByteArray(in);
		} catch (IOException e) {
			return null;
		}

	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public void setAllowFiles(String[] allowFiles) {
		this.allowFiles = allowFiles;
	}

	public void setMaxSize(long size) {
		this.maxSize = size * 1024;
	}

	public String getSize() {
		return this.size;
	}

	public String getUrl() {
		return this.url;
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getState() {
		return this.state;
	}

	public String getTitle() {
		return this.title;
	}

	public String getType() {
		return this.type;
	}

	public String getOriginalName() {
		return this.originalName;
	}
}