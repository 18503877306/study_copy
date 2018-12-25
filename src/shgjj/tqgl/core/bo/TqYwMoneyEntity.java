package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TQ_YW_MONEY database table.
 * 
 */
@Table(name="TQ_YW_MONEY")
@NamedQuery(name="TqYwMoneyEntity.findAll", query="SELECT t FROM TqYwMoneyEntity t")
public class TqYwMoneyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAY_NUM")
	private String payNum;

	@Column(name="APPROVE_ACCRUAL")
	private BigDecimal approveAccrual;

	@Column(name="APPROVE_AMOUNT")
	private BigDecimal approveAmount;

	@Column(name="B_CLOSE")
	private String bClose;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	@Column(name="CARD_HOLDER_NAME")
	private String cardHolderName;

	@Column(name="CARD_NUM")
	private String cardNum;

	@Column(name="CREATED_BY_ID")
	private String createdById;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	private String dwmc;

	private String dwzh;

	private BigDecimal fse;

	private BigDecimal fslxe;

	private String grzh;

	@Column(name="LAST_MODIFIED_BY_ID")
	private String lastModifiedById;

	@Column(name="LAST_MODIFIED_BY_NAME")
	private String lastModifiedByName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MODIFIED_TIME")
	private Date lastModifiedTime;

	@Column(name="PAY_STATUS")
	private String payStatus;

	private String remark;

	private String tqsf;

	private String xingming;

	private String zjhm;

	private String zjlx;

	public TqYwMoneyEntity() {
	}

	public String getPayNum() {
		return this.payNum;
	}

	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}

	public BigDecimal getApproveAccrual() {
		return this.approveAccrual;
	}

	public void setApproveAccrual(BigDecimal approveAccrual) {
		this.approveAccrual = approveAccrual;
	}

	public BigDecimal getApproveAmount() {
		return this.approveAmount;
	}

	public void setApproveAmount(BigDecimal approveAmount) {
		this.approveAmount = approveAmount;
	}

	public String getBClose() {
		return this.bClose;
	}

	public void setBClose(String bClose) {
		this.bClose = bClose;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBusinessNum() {
		return this.businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDwmc() {
		return this.dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getDwzh() {
		return this.dwzh;
	}

	public void setDwzh(String dwzh) {
		this.dwzh = dwzh;
	}

	public BigDecimal getFse() {
		return this.fse;
	}

	public void setFse(BigDecimal fse) {
		this.fse = fse;
	}

	public BigDecimal getFslxe() {
		return this.fslxe;
	}

	public void setFslxe(BigDecimal fslxe) {
		this.fslxe = fslxe;
	}

	public String getGrzh() {
		return this.grzh;
	}

	public void setGrzh(String grzh) {
		this.grzh = grzh;
	}

	public String getLastModifiedById() {
		return this.lastModifiedById;
	}

	public void setLastModifiedById(String lastModifiedById) {
		this.lastModifiedById = lastModifiedById;
	}

	public String getLastModifiedByName() {
		return this.lastModifiedByName;
	}

	public void setLastModifiedByName(String lastModifiedByName) {
		this.lastModifiedByName = lastModifiedByName;
	}

	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTqsf() {
		return this.tqsf;
	}

	public void setTqsf(String tqsf) {
		this.tqsf = tqsf;
	}

	public String getXingming() {
		return this.xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public String getZjhm() {
		return this.zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	public String getZjlx() {
		return this.zjlx;
	}

	public void setZjlx(String zjlx) {
		this.zjlx = zjlx;
	}

}