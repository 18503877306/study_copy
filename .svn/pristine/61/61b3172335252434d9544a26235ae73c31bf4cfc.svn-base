package shgjj.tqgl.common.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;


/** 
* @author Shenhuali
* @version 创建时间：2017年8月17日 下午10:59:19 
* 异常处理类
* http://www.cnblogs.com/andy-zhou/p/5317820.html
*/
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {
	
	private static final Logger logger =Logger.getLogger(GlobalExceptionResolver.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		logger.debug(ex.getMessage(),ex); 
		// 判断是否ajax请求
        if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
                .getHeader("X-Requested-With") != null && request.getHeader(
                "X-Requested-With").indexOf("XMLHttpRequest") > -1))) {
            // 如果不是ajax，JSP格式返回
            // 为安全起见，只有业务异常我们对前端可见，否则否则统一归为系统异常
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", false);
            if (ex instanceof BusinessException) {
                map.put("errorMsg", ex.getMessage());
            } else {
                map.put("errorMsg", "系统异常！");
                logger.error(ex.getMessage(),ex); 
            }
           
            //对于非ajax请求，我们都统一跳转到error.jsp页面
            return new ModelAndView("/error", map);
        } else {
            // 如果是ajax请求，JSON格式返回
            try {
                response.setContentType("application/json;charset=UTF-8");
                PrintWriter writer = response.getWriter();
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("success", false);
                // 为安全起见，只有业务异常我们对前端可见，否则统一归为系统异常
                if (ex instanceof BusinessException) {
                    map.put("errorMsg", ex.getMessage());
                } else {
                    map.put("errorMsg", "系统异常！");
                    logger.error(ex.getMessage(),ex); 
                }
                writer.write(JSONUtils.toJSONString(map));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
