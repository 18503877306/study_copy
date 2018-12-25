package  shgjj.tqgl.sys.bo;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>Title: TqSysVerifyCfgDetailEntity类/p>
 * <p>Description: Entity for TQ_SYS_VERIFY_CFG_DETAIL</p>
 * @author Auto generated
 * @version 0.5
 */
@Entity
@Table(name = "TQ_SYS_VERIFY_CFG_DETAIL")
public class TqSysVerifyCfgDetailEntity implements Serializable{

	public static final Logger logger = Logger.getLogger(TqSysVerifyCfgDetailEntity.class);
	
	/**
	 * 业务资料配置ID
	 */
	private Integer verifyCfgId;
	/**
	 * 验证项ID
	 */
	private Integer verifyId;
	/**
	 * 验证项名称
	 */
	private String verifyName;
	/**
	 * 验证项代码
	 */
	private String verifyCode;
	/**
	 * 验证项类型
10 基础
20 业务
30 外联
	 */
	private String verifyType;
	/**
	 * 验证参数值
	 */
	private String paraValue;
	/**
	 * 顺序，暂定只是显示用
	 */
	private Integer listOrder;
	/**
	 * 状态
	 */
	private String status;
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
	 * 业务资料配置ID
	 * @return verifyCfgId
	 */
	@Id
	@Column(name = "VERIFY_CFG_ID" ,unique = true ,nullable = false)
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator" ,strategy = "uuid")
	public Integer getVerifyCfgId(){
		return this.verifyCfgId;
	}
	/**
	 * 验证项ID
	 * @return verifyId
	 */
	@Column(name = "VERIFY_ID")
	public Integer getVerifyId(){
		return this.verifyId;
	}
	/**
	 * 验证项名称
	 * @return verifyName
	 */
	@Column(name = "VERIFY_NAME")
	public String getVerifyName(){
		return this.verifyName;
	}
	/**
	 * 验证项代码
	 * @return verifyCode
	 */
	@Column(name = "VERIFY_CODE")
	public String getVerifyCode(){
		return this.verifyCode;
	}
	/**
	 * 验证项类型
10 基础
20 业务
30 外联
	 * @return verifyType
	 */
	@Column(name = "VERIFY_TYPE")
	public String getVerifyType(){
		return this.verifyType;
	}
	/**
	 * 验证参数值
	 * @return paraValue
	 */
	@Column(name = "PARA_VALUE")
	public String getParaValue(){
		return this.paraValue;
	}
	/**
	 * 顺序，暂定只是显示用
	 * @return listOrder
	 */
	@Column(name = "LIST_ORDER")
	public Integer getListOrder(){
		return this.listOrder;
	}
	/**
	 * 状态
	 * @return status
	 */
	@Column(name = "STATUS")
	public String getStatus(){
		return this.status;
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
	 * 业务资料配置ID
	 * @param verifyCfgId 业务资料配置ID
	 */
	public void setVerifyCfgId(Integer verifyCfgId){
		this.verifyCfgId = verifyCfgId;
	}
	/**
	 * 验证项ID
	 * @param verifyId 验证项ID
	 */
	public void setVerifyId(Integer verifyId){
		this.verifyId = verifyId;
	}
	/**
	 * 验证项名称
	 * @param verifyName 验证项名称
	 */
	public void setVerifyName(String verifyName){
		this.verifyName = verifyName;
	}
	/**
	 * 验证项代码
	 * @param verifyCode 验证项代码
	 */
	public void setVerifyCode(String verifyCode){
		this.verifyCode = verifyCode;
	}
	/**
	 * 验证项类型
10 基础
20 业务
30 外联
	 * @param verifyType 验证项类型
10 基础
20 业务
30 外联
	 */
	public void setVerifyType(String verifyType){
		this.verifyType = verifyType;
	}
	/**
	 * 验证参数值
	 * @param paraValue 验证参数值
	 */
	public void setParaValue(String paraValue){
		this.paraValue = paraValue;
	}
	/**
	 * 顺序，暂定只是显示用
	 * @param listOrder 顺序，暂定只是显示用
	 */
	public void setListOrder(Integer listOrder){
		this.listOrder = listOrder;
	}
	/**
	 * 状态
	 * @param status 状态
	 */
	public void setStatus(String status){
		this.status = status;
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
