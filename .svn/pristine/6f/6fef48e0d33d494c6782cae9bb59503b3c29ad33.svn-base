package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TQ_YW_LEASE_DETAIL database table.
 * 
 */
@Embeddable
public class TqYwLeaseDetailEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	@Column(name="TQ_MONTH")
	private String tqMonth;

	public TqYwLeaseDetailEntityPK() {
	}
	public String getBusinessNum() {
		return this.businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}
	public String getTqMonth() {
		return this.tqMonth;
	}
	public void setTqMonth(String tqMonth) {
		this.tqMonth = tqMonth;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TqYwLeaseDetailEntityPK)) {
			return false;
		}
		TqYwLeaseDetailEntityPK castOther = (TqYwLeaseDetailEntityPK)other;
		return 
			this.businessNum.equals(castOther.businessNum)
			&& this.tqMonth.equals(castOther.tqMonth);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessNum.hashCode();
		hash = hash * prime + this.tqMonth.hashCode();
		
		return hash;
	}
}