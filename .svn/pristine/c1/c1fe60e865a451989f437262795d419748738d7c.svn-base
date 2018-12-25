package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TQ_YW_TQHD_DETAIL database table.
 * 
 */
@Table(name="TQ_YW_TQHD_DETAIL")
@NamedQuery(name="TqYwTqhdDetailEntity.findAll", query="SELECT t FROM TqYwTqhdDetailEntity t")
public class TqYwTqhdDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TqYwTqhdDetailEntityPK id;

	@Column(name="CERTIFICATE_NUM")
	private String certificateNum;

	@Column(name="CERTIFICATE_TYPE")
	private String certificateType;

	@Column(name="CREATED_BY_ID")
	private String createdById;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	private String jkrxm;

	private BigDecimal jkrzjh;

	@Column(name="LAST_MODIFIED_BY_ID")
	private String lastModifiedById;

	@Column(name="LAST_MODIFIED_BY_NAME")
	private String lastModifiedByName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MODIFIED_TIME")
	private Date lastModifiedTime;

	@Column(name="TQ_STATUS")
	private String tqStatus;

	public TqYwTqhdDetailEntity() {
	}

	public TqYwTqhdDetailEntityPK getId() {
		return this.id;
	}

	public void setId(TqYwTqhdDetailEntityPK id) {
		this.id = id;
	}

	public String getCertificateNum() {
		return this.certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
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

	public String getJkrxm() {
		return this.jkrxm;
	}

	public void setJkrxm(String jkrxm) {
		this.jkrxm = jkrxm;
	}

	public BigDecimal getJkrzjh() {
		return this.jkrzjh;
	}

	public void setJkrzjh(BigDecimal jkrzjh) {
		this.jkrzjh = jkrzjh;
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

	public String getTqStatus() {
		return this.tqStatus;
	}

	public void setTqStatus(String tqStatus) {
		this.tqStatus = tqStatus;
	}

}