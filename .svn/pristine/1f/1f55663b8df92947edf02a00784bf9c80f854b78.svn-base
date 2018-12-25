package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TQ_YW_LEASE_DETAIL database table.
 * 
 */
@Table(name="TQ_YW_LEASE_DETAIL")
@NamedQuery(name="TqYwLeaseDetailEntity.findAll", query="SELECT t FROM TqYwLeaseDetailEntity t")
public class TqYwLeaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TqYwLeaseDetailEntityPK id;

	@Column(name="ACCEPT_TIME")
	private String acceptTime;

	@Column(name="AGREEMENT_NUM")
	private String agreementNum;

	@Column(name="BILL_END_TIME")
	private String billEndTime;

	@Column(name="BILL_START_TIME")
	private String billStartTime;

	@Column(name="CONTRACT_BEGIN_TIME")
	private String contractBeginTime;

	@Column(name="CONTRACT_END_TIME")
	private String contractEndTime;

	@Column(name="FAMILY_SALARY")
	private BigDecimal familySalary;

	@Column(name="INVOICE_CODE")
	private String invoiceCode;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="LEASE_NUM")
	private String leaseNum;

	@Column(name="RENT_MONTH")
	private BigDecimal rentMonth;

	private BigDecimal zjbt;

	public TqYwLeaseDetailEntity() {
	}

	public TqYwLeaseDetailEntityPK getId() {
		return this.id;
	}

	public void setId(TqYwLeaseDetailEntityPK id) {
		this.id = id;
	}

	public String getAcceptTime() {
		return this.acceptTime;
	}

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getAgreementNum() {
		return this.agreementNum;
	}

	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}

	public String getBillEndTime() {
		return this.billEndTime;
	}

	public void setBillEndTime(String billEndTime) {
		this.billEndTime = billEndTime;
	}

	public String getBillStartTime() {
		return this.billStartTime;
	}

	public void setBillStartTime(String billStartTime) {
		this.billStartTime = billStartTime;
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

	public BigDecimal getFamilySalary() {
		return this.familySalary;
	}

	public void setFamilySalary(BigDecimal familySalary) {
		this.familySalary = familySalary;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getLeaseNum() {
		return this.leaseNum;
	}

	public void setLeaseNum(String leaseNum) {
		this.leaseNum = leaseNum;
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