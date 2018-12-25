package shgjj.tqgl.core.bo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TQ_YW_FAMILY_SALARY database table.
 * 
 */
@Table(name="TQ_YW_FAMILY_SALARY")
@NamedQuery(name="TqYwFamilySalaryEntity.findAll", query="SELECT t FROM TqYwFamilySalaryEntity t")
public class TqYwFamilySalaryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TqYwFamilySalaryEntityPK id;

	private BigDecimal grjcjs;

	private String grzh;

	private String xingming;

	private String zjlx;

	public TqYwFamilySalaryEntity() {
	}

	public TqYwFamilySalaryEntityPK getId() {
		return this.id;
	}

	public void setId(TqYwFamilySalaryEntityPK id) {
		this.id = id;
	}

	public BigDecimal getGrjcjs() {
		return this.grjcjs;
	}

	public void setGrjcjs(BigDecimal grjcjs) {
		this.grjcjs = grjcjs;
	}

	public String getGrzh() {
		return this.grzh;
	}

	public void setGrzh(String grzh) {
		this.grzh = grzh;
	}

	public String getXingming() {
		return this.xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public String getZjlx() {
		return this.zjlx;
	}

	public void setZjlx(String zjlx) {
		this.zjlx = zjlx;
	}

}