package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TQ_YW_LEASE_PERSON database table.
 * 
 */
@Embeddable
public class TqYwLeasePersonEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	private String grzh;

	public TqYwLeasePersonEntityPK() {
	}
	public String getBusinessNum() {
		return this.businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}
	public String getGrzh() {
		return this.grzh;
	}
	public void setGrzh(String grzh) {
		this.grzh = grzh;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TqYwLeasePersonEntityPK)) {
			return false;
		}
		TqYwLeasePersonEntityPK castOther = (TqYwLeasePersonEntityPK)other;
		return 
			this.businessNum.equals(castOther.businessNum)
			&& this.grzh.equals(castOther.grzh);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessNum.hashCode();
		hash = hash * prime + this.grzh.hashCode();
		
		return hash;
	}
}