package shgjj.tqgl.sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gov.util.bean.BeanUtils;
import gov.util.jpa.Pages;
import gov.util.jpa.Query;
import gov.util.jpa.entity.EntityHelper;
import gov.util.jpa.json.EasyUIJsonUtils;
import gov.util.jpa.operator.FilterOperator;
import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.service.TqSysMaterialResourceService;

/**
 *
 * @author shiyan
 * @date 2017年8月10日 下午15:47:48 
 * @Description: 业务资源controller
 *
 */
@Controller
@RequestMapping("/tqSysMaterialResource")
public class TqSysMaterialResourceController {

	@Autowired
	private TqSysMaterialResourceService tqSysMaterialResourceService; 
	
	
	@RequestMapping("/toListPage")
	public String queryList(HttpServletRequest request,
			HttpServletResponse response)
	{
			
		return "/tqgl/sys/tqSysMaterialResource/tqSysMaterialResourceList";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/listTqSysMaterialResource")
	public Map<String, Object> listtqSysMaterialResources(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		
		Map<String, FilterOperator> fieldOperaotorMap = new HashMap<String, FilterOperator>();

		fieldOperaotorMap.put("materialName",FilterOperator.LIKE );
		fieldOperaotorMap.put("status", FilterOperator.EQUAL);
		fieldOperaotorMap.put("materialCode",FilterOperator.EQUAL);
		
		Query<TqSysMaterialResourceEntity> query = Query.from(TqSysMaterialResourceEntity.class).filter(conditions, fieldOperaotorMap, FilterOperator.LIKE);
		Page<TqSysMaterialResourceEntity>  tqSysMaterialResourceEntities = tqSysMaterialResourceService.findAll(query, Pages.setPageAndSize(page,rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqSysMaterialResourceEntities);
		
		return jsonMap;
	}
	
	@RequestMapping("/editTqSysMaterialResource")
	public String edittqSysMaterialResource(String id,Map<String, Object> model){
		TqSysMaterialResourceEntity tqSysMaterialResource = (TqSysMaterialResourceEntity)tqSysMaterialResourceService.find(TqSysMaterialResourceEntity.class,Integer.parseInt(id));
		model.put("tqSysMaterialResource", tqSysMaterialResource); 
		return "/tqgl/sys/tqSysMaterialResource/tqSysMaterialResourceEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateTqSysMaterialResource")
	public Map<?, ?> updatetqSysMaterialResource(HttpServletRequest request,
			HttpServletResponse response, TqSysMaterialResourceEntity tqSysMaterialResource){
		TqSysMaterialResourceEntity newTqSysMaterialResource = (TqSysMaterialResourceEntity)tqSysMaterialResourceService.find(TqSysMaterialResourceEntity.class, tqSysMaterialResource.getMaterialId());

		if(newTqSysMaterialResource != null)
			BeanUtils.copyProperties(tqSysMaterialResource, newTqSysMaterialResource);
		else
			newTqSysMaterialResource = tqSysMaterialResource;
		
		EntityHelper.handleUpdateEntity(request, newTqSysMaterialResource);
		
		tqSysMaterialResourceService.save(newTqSysMaterialResource);
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/deleteTqSysMaterialResource")
	public String delete(String[] id){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (String  str : id) {
			list.add(Integer.parseInt(str));
		}
		
		tqSysMaterialResourceService.delete(TqSysMaterialResourceEntity.class,list);
		return "sucess";
	}

	@RequestMapping("/addTqSysMaterialResource")
	public String add(){
		//TODO 初始化下拉框数据等
		
		
		return "/tqgl/sys/tqSysMaterialResource/tqSysMaterialResourceAdd";
	}
	
	
	@RequestMapping("/saveTqSysMaterialResource")
	public String save(HttpServletRequest request,TqSysMaterialResourceEntity tqSysMaterialResource ){
		
		EntityHelper.handleCreateEntity(request, tqSysMaterialResource);
		
		tqSysMaterialResourceService.save(tqSysMaterialResource);
		
		return "redirect:/tqSysMaterialResource/toListPage";
	}
	
}
