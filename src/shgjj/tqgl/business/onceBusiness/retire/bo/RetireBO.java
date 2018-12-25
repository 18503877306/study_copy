package shgjj.tqgl.business.onceBusiness.retire.bo;

import shgjj.tqgl.core.vo.TqAgentVO;
import shgjj.tqgl.core.vo.TqBankVO;
import shgjj.tqgl.core.vo.TqPersonBasicVO;

/**
 * 
 * <p>Description:退休业务 bo </p>
 * @author Lvxin
 * @date 2017年8月15日下午3:27:00
 *
 */
public class RetireBO {
	private TqPersonBasicVO tqPersonBasicVO;
	private TqAgentVO tqAgentVO;
	private TqBankVO tqBankVO;
	public TqPersonBasicVO getTqPersonBasicVO() {
		return tqPersonBasicVO;
	}
	public void setTqPersonBasicVO(TqPersonBasicVO tqPersonBasicVO) {
		this.tqPersonBasicVO = tqPersonBasicVO;
	}
	public TqAgentVO getTqAgentVO() {
		return tqAgentVO;
	}
	public void setTqAgentVO(TqAgentVO tqAgentVO) {
		this.tqAgentVO = tqAgentVO;
	}
	public TqBankVO getTqBankVO() {
		return tqBankVO;
	}
	public void setTqBankVO(TqBankVO tqBankVO) {
		this.tqBankVO = tqBankVO;
	}
	
	
	
}
