package shgjj.tqgl.core.bo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import gov.util.jpa.entity.ICreateEntity;
import gov.util.jpa.entity.IUpdateEntity;


/**
 * <p>Title: TqYwMainDetailEntity类/p>
 * <p>Description: Entity for TQ_YW_MAIN_DETAIL</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "TQ_YW_MAIN_DETAIL")
public class TqYwMainDetailEntity implements Serializable,ICreateEntity,IUpdateEntity{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static final Logger logger = Logger.getLogger(TqYwMainDetailEntity.class);
	
	
	/**
	 * 业务流水号
	 */
	private String businessNum;
	/**
	 * （标准102001）个人账号
	 */
	private String grzh;
	/**
	 * （标准102002）姓名
	 */
	private String xingming;
	/**
	 * （标准102007）证件类型
	 */
	private String zjlx;
	/**
	 * （标准102008）证件号码
	 */
	private String zjhm;
	/**
	 * 是否销户 1 销户   0 非销户
	 */
	private String bClose;
	/**
	 * 审批金额
	 */
	private Integer approveAmount;
	/**
	 * 审批参考利息
	 */
	private Integer approveAccrual;
	/**
	 * 关系
	 */
	private String relation;
	/**
	 * （标准204009）提取方式
	 */
	private String tqsf;
	/**
	 * （标准101002）单位账号
	 */
	private String dwzh;
	/**
	 * （标准101001）单位名称
	 */
	private String dwmc;
	/**
	 * 银行卡卡号
	 */
	private String cardNum;
	/**
	 * 持卡人姓名
	 */
	private String cardHolderName;
	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 银行代码
	 */
	private String bankCode;
	/**
	 * （标准203002）个人缴存基数
	 */
	private Integer grjcjs;
	/**
	 * 政治面貌
	 */
	private String politics;
	/**
	 * （标准102010）婚姻状况
	 */
	private String hyzk;
	/**
	 * 配偶姓名
	 */
	private String mateXingming;
	/**
	 * 配偶证件类型
	 */
	private String mateZjlx;
	/**
	 * 配偶证件号码
	 */
	private String mateZjhm;
	/**
	 * 委托人姓名
	 */
	private String agentXingming;
	/**
	 * 委托人证件类型
	 */
	private String agentZjlx;
	/**
	 * 委托人证件号码
	 */
	private String agentZjhm;
	/**
	 * 委托人手机号码
	 */
	private String agentSjhm;
	/**
	 * 支付顺序
	 */
	private String payOrder;
	/**
	 * （标准102006）手机号码
	 */
	private String sjhm;
	/**
	 * （标准202003）发生额
	 */
	private Integer fse;
	/**
	 * （标准202004）发生利息额
	 */
	private Integer fslxe;
	/**
	 * 转账状态  1未转账  2转账中  3 转账完成  4转账失败  0 取消转账
	 */
	private String payStatus;
	/**
	 * 账号状态  0 新系统   1老系统
	 */
	private String accountType;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdTime;
	/**
	 * 创建人ID
	 */
	private String createdById;
	/**
	 * 创建人姓名
	 */
	private String createdByName;
	/**
	 * 最后修改时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lastModifiedTime;
	/**
	 * 最后修改操作员ID
	 */
	private String lastModifiedById;
	/**
	 * 最后修改操作员姓名
	 */
	private String lastModifiedByName;
	
	/**
	 * 业务流水号
	 * @return lastModifiedTime
	 */
	@Id
	@Column(name = "BUSINESS_NUM" ,unique = true ,nullable = false)
//	@GeneratedValue(generator = "SEQ_TQ_BUSINESS_NUM" , strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "SEQ_TQ_BUSINESS_NUM" ,sequenceName = "SEQ_TQ_BUSINESS_NUM",allocationSize = 1)
	public String getBusinessNum(){
		return this.businessNum;
	}
	/**
	 * （标准102001）个人账号
	 * @return grzh
	 */
	@Column(name = "GRZH")
	public String getGrzh(){
		return this.grzh;
	}
	/**
	 * （标准102002）姓名
	 * @return xingming
	 */
	@Column(name = "XINGMING")
	public String getXingming(){
		return this.xingming;
	}
	/**
	 * （标准102007）证件类型
	 * @return zjlx
	 */
	@Column(name = "ZJLX")
	public String getZjlx(){
		return this.zjlx;
	}
	/**
	 * （标准102008）证件号码
	 * @return zjhm
	 */
	@Column(name = "ZJHM")
	public String getZjhm(){
		return this.zjhm;
	}
	/**
	 * 是否销户 1 销户   0 非销户
	 * @return bClose
	 */
	@Column(name = "B_CLOSE")
	public String getBClose(){
		return this.bClose;
	}
	/**
	 * 审批金额
	 * @return approveAmount
	 */
	@Column(name = "APPROVE_AMOUNT")
	public Integer getApproveAmount(){
		return this.approveAmount;
	}
	/**
	 * 审批参考利息
	 * @return approveAccrual
	 */
	@Column(name = "APPROVE_ACCRUAL")
	public Integer getApproveAccrual(){
		return this.approveAccrual;
	}
	/**
	 * 关系
	 * @return relation
	 */
	@Column(name = "RELATION")
	public String getRelation(){
		return this.relation;
	}
	/**
	 * （标准204009）提取方式
	 * @return tqsf
	 */
	@Column(name = "TQSF")
	public String getTqsf(){
		return this.tqsf;
	}
	/**
	 * （标准101002）单位账号
	 * @return dwzh
	 */
	@Column(name = "DWZH")
	public String getDwzh(){
		return this.dwzh;
	}
	/**
	 * （标准101001）单位名称
	 * @return dwmc
	 */
	@Column(name = "DWMC")
	public String getDwmc(){
		return this.dwmc;
	}
	/**
	 * 银行卡卡号
	 * @return cardNum
	 */
	@Column(name = "CARD_NUM")
	public String getCardNum(){
		return this.cardNum;
	}
	/**
	 * 持卡人姓名
	 * @return cardHolderName
	 */
	@Column(name = "CARD_HOLDER_NAME")
	public String getCardHolderName(){
		return this.cardHolderName;
	}
	/**
	 * 银行名称
	 * @return bankName
	 */
	@Column(name = "BANK_NAME")
	public String getBankName(){
		return this.bankName;
	}
	/**
	 * 银行代码
	 * @return bankCode
	 */
	@Column(name = "BANK_CODE")
	public String getBankCode(){
		return this.bankCode;
	}
	/**
	 * （标准203002）个人缴存基数
	 * @return grjcjs
	 */
	@Column(name = "GRJCJS")
	public Integer getGrjcjs(){
		return this.grjcjs;
	}
	/**
	 * 政治面貌
	 * @return politics
	 */
	@Column(name = "POLITICS")
	public String getPolitics(){
		return this.politics;
	}
	/**
	 * （标准102010）婚姻状况
	 * @return hyzk
	 */
	@Column(name = "HYZK")
	public String getHyzk(){
		return this.hyzk;
	}
	/**
	 * 配偶姓名
	 * @return mateXingming
	 */
	@Column(name = "MATE_XINGMING")
	public String getMateXingming(){
		return this.mateXingming;
	}
	/**
	 * 配偶证件类型
	 * @return mateZjlx
	 */
	@Column(name = "MATE_ZJLX")
	public String getMateZjlx(){
		return this.mateZjlx;
	}
	/**
	 * 配偶证件号码
	 * @return mateZjhm
	 */
	@Column(name = "MATE_ZJHM")
	public String getMateZjhm(){
		return this.mateZjhm;
	}
	/**
	 * 委托人姓名
	 * @return agentXingming
	 */
	@Column(name = "AGENT_XINGMING")
	public String getAgentXingming(){
		return this.agentXingming;
	}
	/**
	 * 委托人证件类型
	 * @return agentZjlx
	 */
	@Column(name = "AGENT_ZJLX")
	public String getAgentZjlx(){
		return this.agentZjlx;
	}
	/**
	 * 委托人证件号码
	 * @return agentZjhm
	 */
	@Column(name = "AGENT_ZJHM")
	public String getAgentZjhm(){
		return this.agentZjhm;
	}
	/**
	 * 委托人手机号码
	 * @return agentSjhm
	 */
	@Column(name = "AGENT_SJHM")
	public String getAgentSjhm(){
		return this.agentSjhm;
	}
	/**
	 * 支付顺序
	 * @return payOrder
	 */
	@Column(name = "PAY_ORDER")
	public String getPayOrder(){
		return this.payOrder;
	}
	/**
	 * （标准102006）手机号码
	 * @return sjhm
	 */
	@Column(name = "SJHM")
	public String getSjhm(){
		return this.sjhm;
	}
	/**
	 * （标准202003）发生额
	 * @return fse
	 */
	@Column(name = "FSE")
	public Integer getFse(){
		return this.fse;
	}
	/**
	 * （标准202004）发生利息额
	 * @return fslxe
	 */
	@Column(name = "FSLXE")
	public Integer getFslxe(){
		return this.fslxe;
	}
	/**
	 * 转账状态  1未转账  2转账中  3 转账完成  4转账失败  0 取消转账
	 * @return payStatus
	 */
	@Column(name = "PAY_STATUS")
	public String getPayStatus(){
		return this.payStatus;
	}
	/**
	 * 账号状态  0 新系统   1老系统
	 * @return accountType
	 */
	@Column(name = "ACCOUNT_TYPE")
	public String getAccountType(){
		return this.accountType;
	}
	/**
	 * 创建时间
	 * @return createdTime
	 */
	@Column(name = "CREATED_TIME")
	public Date getCreatedTime(){
		return this.createdTime;
	}
	/**
	 * 创建人ID
	 * @return createdById
	 */
	@Column(name = "CREATED_BY_ID")
	public String getCreatedById(){
		return this.createdById;
	}
	/**
	 * 创建人姓名
	 * @return createdByName
	 */
	@Column(name = "CREATED_BY_NAME")
	public String getCreatedByName(){
		return this.createdByName;
	}
	/**
	 * 最后修改时间
	 * @return lastModifiedTime
	 */
	@Column(name = "LAST_MODIFIED_TIME")
	public Date getLastModifiedTime(){
		return this.lastModifiedTime;
	}
	/**
	 * 最后修改操作员ID
	 * @return lastModifiedById
	 */
	@Column(name = "LAST_MODIFIED_BY_ID")
	public String getLastModifiedById(){
		return this.lastModifiedById;
	}
	/**
	 * 最后修改操作员姓名
	 * @return lastModifiedByName
	 */
	@Column(name = "LAST_MODIFIED_BY_NAME")
	public String getLastModifiedByName(){
		return this.lastModifiedByName;
	}
	/**
	 * 业务流水号
	 * @param lastModifiedTime 业务流水号
	 */
	public void setBusinessNum(String businessNum){
		this.businessNum = businessNum;
	}
	/**
	 * （标准102001）个人账号
	 * @param grzh （标准102001）个人账号
	 */
	public void setGrzh(String grzh){
		this.grzh = grzh;
	}
	/**
	 * （标准102002）姓名
	 * @param xingming （标准102002）姓名
	 */
	public void setXingming(String xingming){
		this.xingming = xingming;
	}
	/**
	 * （标准102007）证件类型
	 * @param zjlx （标准102007）证件类型
	 */
	public void setZjlx(String zjlx){
		this.zjlx = zjlx;
	}
	/**
	 * （标准102008）证件号码
	 * @param zjhm （标准102008）证件号码
	 */
	public void setZjhm(String zjhm){
		this.zjhm = zjhm;
	}
	/**
	 * 是否销户 1 销户   0 非销户
	 * @param bClose 是否销户 1 销户   0 非销户
	 */
	public void setBClose(String bClose){
		this.bClose = bClose;
	}
	/**
	 * 审批金额
	 * @param approveAmount 审批金额
	 */
	public void setApproveAmount(Integer approveAmount){
		this.approveAmount = approveAmount;
	}
	/**
	 * 审批参考利息
	 * @param approveAccrual 审批参考利息
	 */
	public void setApproveAccrual(Integer approveAccrual){
		this.approveAccrual = approveAccrual;
	}
	/**
	 * 关系
	 * @param relation 关系
	 */
	public void setRelation(String relation){
		this.relation = relation;
	}
	/**
	 * （标准204009）提取方式
	 * @param tqsf （标准204009）提取方式
	 */
	public void setTqsf(String tqsf){
		this.tqsf = tqsf;
	}
	/**
	 * （标准101002）单位账号
	 * @param dwzh （标准101002）单位账号
	 */
	public void setDwzh(String dwzh){
		this.dwzh = dwzh;
	}
	/**
	 * （标准101001）单位名称
	 * @param dwmc （标准101001）单位名称
	 */
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	/**
	 * 银行卡卡号
	 * @param cardNum 银行卡卡号
	 */
	public void setCardNum(String cardNum){
		this.cardNum = cardNum;
	}
	/**
	 * 持卡人姓名
	 * @param cardHolderName 持卡人姓名
	 */
	public void setCardHolderName(String cardHolderName){
		this.cardHolderName = cardHolderName;
	}
	/**
	 * 银行名称
	 * @param bankName 银行名称
	 */
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	/**
	 * 银行代码
	 * @param bankCode 银行代码
	 */
	public void setBankCode(String bankCode){
		this.bankCode = bankCode;
	}
	/**
	 * （标准203002）个人缴存基数
	 * @param grjcjs （标准203002）个人缴存基数
	 */
	public void setGrjcjs(Integer grjcjs){
		this.grjcjs = grjcjs;
	}
	/**
	 * 政治面貌
	 * @param politics 政治面貌
	 */
	public void setPolitics(String politics){
		this.politics = politics;
	}
	/**
	 * （标准102010）婚姻状况
	 * @param hyzk （标准102010）婚姻状况
	 */
	public void setHyzk(String hyzk){
		this.hyzk = hyzk;
	}
	/**
	 * 配偶姓名
	 * @param mateXingming 配偶姓名
	 */
	public void setMateXingming(String mateXingming){
		this.mateXingming = mateXingming;
	}
	/**
	 * 配偶证件类型
	 * @param mateZjlx 配偶证件类型
	 */
	public void setMateZjlx(String mateZjlx){
		this.mateZjlx = mateZjlx;
	}
	/**
	 * 配偶证件号码
	 * @param mateZjhm 配偶证件号码
	 */
	public void setMateZjhm(String mateZjhm){
		this.mateZjhm = mateZjhm;
	}
	/**
	 * 委托人姓名
	 * @param agentXingming 委托人姓名
	 */
	public void setAgentXingming(String agentXingming){
		this.agentXingming = agentXingming;
	}
	/**
	 * 委托人证件类型
	 * @param agentZjlx 委托人证件类型
	 */
	public void setAgentZjlx(String agentZjlx){
		this.agentZjlx = agentZjlx;
	}
	/**
	 * 委托人证件号码
	 * @param agentZjhm 委托人证件号码
	 */
	public void setAgentZjhm(String agentZjhm){
		this.agentZjhm = agentZjhm;
	}
	/**
	 * 委托人手机号码
	 * @param agentSjhm 委托人手机号码
	 */
	public void setAgentSjhm(String agentSjhm){
		this.agentSjhm = agentSjhm;
	}
	/**
	 * 支付顺序
	 * @param payOrder 支付顺序
	 */
	public void setPayOrder(String payOrder){
		this.payOrder = payOrder;
	}
	/**
	 * （标准102006）手机号码
	 * @param sjhm （标准102006）手机号码
	 */
	public void setSjhm(String sjhm){
		this.sjhm = sjhm;
	}
	/**
	 * （标准202003）发生额
	 * @param fse （标准202003）发生额
	 */
	public void setFse(Integer fse){
		this.fse = fse;
	}
	/**
	 * （标准202004）发生利息额
	 * @param fslxe （标准202004）发生利息额
	 */
	public void setFslxe(Integer fslxe){
		this.fslxe = fslxe;
	}
	/**
	 * 转账状态  1未转账  2转账中  3 转账完成  4转账失败  0 取消转账
	 * @param payStatus 转账状态  1未转账  2转账中  3 转账完成  4转账失败  0 取消转账
	 */
	public void setPayStatus(String payStatus){
		this.payStatus = payStatus;
	}
	/**
	 * 账号状态  0 新系统   1老系统
	 * @param accountType 账号状态  0 新系统   1老系统
	 */
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}
	/**
	 * 创建时间
	 * @param createdTime 创建时间
	 */
	public void setCreatedTime(Date createdTime){
		this.createdTime = createdTime;
	}
	/**
	 * 创建人ID
	 * @param createdById 创建人ID
	 */
	public void setCreatedById(String createdById){
		this.createdById = createdById;
	}
	/**
	 * 创建人姓名
	 * @param createdByName 创建人姓名
	 */
	public void setCreatedByName(String createdByName){
		this.createdByName = createdByName;
	}
	/**
	 * 最后修改时间
	 * @param lastModifiedTime 最后修改时间
	 */
	public void setLastModifiedTime(Date lastModifiedTime){
		this.lastModifiedTime = lastModifiedTime;
	}
	/**
	 * 最后修改操作员ID
	 * @param lastModifiedById 最后修改操作员ID
	 */
	public void setLastModifiedById(String lastModifiedById){
		this.lastModifiedById = lastModifiedById;
	}
	/**
	 * 最后修改操作员姓名
	 * @param lastModifiedByName 最后修改操作员姓名
	 */
	public void setLastModifiedByName(String lastModifiedByName){
		this.lastModifiedByName = lastModifiedByName;
	}
}
