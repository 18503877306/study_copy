package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TQ_YW_FAMILY_SALARY database table.
 * 
 */
@Embeddable
public class TqYwFamilySalaryEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	private String zjhm;

	public TqYwFamilySalaryEntityPK() {
	}
	public String getBusinessNum() {
		return this.businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}
	public String getZjhm() {
		return this.zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TqYwFamilySalaryEntityPK)) {
			return false;
		}
		TqYwFamilySalaryEntityPK castOther = (TqYwFamilySalaryEntityPK)other;
		return 
			this.businessNum.equals(castOther.businessNum)
			&& this.zjhm.equals(castOther.zjhm);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessNum.hashCode();
		hash = hash * prime + this.zjhm.hashCode();
		
		return hash;
	}
}