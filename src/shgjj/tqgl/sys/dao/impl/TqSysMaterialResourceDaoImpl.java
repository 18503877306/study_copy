package shgjj.tqgl.sys.dao.impl;

import gov.util.jpa.Query;
import gov.util.jpa.impl.BaseJpaDaoImpl;
import gov.util.jpa.operator.FilterOperator;
import shgjj.tqgl.sys.bo.TqSysMaterialResourceEntity;
import shgjj.tqgl.sys.dao.TqSysMaterialResourceDao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TqSysMaterialResourceDaoImpl extends BaseJpaDaoImpl implements TqSysMaterialResourceDao{

	@Override
	public List<TqSysMaterialResourceEntity> queryValidResourceList() {
		
		Query<TqSysMaterialResourceEntity> query = Query.from(TqSysMaterialResourceEntity.class);
		
		query.filter(FilterOperator.EQUAL, "status", "0");
		
		List<TqSysMaterialResourceEntity> list =  this.findAll(query);
		
		return list;
	}
	
}