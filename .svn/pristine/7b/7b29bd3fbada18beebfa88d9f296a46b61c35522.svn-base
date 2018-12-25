package shgjj.yyzc.controller;

import gov.sso.client.SSOClient;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shgjj.yyzc.bo.CurrentPersonBo;
import shgjj.yyzc.util.yyzcUtil;

@Controller
@RequestMapping("/yyzc")
public class yyzcController {
	
	//单点登录 -发送token
	@RequestMapping("/sendToken")
	public void sendToken(HttpServletRequest request, HttpServletResponse response)throws Exception {
		SSOClient client = SSOClient.getInstance();
		client.sendToken(request, response);
	}
	
	//完成单点登录 -跳转业务系统首页
	@RequestMapping("/dispatcher")
	public void dispatcher(HttpServletRequest request, HttpServletResponse response)throws Exception {
		SSOClient client = SSOClient.getInstance();
		String temp = client.getAccount(request);
		String account = temp.split("##")[0];
		String appId = temp.split("##")[1];
		String path = "";
		if(account!=null&&!account.equals("")){
			
			//登录成功后，需要设置session，回应主页等操作，此处需根据实际情况修改
			//此处需要整合应用支撑平台接口，详见总体设计《通用框架规范》
			Map paramMap = new HashMap();
			paramMap.put("account", account); 
			String rep = yyzcUtil.getReponseValue("user.queryByAccount",paramMap);
			if(rep != null && !"".equals(rep) && !rep.contains("error")){
				HttpSession session = request.getSession();
				session.setAttribute("account", account);
				session.setAttribute("appName", yyzcUtil.getAppNameById(appId));
				
				JSONObject object= JSONObject.fromObject(rep);
				
				CurrentPersonBo cp=(CurrentPersonBo)JSONObject.toBean(object, CurrentPersonBo.class);
				
				 session.setAttribute("currentPerson", cp);
				 
			}
			String rootPath = request.getContextPath();
			path=rootPath+"/yyzc/index";
		}else{
			//错误处理需根据实际情况跳转
			response.getWriter().println("SSO Failed");
			//重定向到统一错误页面
			path="http://101.101.98.12:8002/platform/admin/security_error.jsp";
		}
		
		response.sendRedirect(path);
	}
	
	//进入业务系统首页
	@RequestMapping("/index")
	public String index(){
		return "/yyzc/index";
	}
	
	//业务系统首页框架页面
	@RequestMapping("/frame")
	public String frame(HttpServletRequest request, HttpServletResponse response,Map<String, Object> model) throws Exception{
		HttpSession session = request.getSession();
		String account =  String.valueOf(session.getAttribute("account"));
		
		//获取横向一级菜单
		Map paramMap = new HashMap();
		paramMap.put("id", account); 
		String rep = yyzcUtil.getReponseValue("menu.getByUserId",paramMap);
		JSONArray firstMenu = new JSONArray().fromObject(new JSONObject().fromObject(rep).getString("menuList"));
		JSONObject temp = new JSONObject().fromObject(firstMenu.get(0));
		String leftMenuId =temp.getString("id");
		model.put("firstMenu", firstMenu);
		model.put("leftMenuId", leftMenuId);
		return "/yyzc/frame";
	}
	
	//业务系统首页菜单页面
	@RequestMapping("/menu")
	public String menu(String leftMenuId,Map<String, Object> model) throws Exception{
		//获取左侧菜单
		Map paramMap = new HashMap();
		paramMap.put("id", leftMenuId); 
		String rep = yyzcUtil.getReponseValue("menu.getChildrenMenu",paramMap);
		JSONArray leftmenus = new JSONArray();
		if(rep.contains("menuList")){
			Object obj= new JSONObject().fromObject(rep).getString("menuList");
			JSONArray secondMenu = new JSONArray().fromObject(obj);
			for(int i=0;i<secondMenu.size();i++){
				JSONObject temp = new JSONObject().fromObject(secondMenu.get(i));
				
				Map paramMap2 = new HashMap();
				paramMap2.put("id", temp.getString("id")); 
				String rep2 = yyzcUtil.getReponseValue("menu.getChildrenMenu",paramMap2);
				
				if(rep2.contains("menuList")){
					Object obj2= new JSONObject().fromObject(rep2).getString("menuList");
					JSONArray thirdMenu = new JSONArray().fromObject(obj2);
					temp.put("thirdMenu", thirdMenu);
				}else{
					temp.put("thirdMenu", "no");
				}
				leftmenus.add(temp);
			}
			model.put("secondMenu", leftmenus);
			return "/yyzc/menu";
		}else{
			Map paramMap2 = new HashMap();
			paramMap2.put("id", leftMenuId); 
			String rep2 = yyzcUtil.getReponseValue("menu.getMenuById",paramMap2);
			JSONObject temp = new JSONObject().fromObject(rep2);
			return temp.getString("url");
		}
		
	}
}
