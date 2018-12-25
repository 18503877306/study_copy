package shgjj.tqgl.sys.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TqSysMaterialCfgDetailEntityPK  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 业务资料配置ID
	 */
	private Integer materialCfgId;
	/**
	 * 资料ID
	 */
	private Integer materialId;
	
	
	@Column(name = "MATERIAL_CFG_ID" ,nullable = false)
	public Integer getMaterialCfgId() {
		return materialCfgId;
	}
	public void setMaterialCfgId(Integer materialCfgId) {
		this.materialCfgId = materialCfgId;
	}
	@Column(name = "MATERIAL_ID")
	public Integer getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TqSysMaterialCfgDetailEntityPK)) {
			return false;
		}
		TqSysMaterialCfgDetailEntityPK castOther = (TqSysMaterialCfgDetailEntityPK)other;
		return 
			this.materialCfgId.equals(castOther.materialCfgId)
			&& this.materialId.equals(castOther.materialId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.materialCfgId.hashCode();
		hash = hash * prime + this.materialId.hashCode();
		
		return hash;
	}
	
	
}
