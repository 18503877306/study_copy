package shgjj.tqgl.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.util.jpa.BaseJpaDao;
import gov.util.jpa.impl.BaseJpaServiceImpl;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgDetailEntity;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgDetailEntityPK;
import shgjj.tqgl.sys.bo.TqSysMaterialCfgEntity;
import shgjj.tqgl.sys.dao.TqSysMaterialCfgDao;
import shgjj.tqgl.sys.service.TqSysMaterialCfgService;

@Service
public class TqSysMaterialCfgServiceImpl extends BaseJpaServiceImpl implements TqSysMaterialCfgService{
		@Autowired
		private TqSysMaterialCfgDao tqSysMaterialCfgDao; 
		
		public BaseJpaDao getJpaDao() {
			return tqSysMaterialCfgDao;
		}

		@Override
		public void updateMaterialCfgWithDetails(TqSysMaterialCfgEntity tqSysMaterialCfg, String materialIds) {
			
			//保存业务资料配置信息
			this.save(tqSysMaterialCfg);
			//清空明细信息
			this.deleteMaterialCfgDetails(tqSysMaterialCfg.getMaterialCfgId());
			//新增明细信息
			this.addMaterialCfgDetails(tqSysMaterialCfg,materialIds);
		}

		
		/**
		 * 根据 配置id，和材料id字符串，新增业务材料明细信息
		 * @param materialCfgId
		 * @param materialIds
		 */
		private void addMaterialCfgDetails(TqSysMaterialCfgEntity tqSysMaterialCfg, String materialIds) {
		
			String[] ids = materialIds.split(",");
			
			List<TqSysMaterialCfgDetailEntity> list = new ArrayList<TqSysMaterialCfgDetailEntity>();
			
			if(ids!=null && ids.length > 0){
				for (int i=0;i<ids.length;i++) {
					TqSysMaterialCfgDetailEntity detailEntity = new  TqSysMaterialCfgDetailEntity();
					TqSysMaterialCfgDetailEntityPK id = new TqSysMaterialCfgDetailEntityPK();
					id.setMaterialCfgId(tqSysMaterialCfg.getMaterialCfgId());
					id.setMaterialId(Integer.parseInt(ids[i]));
					detailEntity.setId(id);
					detailEntity.setMaterialName(tqSysMaterialCfg.getMaterialCfgName());
					detailEntity.setListOrder(i+1);
					detailEntity.setNecessity("1");
					detailEntity.setImageNecessity("1");
					list.add(detailEntity);
				}
				this.save(list);
			}
		}
		
		
		/**
		 * 根据业务资料配置id，清空明细信息
		 * @param materialCfgId
		 */
		private void deleteMaterialCfgDetails(Integer materialCfgId){
			
		}
}
