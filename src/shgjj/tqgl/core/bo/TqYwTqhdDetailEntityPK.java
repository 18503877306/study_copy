package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TQ_YW_TQHD_DETAIL database table.
 * 
 */
@Embeddable
public class TqYwTqhdDetailEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	@Column(name="TQKD_MONTH")
	private String tqkdMonth;

	public TqYwTqhdDetailEntityPK() {
	}
	public String getBusinessNum() {
		return this.businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}
	public String getTqkdMonth() {
		return this.tqkdMonth;
	}
	public void setTqkdMonth(String tqkdMonth) {
		this.tqkdMonth = tqkdMonth;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TqYwTqhdDetailEntityPK)) {
			return false;
		}
		TqYwTqhdDetailEntityPK castOther = (TqYwTqhdDetailEntityPK)other;
		return 
			this.businessNum.equals(castOther.businessNum)
			&& this.tqkdMonth.equals(castOther.tqkdMonth);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessNum.hashCode();
		hash = hash * prime + this.tqkdMonth.hashCode();
		
		return hash;
	}
}