package shgjj.tqgl.sys.service;

import gov.util.jpa.BaseJpaService;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgEntity;


public interface TqSysMaterialCfgService extends BaseJpaService{
	
	/**
	 * 更新配置信息，并新增明细信息
	 * @param tqSysMaterialCfg
	 * @param materialIds
	 */
	public void updateMaterialCfgWithDetails(TqSysMaterialCfgEntity tqSysMaterialCfg,String materialIds);
	
	
}
