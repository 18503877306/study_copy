package shgjj.tqgl.common.exception;





/**
 * 自定义系统业务异常
 * @author Shenhuali
 *
 */
public class BusinessException extends RuntimeException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 600254647604890969L;
	
	private String code;    
    
    public BusinessException() {    
        super();    
    }    
    
    public BusinessException(String message) {    
        super(message);    
    }    
    
    public BusinessException(String code, String message) {    
        super(message);    
        this.code = code;    
    }    
    
    public BusinessException(Throwable cause) {    
        super(cause);    
    }    
    
    public BusinessException(String message, Throwable cause) {    
        super(message, cause);    
    }    
    
    public BusinessException(String code, String message, Throwable cause) {    
        super(message, cause);    
        this.code = code;    
    }    
    
    
    public BusinessException(Object Obj) {    
        super(Obj.toString());    
    }  
    
    public BusinessException(Object Obj, Throwable cause) {    
        super(Obj.toString(), cause);    
    } 
    
    
    public String getCode() {    
        return code;    
    }    
    
    public void setCode(String code) {    
        this.code = code;    
    }    
    
}    
   


