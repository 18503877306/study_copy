package service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gov.framework.test.BaseControllerTest;
import shgjj.tqgl.core.dao.YwBusinessDao;
import shgjj.tqgl.core.service.impl.YwBusinessServiceImpl;
import shgjj.tqgl.sys.bo.TqSysVerifyResourceEntity;
import shgjj.tqgl.sys.service.impl.TqSysVerifyResourceServiceImpl;

public class TestTqSysVerifyResourceService extends BaseControllerTest{
	
	private Logger logger = Logger.getLogger(TestTqSysVerifyResourceService.class);
	
	@Autowired
	TqSysVerifyResourceServiceImpl tqSysVerifyResourceServiceImpl;
	
	@Autowired
	YwBusinessServiceImpl ywBusinessServiceImpl;
	
	@Autowired
	YwBusinessDao ywBusinessDao;
	
	@Test
	public void test(){
		String businessNum = ywBusinessServiceImpl.getBusinessNum("03");  //120320170817040841000061
		logger.info("the businessNum is : "+businessNum);
//		List<TqSysVerifyResourceEntity> list = tqSysVerifyResourceServiceImpl.getTqSysVerifyResources();
//		logger.info("the list is : "+list);
//		logger.info("the list size is : "+list.size());
		

		
	}

}
