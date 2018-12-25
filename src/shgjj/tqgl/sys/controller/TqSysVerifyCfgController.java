package shgjj.tqgl.sys.controller;

import gov.util.bean.BeanUtils;
import gov.util.jpa.Pages;
import gov.util.jpa.Query;
import gov.util.jpa.json.EasyUIJsonUtils;
import gov.util.jpa.operator.FilterOperator;
import shgjj.tqgl.sys.bo.TqSysVerifyCfgEntity;
import shgjj.tqgl.sys.service.TqSysVerifyCfgService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * @author 郭亚敏
 * @version 创建时间：2017年8月8日 上午9:52:19 
 * @comment 业务验证类 
 * 1、实现业务验证配置的增删改查
 *
 */
@Controller
@RequestMapping("/tqSysVerifyCfg")
public class TqSysVerifyCfgController {

	private Logger log = Logger.getLogger(TqSysMaterialCfgController.class);

	@Autowired
	private TqSysVerifyCfgService tqSysVerifyCfgService;

	@RequestMapping("/toListPage")
	public String queryList(HttpServletRequest request, HttpServletResponse response) {
		return "/tqgl/sys/tqSysVerifyCfg/tqSysVerifyCfgList";
	}

	@RequestMapping("/addTqSysVerifyCfg")
	public String addtqSysVerifyResource() {
		return "/tqgl/sys/tqSysVerifyCfg/tqSysVerifyCfgAdd";
	}

	@ResponseBody
	@RequestMapping(value = "/saveTqSysVerifyResource")
	public void savetqSysVerifyResource(HttpServletRequest request, HttpServletResponse response,
			TqSysVerifyCfgEntity tqSysVerifyCfgEntity) {
		log.info("----------saveTqSysVerifyResource----------------");
		log.info("the name is " + tqSysVerifyCfgEntity.getVerifyCfgName());
		tqSysVerifyCfgService.save(tqSysVerifyCfgEntity);
		try {
			response.sendRedirect("toListPage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@ResponseBody
	@RequestMapping("/deleteTqSysVerifyCfg")
	public String delete(String verifyCfgId) {
		tqSysVerifyCfgService.delete(TqSysVerifyCfgEntity.class, Integer.parseInt(verifyCfgId));
		return "sucess";
	}

	@RequestMapping("/editTqSysVerifyCfg")
	public String edittqSysVerifyCfg(String verifyCfgId, Map<String, Object> model) {
		TqSysVerifyCfgEntity tqSysVerifyCfg = (TqSysVerifyCfgEntity) tqSysVerifyCfgService
				.find(TqSysVerifyCfgEntity.class, Integer.parseInt(verifyCfgId));
		model.put("tqSysVerifyCfg", tqSysVerifyCfg);
		return "/tqgl/sys/tqSysVerifyCfg/tqSysVerifyCfgEdit";
	}

	@ResponseBody
	@RequestMapping(value = "/updateTqSysVerifyCfg")
	public void updatetqSysVerifyCfg(HttpServletRequest request, HttpServletResponse response,
			TqSysVerifyCfgEntity tqSysVerifyCfg) {
		TqSysVerifyCfgEntity newTqSysVerifyCfg = (TqSysVerifyCfgEntity) tqSysVerifyCfgService
				.find(TqSysVerifyCfgEntity.class, tqSysVerifyCfg.getVerifyCfgId());
		if (newTqSysVerifyCfg != null) {
			BeanUtils.copyProperties(tqSysVerifyCfg, newTqSysVerifyCfg);
		} else {
			newTqSysVerifyCfg = tqSysVerifyCfg;
		}

		tqSysVerifyCfgService.save(newTqSysVerifyCfg);
		try {
			response.sendRedirect("toListPage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@ResponseBody
	@RequestMapping("/listTqSysVerifyCfg")
	public Map<String, Object> listtqSysVerifyCfgs(HttpServletRequest request, HttpServletResponse response,
			@RequestParam HashMap<String, Object> conditions, int page, int rows, Map<String, Object> model) {
		Query query = Query.from(TqSysVerifyCfgEntity.class).filter(conditions, null, FilterOperator.LIKE);
		Page<TqSysVerifyCfgEntity> tqSysVerifyCfgEntities = tqSysVerifyCfgService.findAll(query,
				Pages.setPageAndSize(page, rows));
		Map<String, Object> jsonMap = EasyUIJsonUtils.convertJpaPageToJson(tqSysVerifyCfgEntities);

		return jsonMap;
	}

}
