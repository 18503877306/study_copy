package shgjj.yyzc.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class yyzcUtil {

	//应用支撑平台接口接口服务地址（ip和端口根据实际情况修改，后者的路径不用修改）
	public static String url = "http://tqsh:8090/yyzc/platform/api"; 
//	public static String url = "http://101.101.98.12:8002/yyzc/platform/api "; 
	//服务系统注册的token的密钥
	public static String secret = "123456";   
	//给httpClient的method设置参数（appKey是ROP的系统级参数，是必须的。）注：服务系统注册凭证时自动生成的调用凭证
	public static String appKey = "9814a3783976b96ecc566051104d2794";   
	//ROP的系统级参数，表示请求的服务的版本号，也是必须的（目前都是1.0）
	public static String appVersion = "1.0";
	//ROP的系统级参数，表示通信报文的格式，不是必须的，可选xml和json（但是默认是xml）
	public static String format = "json";
	private static PostMethod pm;  
	//参数需要加密的参数（键值对）。注：暂时所有参数都必须加密
	private static Map paramValues;
	private static HttpClient httpClient;
	
	public static String getReponseValue(String methodName,Map paramMap) throws Exception {
		String rep="";
		//初始化httpClient所需的method对象
		pm = new PostMethod(yyzcUtil.url); 
		//pm.setRequestHeader("Content-Type","application/json;charset=UTF-8");
		paramValues = new java.util.HashMap(); 
		pm.addParameter("appKey", yyzcUtil.appKey); 
		//表示需要加密
		paramValues.put("appKey", yyzcUtil.appKey);       
		pm.addParameter("v", yyzcUtil.appVersion);                                        
		paramValues.put("v", yyzcUtil.appVersion);
		pm.addParameter("format", yyzcUtil.format);                                  
		paramValues.put("format", yyzcUtil.format); 
		
		httpClient = new HttpClient();
		httpClient.getParams().setContentCharset("UTF-8");
		//ROP的系统级参数，表示访问的服务的哪个方法
		pm.addParameter("method", methodName);                        
		paramValues.put("method", methodName);
		
		 //执行该方法需要的参数，登陆账号（业务及参数）
		Iterator it = paramMap.entrySet().iterator();
		while(it.hasNext()){
			java.util.Map.Entry entry =  (java.util.Map.Entry)it.next();
			pm.addParameter(entry.getKey().toString(), entry.getValue().toString());
			paramValues.put(entry.getKey().toString(), entry.getValue().toString());
		}              
		
		//ROP的加密算法，获得加密串，通过sign参数传到后台
		String signValue = yyzcUtil.sign(paramValues, yyzcUtil.secret);                       
		//ROP系统级参数，必须的。
		pm.addParameter("sign", signValue); 
		//httpClient执行这次请求
		httpClient.executeMethod(pm); 
		rep = pm.getResponseBodyAsString();
		return rep;
	}
	
	//下面都是ROP的加密算法
	public static String sign(Map paramValues,String secret) {                   
        try {
            StringBuilder sb = new StringBuilder();
            List paramNames = new ArrayList(paramValues.size());
            paramNames.addAll(paramValues.keySet());
            /*if(ignoreParamNames != null && ignoreParamNames.size() > 0){
                for (String ignoreParamName : ignoreParamNames) {
                    paramNames.remove(ignoreParamName);
                }
                for(int i=0;i<ignoreParamNames.size();i++){
                	paramNames.remove(ignoreParamNames.get(i));
                }
            }*/
            Collections.sort(paramNames);

            sb.append(secret);
            /*for (String paramName : paramNames) {
                sb.append(paramName).append(paramValues.get(paramName));
            }*/
            for(int i=0;i<paramNames.size();i++){
            	sb.append(paramNames.get(i)).append(paramValues.get(paramNames.get(i)));
            }
            sb.append(secret);
            byte[] sha1Digest = getSHA1Digest(sb.toString());
            return byte2hex(sha1Digest);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
 
    private static byte[] getSHA1Digest(String data) throws IOException {
        byte[] bytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            bytes = md.digest(data.getBytes("GBK"));
        } catch (GeneralSecurityException gse) {
            throw new IOException(gse.getMessage());
        }
        return bytes;
    }
    
    private static String byte2hex(byte[] bytes) {           
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }
    
    //根据appID 获取appName
    public static String getAppNameById(String appId) {  
    	String appName="综合业务服务和管理平台";
    	if("GJ".equals(appId)){
    		appName="归集管理系统";
    	}
    	if("TQ".equals(appId)){
    		appName="提取管理系统";
    	}
    	return appName;
    }
}
