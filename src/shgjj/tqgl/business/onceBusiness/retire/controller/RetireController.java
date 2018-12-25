package shgjj.tqgl.business.onceBusiness.retire.controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gov.util.jpa.Pages;
import gov.util.jpa.filter.FilterItem;
import gov.util.jpa.json.EasyUIJsonUtils;
import gov.util.jpa.operator.FilterOperator;
import net.sf.json.JSONObject;
import shgjj.tqgl.business.onceBusiness.retire.bo.RetireBO;
import shgjj.tqgl.business.onceBusiness.retire.service.RetireService;
import shgjj.tqgl.common.constants.SystemConstants;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgDetailEntity;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgEntity;

/** 
* @author Shenhuali
* @version 创建时间：2017年7月31日 上午11:44:28 
* 类说明 
*/
@Controller
@RequestMapping("/business/onceBusiness/retire")
public class RetireController  {
    
	 private static final Logger logger =Logger.getLogger(RetireController.class);
	 
	
	 @Autowired
	 private RetireService  retireService;
	 
	 /** 录入退休提取信息页面  */
    @RequestMapping("/view")
    public String viewRetire(){
    	logger.info("录入页面");
    	retireService.CheckRetire();
        return "/tqgl/business/oncebusiness/retire/retireRegister";
    }  
    
	@ResponseBody
	@RequestMapping("/check")
	public Map<?, ?>  doRetirecheck (String id,Map<String, Object> model){
		logger.info("");
		
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("result", "success");
		return jsonMap;
	}
	/** 保存退休提取信息 */
	@RequestMapping("/saveRetireRegister")
	public String saveRetireRegister(RetireBO bo){
		
		return retireService.saveRetireRegister(bo);
	}
	
	/** 根据业务类型得到业务所需资料 */
	@ResponseBody
	@RequestMapping("/getSysMaterialCfgByBusinessType")
	public Map<String, Object> getSysMaterialCfgByBusinessType(HttpServletRequest request,
			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
			int page,int rows,Map<String, Object> model){
		String businessType = request.getParameter("businessType");
		TqSysMaterialCfgEntity tqSysMaterialCfg = new TqSysMaterialCfgEntity();
		tqSysMaterialCfg.setStatus(SystemConstants.Y_STATUS);
		tqSysMaterialCfg.setBusinessType(businessType);
		
		//根据业务类型先得到资料配置id
		List<TqSysMaterialCfgEntity> cfgEntity =  retireService.findAllByExample(tqSysMaterialCfg, FilterOperator.EQUAL);
		//根据资料配置id得到详细资料配置
		String hql = "from TqSysMaterialCfgDetailEntity where id.materialCfgId=:materialCfgId";
		//String sql = "select material_name materialName,material_id materialId from tq_sys_material_cfg_detail where material_cfg_id=:materialCfgId  order by list_order asc";
		Map<String, Object> parameter = new HashMap<String,Object>();
		parameter.put("materialCfgId",cfgEntity.get(0).getMaterialCfgId());
		Page<TqSysMaterialCfgDetailEntity> tqPage = retireService.executeQuery(hql, parameter, Pages.setPageAndSize(page, rows));
		Map<String, Object> map = EasyUIJsonUtils.convertJpaPageToJson(tqPage);
		
		return map;
	}
//	@ResponseBody
//	@RequestMapping("/getSysMaterialCfgByBusinessType")
//	public Map<String, Object> getSysMaterialCfgByBusinessType(HttpServletRequest request,
//			HttpServletResponse response,@RequestParam HashMap<String, Object> conditions,
//			int page,int rows) {
//		logger.info(conditions.get("businessType"));
////		String hql = "select b.id.materialId,b.materialName from TqSysMaterialCfgEntity a,TqSysMaterialCfgDetailEntity b "
////				+ "where a.materialCfgId=b.id.materialCfgId and a.status='0' and a.businessType=:businessType ";
////		String hql = "select b.id.materialId,b.materialName from TqSysMaterialCfgDetailEntity b where b.materialCfgId=(select a.materialCfgId"
////				+ " from TqSysMaterialCfgEntity a where a.status='0' and a.businessType=:businessType)";
//		String hql="from TqSysMaterialCfgDetailEntity ";
//		Map filterItemMap = new HashMap();
////		FilterItem item = new FilterItem(FilterOperator.EQUAL, "businessType", conditions.get("businessType"));
//		List<FilterItem> items = new ArrayList<FilterItem>();
////		items.add(item);
////		filterItemMap.put("a", items);
//		
//		Map<Class, String> clazzMap = new HashMap<Class,String>();
//		clazzMap.put(TqSysMaterialCfgDetailEntity.class, "b");
////		clazzMap.put(TqSysMaterialCfgEntity.class, "a");
//		
//		Map<String, Object> parameter = new HashMap<String, Object>();
//		parameter.put("businessType", conditions.get("businessType"));
//		
//		Page<TqSysMaterialCfgEntity> tqMaterialCfg = retireService.
//				getQueryList(filterItemMap, hql, clazzMap, parameter, Pages.setPageAndSize(page, rows));
//		
//		
//		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqMaterialCfg);
////		
//		return jsonMap;
//	}
	
	
}
