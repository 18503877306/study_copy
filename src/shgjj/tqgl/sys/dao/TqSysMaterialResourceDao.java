package shgjj.tqgl.sys.dao;

import java.util.List;

import gov.util.jpa.BaseJpaDao;
import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;

public interface TqSysMaterialResourceDao extends BaseJpaDao{
	
	public List<TqSysMaterialResourceEntity> queryValidResourceList();
	
}