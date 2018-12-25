package dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gov.framework.test.BaseControllerTest;
import shgjj.tqgl.sys.bo.TqSysVerifyCfgEntity;
import shgjj.tqgl.sys.bo.TqSysVerifyResourceEntity;
import shgjj.tqgl.sys.dao.TqSysVerifyResourceDao;

public class TqSysVerifyResourceTest extends BaseControllerTest{
	
	private Logger log = Logger.getLogger(TqSysVerifyResourceTest.class);
	
	@Autowired
	TqSysVerifyResourceDao tqSysVerifyResourceDao;
	
  
	
	@Test
	public void test() {
		/*TqSysVerifyResourceEntity tqSysVerifyResourceEntity = new TqSysVerifyResourceEntity();
	//	tqSysVerifyResourceEntity.setVerifyId(1);
		tqSysVerifyResourceEntity.setVerifyName("身份证");
		tqSysVerifyResourceEntity.setVerifyCode("123");
		tqSysVerifyResourceEntity.setStatus("1");
		tqSysVerifyResourceEntity.setVerifyType("10");*/
		log.info("this is test");
		
		TqSysVerifyCfgEntity tqSysVerifyCfgEntity = new TqSysVerifyCfgEntity();
		tqSysVerifyCfgEntity.setVerifyCfgName("1");
		tqSysVerifyCfgEntity.setBusinessType("1");
		tqSysVerifyCfgEntity.setBusinessTypeDetail("12");
		tqSysVerifyCfgEntity.setRemark("12");
		tqSysVerifyCfgEntity.setStatus("1");
		
		tqSysVerifyResourceDao.save(tqSysVerifyCfgEntity);
	}

}
