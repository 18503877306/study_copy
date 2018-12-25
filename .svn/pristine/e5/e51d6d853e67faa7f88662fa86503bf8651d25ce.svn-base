package shgjj.tqgl.sys.controller;

import gov.util.bean.BeanUtils;
import gov.util.jpa.Orders;
import gov.util.jpa.Pages;
import gov.util.jpa.Query;
import gov.util.jpa.json.EasyUIJsonUtils;
import gov.util.jpa.operator.FilterOperator;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shgjj.tqgl.sys.bo.TqSysVerifyResourceEntity;
import shgjj.tqgl.sys.service.TqSysVerifyResourceService;
/**
 * 
 * @author 郭亚敏
 * @version 创建时间：2017年8月8日 上午9:52:19 
 * @comment 业务验证类 
 * 1、实现业务验证资源的增删改查
 *
 */
@Controller
@RequestMapping("/tqSysVerifyResource")
public class TqSysVerifyResourceController {

	private Logger log = Logger.getLogger(TqSysMaterialCfgController.class);
	
	@Autowired
	private TqSysVerifyResourceService tqSysVerifyResourceService; 
	
	@RequestMapping("/toListPage")
	public String queryList(HttpServletRequest request,
			HttpServletResponse response)
	{	
		return "/tqgl/sys/tqSysVerifyResource/tqSysVerifyResourceList";
	}
	
	@ResponseBody
	@RequestMapping("/listTqSysVerifyResource")
	public Map<String, Object> listtqSysVerifyResources(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query query = Query.from(TqSysVerifyResourceEntity.class).filter(conditions, null, FilterOperator.LIKE);  // 查询所有记录
		Page<TqSysVerifyResourceEntity>  tqSysVerifyResourceEntities = tqSysVerifyResourceService.findAll(query, Pages.setPageAndSize(page,rows));	
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqSysVerifyResourceEntities);
		return jsonMap;
	}
	
	@RequestMapping("/editTqSysVerifyResource")
	public String edittqSysVerifyResource(String verifyId,Map<String, Object> model){
	TqSysVerifyResourceEntity tqSysVerifyResource = (TqSysVerifyResourceEntity)tqSysVerifyResourceService.find(TqSysVerifyResourceEntity.class, Integer.parseInt(verifyId));
		model.put("tqSysVerifyResource", tqSysVerifyResource); 
		return "/tqgl/sys/tqSysVerifyResource/tqSysVerifyResourceEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateTqSysVerifyResource")
	public void updatetqSysVerifyResource(HttpServletRequest request,
			HttpServletResponse response, TqSysVerifyResourceEntity tqSysVerifyResource){
		log.info("----------updateTqSysVerifyResource-----------------");
		log.info("the verifyId is " + tqSysVerifyResource.getVerifyId());
		TqSysVerifyResourceEntity newTqSysVerifyResource = (TqSysVerifyResourceEntity)tqSysVerifyResourceService.find(TqSysVerifyResourceEntity.class, tqSysVerifyResource.getVerifyId());
		if(newTqSysVerifyResource != null) {
			BeanUtils.copyProperties(tqSysVerifyResource, newTqSysVerifyResource);
		}else {
			newTqSysVerifyResource = tqSysVerifyResource;
		}
		    tqSysVerifyResourceService.save(newTqSysVerifyResource);
		  try {
				response.sendRedirect("toListPage");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	@ResponseBody
	@RequestMapping("/deleteTqSysVerifyResource")
	public String delete(String verifyId){
		tqSysVerifyResourceService.delete(TqSysVerifyResourceEntity.class,Integer.parseInt(verifyId));
		//tqSysVerifyResourceService.delete(TqSysVerifyResourceEntity.class,Arrays.asList(verifyId));
		return "sucess";
	}

	@RequestMapping("/addTqSysVerifyResource")
	public String addtqSysVerifyResource(){
		return "/tqgl/sys/tqSysVerifyResource/tqSysVerifyResourceAdd";
	}
	
	@ResponseBody
	@RequestMapping(value="/saveTqSysVerifyResource")
	public void savetqSysVerifyResource(HttpServletRequest request,
			HttpServletResponse response, TqSysVerifyResourceEntity tqSysVerifyResource){
		tqSysVerifyResourceService.save(tqSysVerifyResource);
	    try {
			response.sendRedirect("toListPage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
