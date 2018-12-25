package shgjj.tqgl.core.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.util.jpa.BaseJpaDao;
import gov.util.jpa.Query;
import gov.util.jpa.impl.BaseJpaServiceImpl;
import gov.util.jpa.operator.FilterOperator;
import shgjj.tqgl.common.constants.SystemConstants;
import shgjj.tqgl.core.dao.YwBusinessDao;
import shgjj.tqgl.core.service.YwBusinessService;
import shgjj.tqgl.core.vo.TqPersonBasicVO;
import shgjj.tqgl.sys.bo.TqSysVerifyCfgDetailEntity;

/**
 * 
 * @author Lvxin
 * @date 2017年8月15日下午3:03:09
 *
 */
@Service
public class YwBusinessServiceImpl extends BaseJpaServiceImpl implements YwBusinessService {

	@Autowired
	YwBusinessDao ywBusinessDao;

	@Override
	public BaseJpaDao getJpaDao() {
		return ywBusinessDao;
	}

	public String getBusinessNum(String businessType) {
		String sql = "select to_char(sysdate,'yyyyMMddhhmmss')||substr(SEQ_TQ_BUSINESS_NUM.NEXTVAL,-6) businessNum from dual";
		// TODO 异常处理
		List<?> list = ywBusinessDao.executeSqlQuery(sql, null);
		logger.info(list.get(0));
		Map<Object, Object> map = (Map<Object, Object>) list.get(0);

		// TODO 序列= 固定12+时间yyyyMMddhhmmss14+业务类型2+序号6\
		return SystemConstants.TQ_SYSTEM_CODE + businessType + map.get("BUSINESSNUM");
	}



	@Override
	public Map<String, Object> checkBusinessPersonBasic(TqPersonBasicVO tqPersonBasicVO, String businessType,
			String businessTypeDetail) {
		
		//获取该类业务验证 , 查询所有有效的该类业务验证。
		//明细类型指定的情况下，需要查询 明细类型为null及指定值
		
		//ywBusinessDao.
		
		  
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
