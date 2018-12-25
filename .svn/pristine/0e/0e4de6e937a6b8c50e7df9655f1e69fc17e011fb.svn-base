package shgjj.tqgl.sys.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shgjj.tqgl.sys.bo.TqSysVerifyCfgDetailEntity;
import shgjj.tqgl.sys.service.TqSysVerifyCfgDetailService;

/**
 * @author 郭亚敏
 * @version 创建时间：2017年8月8日 上午9:52:19
 * @comment 业务验证类 1、实现业务验证资源的增删改查
 */
@Controller
@RequestMapping("/sys/verify")
public class TqSysVerifyController {

	private Logger log = Logger.getLogger(TqSysMaterialCfgController.class);
	
	@Autowired
	private TqSysVerifyCfgDetailService tqSysVerifyCfgDetailService;

	@RequestMapping("/toListPage")
	public String queryList(HttpServletRequest request, HttpServletResponse response) {

		log.info("------------toListPage--------------------");
		return "/tqgl/sys/tqSysVerifyCfgDetail/tqSysVerifyCfgDetailList";
	}

	@RequestMapping("/toAddPage")
	public String addVerify(HttpServletRequest request, HttpServletResponse response) {

		log.info("------------toAddPage--------------------");
		return "/tqgl/sys/tqSysVerifyCfgDetail/tqSysVerifyCfgDetailEdit";
	}

	@ResponseBody
	@RequestMapping(value = "/saveTqSysVerifyCfgDetail")
	public void savetqSysVerifyResource(HttpServletRequest request, HttpServletResponse response,
			TqSysVerifyCfgDetailEntity tqSysVerifyCfgDetail) {
		
		log.info("-------------this is save verifyCfgDeatil----------------");
		tqSysVerifyCfgDetailService.save(tqSysVerifyCfgDetail);
		try {
			response.sendRedirect("toListPage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
