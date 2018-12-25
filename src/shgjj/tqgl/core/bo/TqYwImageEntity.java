package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TQ_YW_IMAGE database table.
 * 
 */
@Table(name="TQ_YW_IMAGE")
@NamedQuery(name="TqYwImageEntity.findAll", query="SELECT t FROM TqYwImageEntity t")
public class TqYwImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IMAGE_ID")
	private long imageId;

	@Column(name="BUSINESS_NUM")
	private String businessNum;

	@Column(name="CREATED_BY_ID")
	private String createdById;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="LAST_MODIFIED_BY_ID")
	private String lastModifiedById;

	@Column(name="LAST_MODIFIED_BY_NAME")
	private String lastModifiedByName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MODIFIED_TIME")
	private Date lastModifiedTime;

	@Column(name="MATERIAL_ID")
	private BigDecimal materialId;

	@Column(name="MATERIAL_NAME")
	private String materialName;

	@Temporal(TemporalType.DATE)
	@Column(name="SYNC_TIME")
	private Date syncTime;

	@Column(name="YXXT_IMAGE_ID")
	private BigDecimal yxxtImageId;

	public TqYwImageEntity() {
	}

	public long getImageId() {
		return this.imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	public String getBusinessNum() {
		return this.businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
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

	public BigDecimal getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(BigDecimal materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public Date getSyncTime() {
		return this.syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public BigDecimal getYxxtImageId() {
		return this.yxxtImageId;
	}

	public void setYxxtImageId(BigDecimal yxxtImageId) {
		this.yxxtImageId = yxxtImageId;
	}

}