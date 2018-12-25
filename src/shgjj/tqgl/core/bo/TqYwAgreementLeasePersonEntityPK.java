package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TQ_YW_AGREEMENT_LEASE_PERSON database table.
 * 
 */
@Embeddable
public class TqYwAgreementLeasePersonEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AGREEMENT_NUM")
	private String agreementNum;

	private String grzh;

	public TqYwAgreementLeasePersonEntityPK() {
	}
	public String getAgreementNum() {
		return this.agreementNum;
	}
	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
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
		if (!(other instanceof TqYwAgreementLeasePersonEntityPK)) {
			return false;
		}
		TqYwAgreementLeasePersonEntityPK castOther = (TqYwAgreementLeasePersonEntityPK)other;
		return 
			this.agreementNum.equals(castOther.agreementNum)
			&& this.grzh.equals(castOther.grzh);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.agreementNum.hashCode();
		hash = hash * prime + this.grzh.hashCode();
		
		return hash;
	}
}