package  shgjj.tqgl.sys.bo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;

import gov.util.jpa.entity.ICreateEntity;
import gov.util.jpa.entity.IUpdateEntity;


/**
 *  业务信息明细实体类
 * @author shiyan
 * @date 2017年8月14日 下午6:51:21 
 * @Description: TODO
 *
 */
@Entity
@Table(name = "TQ_SYS_MATERIAL_CFG_DETAIL")
public class TqSysMaterialCfgDetailEntity implements Serializable,ICreateEntity,IUpdateEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final Logger logger = Logger.getLogger(TqSysMaterialCfgDetailEntity.class);
	
	/**
	 * 业务资料配置ID
	 */
//	private Integer materialCfgId;
	/**
	 * 资料ID
	 */
//	private Integer materialId;
	
	@EmbeddedId
	private TqSysMaterialCfgDetailEntityPK id;
	
	/**
	 * 资料名称
	 */
	private String materialName;
	/**
	 * 顺序
	 */
	private Integer listOrder;
	/**
	 * 必须性 1必须  0不需  3 可选
	 */
	private String necessity;
	/**
	 * 影像资料必须性  1必须  0不需  3 可选
	 */
	private String imageNecessity;
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
	
	
	
	
	public TqSysMaterialCfgDetailEntityPK getId() {
		return id;
	}
	public void setId(TqSysMaterialCfgDetailEntityPK id) {
		this.id = id;
	}
	/**
	 * 资料名称
	 * @return materialName
	 */
	@Column(name = "MATERIAL_NAME")
	public String getMaterialName(){
		return this.materialName;
	}
	/**
	 * 顺序
	 * @return listOrder
	 */
	@Column(name = "LIST_ORDER")
	public Integer getListOrder(){
		return this.listOrder;
	}
	/**
	 * 必须性 1必须  0不需  3 可选
	 * @return necessity
	 */
	@Column(name = "NECESSITY")
	public String getNecessity(){
		return this.necessity;
	}
	/**
	 * 影像资料必须性  1必须  0不需  3 可选
	 * @return imageNecessity
	 */
	@Column(name = "IMAGE_NECESSITY")
	public String getImageNecessity(){
		return this.imageNecessity;
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
	 * 资料名称
	 * @param materialName 资料名称
	 */
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}
	/**
	 * 顺序
	 * @param listOrder 顺序
	 */
	public void setListOrder(Integer listOrder){
		this.listOrder = listOrder;
	}
	/**
	 * 必须性 1必须  0不需  3 可选
	 * @param necessity 必须性 1必须  0不需  3 可选
	 */
	public void setNecessity(String necessity){
		this.necessity = necessity;
	}
	/**
	 * 影像资料必须性  1必须  0不需  3 可选
	 * @param imageNecessity 影像资料必须性  1必须  0不需  3 可选
	 */
	public void setImageNecessity(String imageNecessity){
		this.imageNecessity = imageNecessity;
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
