package shgjj.tqgl.sys.service.impl; 
/** 
* @author Shenhuali
* @version 创建时间：2017年8月7日 下午5:15:57 
* 类说明 
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.DemoDao;
import gov.util.jpa.BaseJpaDao;
import gov.util.jpa.impl.BaseJpaServiceImpl;
import shgjj.tqgl.sys.dao.TqSysMaterialResourceDao;
import shgjj.tqgl.sys.service.TqSysMaterialService;

@Service
public class TqSysMaterialServiceImpl extends BaseJpaServiceImpl implements TqSysMaterialService {

	
	@Autowired
	TqSysMaterialResourceDao tqSysMaterialResourceDao;
	
	@Autowired
	DemoDao demoDao;
	
	@Override
	public BaseJpaDao getJpaDao() {
		// TODO Auto-generated method stub
		return tqSysMaterialResourceDao;
	}
	
	
	public void testfun() {
		demoDao.helloWorld();
		
	}

}
