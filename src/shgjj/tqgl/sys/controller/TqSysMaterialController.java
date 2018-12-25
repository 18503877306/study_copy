package shgjj.tqgl.sys.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.service.TqSysMaterialService;

import org.apache.log4j.Logger;

/** 
* @author 郭亚敏
* @version 创建时间：2017年7月31日 上午11:44:28 
* @comment 业务资料controller
* 1、实现业务资料资源的增删改查
* 2、实现各类提取业务所需的业务资料配置的增删改查
*/
@Controller
@RequestMapping("/sys/material")
public class TqSysMaterialController {
    
	 private static final Logger logger =Logger.getLogger(TqSysMaterialController.class);
	 
	
	 @Autowired
	 private TqSysMaterialService   tqSysMaterialService;
	

    @RequestMapping("/list")
    public String listMaterial(){
    	   	
        return "demo/mydemo";
    }    
	
	
	@ResponseBody
    @RequestMapping("/addResource")
    public TqSysMaterialResourceEntity addResource(TqSysMaterialResourceEntity tqSysMaterialResource){
		tqSysMaterialResource.getMaterialName();
		tqSysMaterialResource.getMaterialCode();
		tqSysMaterialResource.getStatus();
		tqSysMaterialResource.setMaterialId(111);
		logger.info(tqSysMaterialResource.getMaterialName());
		logger.info(tqSysMaterialResource.getMaterialCode());
		logger.info(tqSysMaterialResource.getStatus());
		
		tqSysMaterialService.save(tqSysMaterialResource);
		tqSysMaterialService.testfun();
        return tqSysMaterialResource;
    }    
	
	 @RequestMapping("/addResource2")
	 public String test1(Model model){
		 TqSysMaterialResourceEntity tqSysMaterialResource= new TqSysMaterialResourceEntity();
		 tqSysMaterialResource.setStatus("22");
	        model.addAttribute("tqSysMaterialResource", tqSysMaterialResource);
	        return "demo/mydemo2";
	        
	    }
	
//	@ResponseBody
//    @RequestMapping("/json")
//    public Map<String, Object> listPage(HttpServletRequest request, HttpServletResponse response,
//			@RequestParam HashMap<String, Object> conditions, int page,int rows,
//			Map<String, Object> model){
//    	logger.info("myJson");
//    	Query query = Query.from(TqYwMainEntity.class).filter(conditions, null, FilterOperator.LIKE)
//            	.filter(Filters.notEqual("businessNum", "0"))//添加条件和排序
//            	.orderBy(Orders.desc("businessNum"));
//       Page<TqYwMainEntity>  tqYwMainEntity = demoService.findAll(query, Pages.setPageAndSize(page,rows));
//            //将分页对象转换成easyui datagrid所需的json对象
//       Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqYwMainEntity, "yyyy-MM-dd");
//      
//       jsonMap.put("tqYwMainEntity", tqYwMainEntity);
//       
//       return jsonMap;
//    }    
//    
	
	
	
 
}
