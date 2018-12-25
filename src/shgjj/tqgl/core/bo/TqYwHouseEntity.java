package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TQ_YW_HOUSE database table.
 * 
 */
@Table(name="TQ_YW_HOUSE")
@NamedQuery(name="TqYwHouseEntity.findAll", query="SELECT t FROM TqYwHouseEntity t")
public class TqYwHouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 业务编号
	 */
	@Id
	@Column(name="BUSINESS_NUM")
	private String businessNum;

	private String allrealname;

	@Column(name="BUSINESS_TYPE")
	private String businessType;

	@Column(name="BUSINESS_TYPE_DETAIL")
	private String businessTypeDetail;

	@Column(name="CERTIFICATE_DIHAO")
	private String certificateDihao;

	@Column(name="CERTIFICATE_DISTRICT")
	private String certificateDistrict;

	@Column(name="CERTIFICATE_NUM")
	private String certificateNum;

	@Column(name="CERTIFICATE_PROVINCE")
	private String certificateProvince;

	@Column(name="CERTIFICATE_TYPE")
	private String certificateType;

	@Column(name="CERTIFICATE_YEAR")
	private String certificateYear;

	@Column(name="CITY_CODE")
	private String cityCode;

	@Column(name="CITY_NAME")
	private String cityName;

	@Column(name="CREATED_BY_ID")
	private String createdById;

	@Column(name="CREATED_BY_NAME")
	private String createdByName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DISTRICT_CODE")
	private String districtCode;

	@Column(name="DISTRICT_NAME")
	private String districtName;

	@Column(name="DJ_NUM")
	private String djNum;

	private BigDecimal fwjzmj;

	private BigDecimal fwtnmj;

	private String fwxz;

	private BigDecimal fwzj;

	private String fwzl;

	@Column(name="HOLDER_CERTTYPE")
	private String holderCerttype;

	@Column(name="HOUSE_ADDRESS")
	private String houseAddress;

	@Column(name="HOUSE_NUM")
	private String houseNum;

	private String ischecked;

	private String ispermittee;

	@Column(name="LAST_MODIFIED_BY_ID")
	private String lastModifiedById;

	@Column(name="LAST_MODIFIED_BY_NAME")
	private String lastModifiedByName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MODIFIED_TIME")
	private Date lastModifiedTime;

	private String memo;

	private String passdate;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	@Column(name="PROVINCE_NAME")
	private String provinceName;

	@Column(name="REAL_NAME")
	private String realName;

	@Column(name="REALNAME_ZJHM")
	private String realnameZjhm;

	private String remark;

	private String serialno;

	@Column(name="START_DATE")
	private String startDate;

	private String status;

	private String usetime;

	public TqYwHouseEntity() {
	}

	public String getBusinessNum() {
		return this.businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getAllrealname() {
		return this.allrealname;
	}

	public void setAllrealname(String allrealname) {
		this.allrealname = allrealname;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBusinessTypeDetail() {
		return this.businessTypeDetail;
	}

	public void setBusinessTypeDetail(String businessTypeDetail) {
		this.businessTypeDetail = businessTypeDetail;
	}

	public String getCertificateDihao() {
		return this.certificateDihao;
	}

	public void setCertificateDihao(String certificateDihao) {
		this.certificateDihao = certificateDihao;
	}

	public String getCertificateDistrict() {
		return this.certificateDistrict;
	}

	public void setCertificateDistrict(String certificateDistrict) {
		this.certificateDistrict = certificateDistrict;
	}

	public String getCertificateNum() {
		return this.certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	public String getCertificateProvince() {
		return this.certificateProvince;
	}

	public void setCertificateProvince(String certificateProvince) {
		this.certificateProvince = certificateProvince;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateYear() {
		return this.certificateYear;
	}

	public void setCertificateYear(String certificateYear) {
		this.certificateYear = certificateYear;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDjNum() {
		return this.djNum;
	}

	public void setDjNum(String djNum) {
		this.djNum = djNum;
	}

	public BigDecimal getFwjzmj() {
		return this.fwjzmj;
	}

	public void setFwjzmj(BigDecimal fwjzmj) {
		this.fwjzmj = fwjzmj;
	}

	public BigDecimal getFwtnmj() {
		return this.fwtnmj;
	}

	public void setFwtnmj(BigDecimal fwtnmj) {
		this.fwtnmj = fwtnmj;
	}

	public String getFwxz() {
		return this.fwxz;
	}

	public void setFwxz(String fwxz) {
		this.fwxz = fwxz;
	}

	public BigDecimal getFwzj() {
		return this.fwzj;
	}

	public void setFwzj(BigDecimal fwzj) {
		this.fwzj = fwzj;
	}

	public String getFwzl() {
		return this.fwzl;
	}

	public void setFwzl(String fwzl) {
		this.fwzl = fwzl;
	}

	public String getHolderCerttype() {
		return this.holderCerttype;
	}

	public void setHolderCerttype(String holderCerttype) {
		this.holderCerttype = holderCerttype;
	}

	public String getHouseAddress() {
		return this.houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getHouseNum() {
		return this.houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getIschecked() {
		return this.ischecked;
	}

	public void setIschecked(String ischecked) {
		this.ischecked = ischecked;
	}

	public String getIspermittee() {
		return this.ispermittee;
	}

	public void setIspermittee(String ispermittee) {
		this.ispermittee = ispermittee;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPassdate() {
		return this.passdate;
	}

	public void setPassdate(String passdate) {
		this.passdate = passdate;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRealnameZjhm() {
		return this.realnameZjhm;
	}

	public void setRealnameZjhm(String realnameZjhm) {
		this.realnameZjhm = realnameZjhm;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSerialno() {
		return this.serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsetime() {
		return this.usetime;
	}

	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}

}