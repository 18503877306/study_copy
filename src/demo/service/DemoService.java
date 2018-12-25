package demo.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import gov.util.jpa.BaseJpaService;
import gov.util.jpa.impl.BaseJpaServiceImpl;

/** 
* @author Shenhuali
* @version 创建时间：2017年7月31日 上午11:44:28 
* 类说明 
*/

public interface DemoService extends BaseJpaService {
    
	public String Test (String a);
    
}
