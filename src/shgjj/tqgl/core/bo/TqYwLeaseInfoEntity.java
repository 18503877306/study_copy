package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TQ_YW_LEASE_INFO database table.
 * 
 */
@Table(name="TQ_YW_LEASE_INFO")
@NamedQuery(name="TqYwLeaseInfoEntity.findAll", query="SELECT t FROM TqYwLeaseInfoEntity t")
public class TqYwLeaseInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LEASE_NUM")
	private String leaseNum;

	@Column(name="AGREEMENT_NUM")
	private String agreementNum;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	@Column(name="CONTRACT_BEGIN_TIME")
	private String contractBeginTime;

	@Column(name="CONTRACT_END_TIME")
	private String contractEndTime;

	@Column(name="CZR_XM")
	private String czrXm;

	@Column(name="CZR_ZJHM")
	private String czrZjhm;

	@Column(name="CZR_ZJLX")
	private String czrZjlx;

	@Column(name="FAMILY_SALARY")
	private BigDecimal familySalary;

	private String fwzl;

	@Column(name="LEASE_CONTRACT_NO")
	private String leaseContractNo;

	@Column(name="LEASE_TYPE")
	private String leaseType;

	@Column(name="RENT_MONTH")
	private BigDecimal rentMonth;

	private BigDecimal zjbt;

	public TqYwLeaseInfoEntity() {
	}

	public String getLeaseNum() {
		return this.leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
	}

	public String getAgreementNum() {
		return this.agreementNum;
	}

	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}

	public String getBusinessNum() {
		return this.businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getContractBeginTime() {
		return this.contractBeginTime;
	}

	public void setContractBeginTime(String contractBeginTime) {
		this.contractBeginTime = contractBeginTime;
	}

	public String getContractEndTime() {
		return this.contractEndTime;
	}

	public void setContractEndTime(String contractEndTime) {
		this.contractEndTime = contractEndTime;
	}

	public String getCzrXm() {
		return this.czrXm;
	}

	public void setCzrXm(String czrXm) {
		this.czrXm = czrXm;
	}

	public String getCzrZjhm() {
		return this.czrZjhm;
	}

	public void setCzrZjhm(String czrZjhm) {
		this.czrZjhm = czrZjhm;
	}

	public String getCzrZjlx() {
		return this.czrZjlx;
	}

	public void setCzrZjlx(String czrZjlx) {
		this.czrZjlx = czrZjlx;
	}

	public BigDecimal getFamilySalary() {
		return this.familySalary;
	}

	public void setFamilySalary(BigDecimal familySalary) {
		this.familySalary = familySalary;
	}

	public String getFwzl() {
		return this.fwzl;
	}

	public void setFwzl(String fwzl) {
		this.fwzl = fwzl;
	}

	public String getLeaseContractNo() {
		return this.leaseContractNo;
	}

	public void setLeaseContractNo(String leaseContractNo) {
		this.leaseContractNo = leaseContractNo;
	}

	public String getLeaseType() {
		return this.leaseType;
	}

	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}

	public BigDecimal getRentMonth() {
		return this.rentMonth;
	}

	public void setRentMonth(BigDecimal rentMonth) {
		this.rentMonth = rentMonth;
	}

	public BigDecimal getZjbt() {
		return this.zjbt;
	}

	public void setZjbt(BigDecimal zjbt) {
		this.zjbt = zjbt;
	}

}