package shgjj.tqgl.common.constants; 
/** 
* @author Shenhuali
* @version 创建时间：2017年8月18日 上午12:50:25 
* 类说明 
*/
public enum BusinessErrorCodeConstants {
	
    /**[err001]对象为空    */
    NULL_OBJ("err001","对象为空"),
    ERROR_ADD_USER("err002","添加用户失败"),
    UNKNOWN_ERROR("err999","系统繁忙，请稍后再试....");
	
	
	
	

    private String code;
    private String desc;

    private BusinessErrorCodeConstants(String code, String desc) {
        this.setcode(code);
        this.setDesc(desc);
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.desc;
    }

}
