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
import shgjj.tqgl.sys.bo.TqSysMaterialCfgEntity;
import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.service.TqSysMaterialCfgService;
import shgjj.tqgl.sys.service.TqSysMaterialResourceService;

/**
 * 
 * @author shiyan
 * @date 2017年8月10日 下午16:23:49 
 * @Description: 业务资源配置controller
 *
 */
@Controller
@RequestMapping("/tqSysMaterialCfg")
public class TqSysMaterialCfgController {

	@Autowired
	private TqSysMaterialCfgService tqSysMaterialCfgService; 
	
	@Autowired
	private TqSysMaterialResourceService tqSysMaterialResourceService;
	
	@RequestMapping("/toListPage")
	public String queryList(HttpServletRequest request,
			HttpServletResponse response)
	{
			
		return "/tqgl/sys/tqSysMaterialCfg/tqSysMaterialCfgList";
	}
	
	
	@ResponseBody
	@RequestMapping("/listTqSysMaterialCfg")
	public Map<String, Object> listtqSysMaterialCfgs(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,
			Map<String, Object> model) {
		Query<TqSysMaterialCfgEntity> query = Query.from(TqSysMaterialCfgEntity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<TqSysMaterialCfgEntity>  tqSysMaterialCfgEntities = tqSysMaterialCfgService.findAll(query, Pages.setPageAndSize(page,rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqSysMaterialCfgEntities);
		
		return jsonMap;
	}
	
	@RequestMapping("/editTqSysMaterialCfg")
	public String edittqSysMaterialCfg(String id,Map<String, Object> model){
		TqSysMaterialCfgEntity tqSysMaterialCfg = (TqSysMaterialCfgEntity)tqSysMaterialCfgService.find(TqSysMaterialCfgEntity.class, Integer.parseInt(id));
		model.put("tqSysMaterialCfg", tqSysMaterialCfg); 
		
		//查询有效的 系统业务资源 
		List<TqSysMaterialResourceEntity> amountList =tqSysMaterialResourceService.queryValidResourceList();
		
		//TODO  
		List selectedList = new ArrayList<>();
		
		List validList = new ArrayList<>();
		//TODO
		
		model.put("amountList", amountList);
		model.put("validList", validList);
		model.put("selectedList", selectedList);
		
		return "/tqgl/sys/tqSysMaterialCfg/tqSysMaterialCfgEdit";
	}
	
	@ResponseBody
	@RequestMapping(value="/updateTqSysMaterialCfg")
	public Map<?, ?> updatetqSysMaterialCfg(HttpServletRequest request,
			HttpServletResponse response, TqSysMaterialCfgEntity tqSysMaterialCfg,String materialIds){
		TqSysMaterialCfgEntity newTqSysMaterialCfg = (TqSysMaterialCfgEntity)tqSysMaterialCfgService.find(TqSysMaterialCfgEntity.class, tqSysMaterialCfg.getMaterialCfgId());
		
		tqSysMaterialCfgService.updateMaterialCfgWithDetails(newTqSysMaterialCfg, materialIds);
		
		if(newTqSysMaterialCfg != null){
			BeanUtils.copyProperties(tqSysMaterialCfg, newTqSysMaterialCfg);    //更新
			EntityHelper.handleUpdateEntity(request, newTqSysMaterialCfg);
			tqSysMaterialCfgService.updateMaterialCfgWithDetails(newTqSysMaterialCfg, materialIds);
		}
		else{
			newTqSysMaterialCfg = tqSysMaterialCfg; //新增
			tqSysMaterialCfgService.save(newTqSysMaterialCfg);
		}
			
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	
	@ResponseBody
	@RequestMapping("/deleteTqSysMaterialCfg")
	public String delete(String[] id){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (String  str : id) {
			list.add(Integer.parseInt(str));
		}
		
		tqSysMaterialCfgService.delete(TqSysMaterialCfgEntity.class,list);
		return "sucess";
	}
	
	@RequestMapping("/addTqSysMaterialCfg")
	public String add(){
		//TODO 初始化下拉框数据等
		
		
		return "/tqgl/sys/tqSysMaterialCfg/tqSysMaterialCfgAdd";
	}
	
	@RequestMapping("/saveTqSysMaterialCfg")
	public String save(HttpServletRequest request,TqSysMaterialCfgEntity tqSysMaterialResource ){
		
		EntityHelper.handleCreateEntity(request, tqSysMaterialResource);
		TqSysMaterialCfgEntity newEntity = tqSysMaterialCfgService.save(tqSysMaterialResource);
		
		return "redirect:/tqSysMaterialCfg/editTqSysMaterialCfg?id="+newEntity.getMaterialCfgId();
	}

}
