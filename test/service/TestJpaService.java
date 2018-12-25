package service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.controller.DemoController;
import demo.service.DemoService;

import shgjj.tqgl.core.bo.TqYwHouseEntity;
import shgjj.tqgl.core.bo.TqYwMainEntity;


/** 
* @author Shenhuali
* @version 创建时间：2017年8月4日 下午2:36:54 
* 类说明 
*/
public class TestJpaService {
	Logger logger = Logger.getLogger(TestJpaService.class);
	
	
	@Test
	public void test() {
		logger.info("11");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoService demoService= (DemoService) context.getBean(DemoService.class);
//		TqYwMainEntity r=new TqYwMainEntity();
//		TqYwHouseEntity s=new TqYwHouseEntity();
		
		
		
		
//		r=demoService.find(TqYwMainEntity.class, "1");
//		logger.info("11");
//		s=demoService.find(TqYwHouseEntity.class, "1");
		
	
	}
	
	
	@Test
	public void testC() {
		logger.info("11");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml",
				"spring-servlet.xml"});
		DemoController d= (DemoController) context.getBean(DemoController.class);
		
		d.helloWorld(null,1);
		//d.listPage(request, response, conditions, page, rows, model);
		
		
	
	}

}
