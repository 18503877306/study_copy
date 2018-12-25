package  shgjj.tqgl.sys.bo;

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
import org.springframework.format.annotation.DateTimeFormat;

import gov.util.jpa.entity.ICreateEntity;
import gov.util.jpa.entity.IUpdateEntity;


/**
 * 
 * @author shiyan
 * @date 2017年8月10日 下午5:44:44 
 * @Description: 业务资料配置
 *
 */
@Entity
@Table(name = "TQ_SYS_MATERIAL_CFG")
public class TqSysMaterialCfgEntity implements Serializable,ICreateEntity,IUpdateEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final Logger logger = Logger.getLogger(TqSysMaterialCfgEntity.class);
	
	/**
	 * 业务资料配置ID
	 */
	private Integer materialCfgId;
	/**
	 * 业务资料配置名称
	 */
	private String materialCfgName;
	/**
	 * 状态 0正常 1 失效  2 未生效
	 */
	private String status;
	/**
	 * 业务类型
	 */
	private String businessType;
	/**
	 * 业务明细类型
	 */
	private String businessTypeDetail;
	/**
	 * 配置说明
	 */
	private String remark;
	/**
	 * 生效时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date effectTime;
	/**
	 * 失效时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deadTime;
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
	 * @return materialCfgId
	 */
	@Id
	@Column(name = "MATERIAL_CFG_ID" ,unique = true ,nullable = false)
	@GeneratedValue(generator = "SEQ_TQ_MATERIAL_CFG_ID" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_TQ_MATERIAL_CFG_ID" ,sequenceName = "SEQ_TQ_MATERIAL_CFG_ID",allocationSize = 1)
	public Integer getMaterialCfgId(){
		return this.materialCfgId;
	}
	/**
	 * 业务资料配置名称
	 * @return materialCfgName
	 */
	@Column(name = "MATERIAL_CFG_NAME")
	public String getMaterialCfgName(){
		return this.materialCfgName;
	}
	/**
	 * 状态 0正常 1 失效  2 未生效
	 * @return status
	 */
	@Column(name = "STATUS")
	public String getStatus(){
		return this.status;
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
	 * 配置说明
	 * @return remark
	 */
	@Column(name = "REMARK")
	public String getRemark(){
		return this.remark;
	}
	/**
	 * 生效时间
	 * @return effectTime
	 */
	@Column(name = "EFFECT_TIME")
	public Date getEffectTime(){
		return this.effectTime;
	}
	/**
	 * 失效时间
	 * @return deadTime
	 */
	@Column(name = "DEAD_TIME")
	public Date getDeadTime(){
		return this.deadTime;
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
	 * @param materialCfgId 业务资料配置ID
	 */
	public void setMaterialCfgId(Integer materialCfgId){
		this.materialCfgId = materialCfgId;
	}
	/**
	 * 业务资料配置名称
	 * @param materialCfgName 业务资料配置名称
	 */
	public void setMaterialCfgName(String materialCfgName){
		this.materialCfgName = materialCfgName;
	}
	/**
	 * 状态 0正常 1 失效  2 未生效
	 * @param status 状态 0正常 1 失效  2 未生效
	 */
	public void setStatus(String status){
		this.status = status;
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
	 * 配置说明
	 * @param remark 配置说明
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 * 生效时间
	 * @param effectTime 生效时间
	 */
	public void setEffectTime(Date effectTime){
		this.effectTime = effectTime;
	}
	/**
	 * 失效时间
	 * @param deadTime 失效时间
	 */
	public void setDeadTime(Date deadTime){
		this.deadTime = deadTime;
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
