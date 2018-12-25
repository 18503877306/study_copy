package shgjj.tqgl.core.bo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>Title: TqYwMainEntity类/p>
 * <p>Description: Entity for TQ_YW_MAIN</p>
 * @author lvxin
 * @version 2017-08-16
 */
@Entity
@Table(name = "TQ_YW_MAIN")
public class TqYwMainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final Logger logger = Logger.getLogger(TqYwMainEntity.class);
	
	/**
	 * 业务流水号
	 */
	private String businessNum;
	/**
	 * 业务类型
	 */
	private String businessType;
	/**
	 * 业务明细类型
	 */
	private String businessTypeDetail;
	/**
	 * (标准204008)提取原因
	 */
	private String tqyy;
	/**
	 * 业务渠道
	 */
	private String businessSource;
	/**
	 * 业务开始时间
	 */
	private String acceptTime;
	/**
	 * 业务审批完成时间
	 */
	private String approveTime;
	/**
	 * 业务支付完成时间
	 */
	private String payTmie;
	/**
	 * 业务状态
	 */
	private String status;
	/**
	 * 受理区县
	 */
	private String area;
	/**
	 * 受理网点
	 */
	private String branch;
	/**
	 * 受理操作员ID
	 */
	private String operatorId;
	/**
	 * 受理操作员姓名
	 */
	private String operatorName;
	/**
	 * 提取审批总金额
	 */
	private Integer approveAmountSum;
	/**
	 * 实际提取总金额
	 */
	private Integer happenAmount;
	/**
	 * 审批状态
	 */
	private String approveStatus;
	/**
	 * 函状态
10 无发函 |  20 函未办结 |  30 函完结
	 */
	private String letterStatus;
	/**
	 * 外联验证状态
0 无外联 | 1验证中 | 2 验证通过
	 */
	private String exVerifyStatus;
	/**
	 * 业务信息核心号码
不同业务填写不同信息，购房设定填写产证号,租赁填写租赁信息号，贷前提取填写 产证号
	 */
	private String mainNum;
	/**
	 * 业务验证版本
	 */
	private Integer verifyCfgId;
	/**
	 * 委托业务编号
	 */
	private String agreementNum;
	/**
	 * 终止原因代码
	 */
	private String endReasonCode;
	/**
	 * 注销原因
	 */
	private String endReason;
	/**
	 * 注销时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	/**
	 * 注销操作员ID
	 */
	private String endOperatorId;
	/**
	 * 注销操作员姓名
	 */
	private String endOpersotrName;
	
	/**
	 * 业务流水号
	 * @return businessNum
	 */
	@Id
	@Column(name = "BUSINESS_NUM" ,unique = true ,nullable = false)
//	@GeneratedValue(generator = "idGenerator")
//	@GenericGenerator(name = "idGenerator" ,strategy = "uuid")
	public String getBusinessNum(){
		return this.businessNum;
	}
	/**
	 * 业务类型
	 * @return businessType
	 */
	@Column(name = "BUSINESS_TYPE")
	public String getBusinessType(){
		return this.businessType;
	}
	/**
	 * 业务明细类型
	 * @return businessTypeDetail
	 */
	@Column(name = "BUSINESS_TYPE_DETAIL")
	public String getBusinessTypeDetail(){
		return this.businessTypeDetail;
	}
	/**
	 * (标准204008)提取原因
	 * @return tqyy
	 */
	@Column(name = "TQYY")
	public String getTqyy(){
		return this.tqyy;
	}
	/**
	 * 业务渠道
	 * @return businessSource
	 */
	@Column(name = "BUSINESS_SOURCE")
	public String getBusinessSource(){
		return this.businessSource;
	}
	/**
	 * 业务开始时间
	 * @return acceptTime
	 */
	@Column(name = "ACCEPT_TIME")
	public String getAcceptTime(){
		return this.acceptTime;
	}
	/**
	 * 业务审批完成时间
	 * @return approveTime
	 */
	@Column(name = "APPROVE_TIME")
	public String getApproveTime(){
		return this.approveTime;
	}
	/**
	 * 业务支付完成时间
	 * @return payTmie
	 */
	@Column(name = "PAY_TMIE")
	public String getPayTmie(){
		return this.payTmie;
	}
	/**
	 * 业务状态
	 * @return status
	 */
	@Column(name = "STATUS")
	public String getStatus(){
		return this.status;
	}
	/**
	 * 受理区县
	 * @return area
	 */
	@Column(name = "AREA")
	public String getArea(){
		return this.area;
	}
	/**
	 * 受理网点
	 * @return branch
	 */
	@Column(name = "BRANCH")
	public String getBranch(){
		return this.branch;
	}
	/**
	 * 受理操作员ID
	 * @return operatorId
	 */
	@Column(name = "OPERATOR_ID")
	public String getOperatorId(){
		return this.operatorId;
	}
	/**
	 * 受理操作员姓名
	 * @return operatorName
	 */
	@Column(name = "OPERATOR_NAME")
	public String getOperatorName(){
		return this.operatorName;
	}
	/**
	 * 提取审批总金额
	 * @return approveAmountSum
	 */
	@Column(name = "APPROVE_AMOUNT_SUM")
	public Integer getApproveAmountSum(){
		return this.approveAmountSum;
	}
	/**
	 * 实际提取总金额
	 * @return happenAmount
	 */
	@Column(name = "HAPPEN_AMOUNT")
	public Integer getHappenAmount(){
		return this.happenAmount;
	}
	/**
	 * 审批状态
	 * @return approveStatus
	 */
	@Column(name = "APPROVE_STATUS")
	public String getApproveStatus(){
		return this.approveStatus;
	}
	/**
	 * 函状态
10 无发函 |  20 函未办结 |  30 函完结
	 * @return letterStatus
	 */
	@Column(name = "LETTER_STATUS")
	public String getLetterStatus(){
		return this.letterStatus;
	}
	/**
	 * 外联验证状态
0 无外联 | 1验证中 | 2 验证通过
	 * @return exVerifyStatus
	 */
	@Column(name = "EX_VERIFY_STATUS")
	public String getExVerifyStatus(){
		return this.exVerifyStatus;
	}
	/**
	 * 业务信息核心号码
不同业务填写不同信息，购房设定填写产证号,租赁填写租赁信息号，贷前提取填写 产证号
	 * @return mainNum
	 */
	@Column(name = "MAIN_NUM")
	public String getMainNum(){
		return this.mainNum;
	}
	/**
	 * 业务验证版本
	 * @return verifyCfgId
	 */
	@Column(name = "VERIFY_CFG_ID")
	public Integer getVerifyCfgId(){
		return this.verifyCfgId;
	}
	/**
	 * 委托业务编号
	 * @return agreementNum
	 */
	@Column(name = "AGREEMENT_NUM")
	public String getAgreementNum(){
		return this.agreementNum;
	}
	/**
	 * 终止原因代码
	 * @return endReasonCode
	 */
	@Column(name = "END_REASON_CODE")
	public String getEndReasonCode(){
		return this.endReasonCode;
	}
	/**
	 * 注销原因
	 * @return endReason
	 */
	@Column(name = "END_REASON")
	public String getEndReason(){
		return this.endReason;
	}
	/**
	 * 注销时间
	 * @return endTime
	 */
	@Column(name = "END_TIME")
	public Date getEndTime(){
		return this.endTime;
	}
	/**
	 * 注销操作员ID
	 * @return endOperatorId
	 */
	@Column(name = "END_OPERATOR_ID")
	public String getEndOperatorId(){
		return this.endOperatorId;
	}
	/**
	 * 注销操作员姓名
	 * @return endOpersotrName
	 */
	@Column(name = "END_OPERSOTR_NAME")
	public String getEndOpersotrName(){
		return this.endOpersotrName;
	}
	/**
	 * 业务流水号
	 * @param businessNum 业务流水号
	 */
	public void setBusinessNum(String businessNum){
		this.businessNum = businessNum;
	}
	/**
	 * 业务类型
	 * @param businessType 业务类型
	 */
	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}
	/**
	 * 业务明细类型
	 * @param businessTypeDetail 业务明细类型
	 */
	public void setBusinessTypeDetail(String businessTypeDetail){
		this.businessTypeDetail = businessTypeDetail;
	}
	/**
	 * (标准204008)提取原因
	 * @param tqyy (标准204008)提取原因
	 */
	public void setTqyy(String tqyy){
		this.tqyy = tqyy;
	}
	/**
	 * 业务渠道
	 * @param businessSource 业务渠道
	 */
	public void setBusinessSource(String businessSource){
		this.businessSource = businessSource;
	}
	/**
	 * 业务开始时间
	 * @param acceptTime 业务开始时间
	 */
	public void setAcceptTime(String acceptTime){
		this.acceptTime = acceptTime;
	}
	/**
	 * 业务审批完成时间
	 * @param approveTime 业务审批完成时间
	 */
	public void setApproveTime(String approveTime){
		this.approveTime = approveTime;
	}
	/**
	 * 业务支付完成时间
	 * @param payTmie 业务支付完成时间
	 */
	public void setPayTmie(String payTmie){
		this.payTmie = payTmie;
	}
	/**
	 * 业务状态
	 * @param status 业务状态
	 */
	public void setStatus(String status){
		this.status = status;
	}
	/**
	 * 受理区县
	 * @param area 受理区县
	 */
	public void setArea(String area){
		this.area = area;
	}
	/**
	 * 受理网点
	 * @param branch 受理网点
	 */
	public void setBranch(String branch){
		this.branch = branch;
	}
	/**
	 * 受理操作员ID
	 * @param operatorId 受理操作员ID
	 */
	public void setOperatorId(String operatorId){
		this.operatorId = operatorId;
	}
	/**
	 * 受理操作员姓名
	 * @param operatorName 受理操作员姓名
	 */
	public void setOperatorName(String operatorName){
		this.operatorName = operatorName;
	}
	/**
	 * 提取审批总金额
	 * @param approveAmountSum 提取审批总金额
	 */
	public void setApproveAmountSum(Integer approveAmountSum){
		this.approveAmountSum = approveAmountSum;
	}
	/**
	 * 实际提取总金额
	 * @param happenAmount 实际提取总金额
	 */
	public void setHappenAmount(Integer happenAmount){
		this.happenAmount = happenAmount;
	}
	/**
	 * 审批状态
	 * @param approveStatus 审批状态
	 */
	public void setApproveStatus(String approveStatus){
		this.approveStatus = approveStatus;
	}
	/**
	 * 函状态
10 无发函 |  20 函未办结 |  30 函完结
	 * @param letterStatus 函状态
10 无发函 |  20 函未办结 |  30 函完结
	 */
	public void setLetterStatus(String letterStatus){
		this.letterStatus = letterStatus;
	}
	/**
	 * 外联验证状态
0 无外联 | 1验证中 | 2 验证通过
	 * @param exVerifyStatus 外联验证状态
0 无外联 | 1验证中 | 2 验证通过
	 */
	public void setExVerifyStatus(String exVerifyStatus){
		this.exVerifyStatus = exVerifyStatus;
	}
	/**
	 * 业务信息核心号码
不同业务填写不同信息，购房设定填写产证号,租赁填写租赁信息号，贷前提取填写 产证号
	 * @param mainNum 业务信息核心号码
不同业务填写不同信息，购房设定填写产证号,租赁填写租赁信息号，贷前提取填写 产证号
	 */
	public void setMainNum(String mainNum){
		this.mainNum = mainNum;
	}
	/**
	 * 业务验证版本
	 * @param verifyCfgId 业务验证版本
	 */
	public void setVerifyCfgId(Integer verifyCfgId){
		this.verifyCfgId = verifyCfgId;
	}
	/**
	 * 委托业务编号
	 * @param agreementNum 委托业务编号
	 */
	public void setAgreementNum(String agreementNum){
		this.agreementNum = agreementNum;
	}
	/**
	 * 终止原因代码
	 * @param endReasonCode 终止原因代码
	 */
	public void setEndReasonCode(String endReasonCode){
		this.endReasonCode = endReasonCode;
	}
	/**
	 * 注销原因
	 * @param endReason 注销原因
	 */
	public void setEndReason(String endReason){
		this.endReason = endReason;
	}
	/**
	 * 注销时间
	 * @param endTime 注销时间
	 */
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	/**
	 * 注销操作员ID
	 * @param endOperatorId 注销操作员ID
	 */
	public void setEndOperatorId(String endOperatorId){
		this.endOperatorId = endOperatorId;
	}
	/**
	 * 注销操作员姓名
	 * @param endOpersotrName 注销操作员姓名
	 */
	public void setEndOpersotrName(String endOpersotrName){
		this.endOpersotrName = endOpersotrName;
	}
}
