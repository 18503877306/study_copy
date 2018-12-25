package shgjj.tqgl.core.vo;

/**
 * 
 * <p>Description: 人员银行卡和联系电话信息VO</p>
 * @author Lvxin
 * @date 2017年8月15日下午5:03:54
 *
 */
public class TqBankVO {
	
	private String cardNum;
	private String bankName;
	private String cardHolderName;
	private String bankCode;
	private String sjhm;
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getSjhm() {
		return sjhm;
	}
	public void setSjhm(String sjhm) {
		this.sjhm = sjhm;
	}
	
	
}
