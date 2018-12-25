package shgjj.tqgl.core.controller;

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
import shgjj.tqgl.core.vo.TqPersonBasicVO;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgEntity;
import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.service.TqSysMaterialCfgService;
import shgjj.tqgl.sys.service.TqSysMaterialResourceService;

/**
 * 
 * @author shenhuali
 * @date 2017年8月17日 下午13:23:49 
 * @Description: 业务核心controller
 *
 */
@Controller
@RequestMapping("/ywBusiness")
public class YwBusinessController {

	
	/**
	 * 通过身份证号 获取公积金账号、姓名等信息
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getGjjinfoByZjbh")
	public TqPersonBasicVO getGjjinfoByZjbh(HttpServletRequest request,
			HttpServletResponse response) {
		TqPersonBasicVO tqPersonBasicVO=new TqPersonBasicVO();
		return tqPersonBasicVO;
	}
	

}
