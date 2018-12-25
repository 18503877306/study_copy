package shgjj.tqgl.core.service;

import java.util.Map;

import gov.util.jpa.BaseJpaService;
import shgjj.tqgl.core.vo.TqPersonBasicVO;

/** 
* @author Shenhuali
* @version 创建时间：2017年8月9日 下午4:43:47 
* 
*/
public interface YwBusinessService extends BaseJpaService {
	
	/**
	 *  生成序列  
	 * @param 业务类型
	 * @return 业务编号
	 */
	public String getBusinessNum(String businessType);
	
	
	/**
	 * 根据业务类型校验业务
	 * @param businessType
	 * @return 校验结果
	 */
	public Map<String,Object>checkBusinessPersonBasic(TqPersonBasicVO tqPersonBasicVO,
			String businessType,String businessTypeDetail);
	
	
	
}
