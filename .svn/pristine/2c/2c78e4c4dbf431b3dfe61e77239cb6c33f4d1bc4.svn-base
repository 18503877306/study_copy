package shgjj.tqgl.business.onceBusiness.buyHouse.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shgjj.tqgl.business.onceBusiness.buyHouse.service.BuyHouseService;
import shgjj.tqgl.core.bo.TqYwMainDetailEntity;
import shgjj.tqgl.core.service.impl.YwBusinessServiceImpl;

/** 
* @author 郭亚敏
* @version 创建时间：2017年8月15日 下午15:31:28 
* 类说明 
*/
@Controller
@RequestMapping("/business/onceBusiness/buyHouse")
public class BuyHouseController {

	private Logger log = Logger.getLogger(BuyHouseController.class);
	
	@Autowired
	private YwBusinessServiceImpl ywBusinessServiceImpl;
	
	@Autowired
	private BuyHouseService buyHouseService;
	
	@RequestMapping("/personalEntry")
	public String test() {
		log.info("this is personalEntry page ");
		return "/tqgl/business/oncebusiness/buyHouse/personalEntry";
		}
	
	@ResponseBody
	@RequestMapping("/addMultiplePeople")
	public void add(HttpServletRequest request, HttpServletResponse response,
			TqYwMainDetailEntity tqYwMainDetailEntity) {
		log.info("this is addMultiplePeople ");
		String businessType = request.getParameter("businessType");
		tqYwMainDetailEntity.setBusinessNum(ywBusinessServiceImpl.getBusinessNum(businessType));
		
		List<TqYwMainDetailEntity> list = new ArrayList<>();
		list.add(tqYwMainDetailEntity);
		
		
		buyHouseService.save(tqYwMainDetailEntity);
		try {
			response.sendRedirect("personalEntry");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
