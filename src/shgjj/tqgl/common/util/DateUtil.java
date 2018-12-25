package shgjj.tqgl.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>Description: 时间工具类</p>
 * @author Lvxin
 * @date 2017年8月16日上午9:57:46
 *
 */
public class DateUtil extends gov.util.date.DateUtil {
	
	/**
	 * 获得时间格式yyyyMMddhhmmss
	 */
	public static String getDateToLongStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss"); 
		return format.format(new Date());
	}
	
}
