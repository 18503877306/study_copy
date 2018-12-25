package demo.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import demo.dao.DemoDao;
import demo.service.DemoService;
import gov.util.jpa.BaseJpaDao;
import gov.util.jpa.Orders;
import gov.util.jpa.Query;
import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.operator.FilterOperator;


/** 
* @author Shenhuali
* @version 创建时间：2017年8月2日 下午2:40:17 
* 类说明 
*/
@Service
public class DemoServiceImpl extends BaseJpaServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;

	@Override
	public String Test(String a) {
		System.out.println("a:"+a);
		return a+a;
	}

	@Override
	public BaseJpaDao getJpaDao() {
		return demoDao;
	}

	
	
	
	



}
