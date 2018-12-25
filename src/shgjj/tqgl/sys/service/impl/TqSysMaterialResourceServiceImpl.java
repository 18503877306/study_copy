package shgjj.tqgl.sys.service.impl;

import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.BaseJpaDao;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.dao.TqSysMaterialResourceDao;
import shgjj.tqgl.sys.service.TqSysMaterialResourceService;

@Service
public class TqSysMaterialResourceServiceImpl extends BaseJpaServiceImpl implements TqSysMaterialResourceService{
		@Autowired
		private TqSysMaterialResourceDao tqSysMaterialResourceDao; 
		
		public BaseJpaDao getJpaDao() {
			return tqSysMaterialResourceDao;
		}

		@Override
		public List<TqSysMaterialResourceEntity> queryValidResourceList() {
			
			return this.tqSysMaterialResourceDao.queryValidResourceList();
		}
}
