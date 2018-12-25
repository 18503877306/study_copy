package shgjj.tqgl.sys.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import shgjj.tqgl.sys.dao.TqSysVerifyCfgDao;
import shgjj.tqgl.sys.service.TqSysVerifyCfgService;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TqSysVerifyCfgServiceImpl extends BaseJpaServiceImpl implements TqSysVerifyCfgService{
		
	    private Logger log = Logger.getLogger(TqSysVerifyResourceServiceImpl.class);
	    
	    @Autowired
		private TqSysVerifyCfgDao tqSysVerifyCfgDao; 
	    
		public BaseJpaDao getJpaDao() {
			
			return tqSysVerifyCfgDao;
		}
		

		
		
		
		
		
}
