package shgjj.tqgl.business.onceBusiness.retire.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.util.jpa.BaseJpaDao;
import gov.util.jpa.impl.BaseJpaServiceImpl;
import shgjj.tqgl.business.onceBusiness.retire.bo.RetireBO;
import shgjj.tqgl.business.onceBusiness.retire.dao.RetireDao;
import shgjj.tqgl.business.onceBusiness.retire.service.RetireService;
import shgjj.tqgl.common.constants.BusinessTypeConstants;
import shgjj.tqgl.common.exception.BusinessException;
import shgjj.tqgl.common.util.DateUtil;
import shgjj.tqgl.core.bo.TqYwMainDetailEntity;
import shgjj.tqgl.core.bo.TqYwMainEntity;
import shgjj.tqgl.core.service.YwBusinessService;

/**
 * @author Shenhuali
 * @version 创建时间：2017年8月9日 下午4:14:34 类说明
 */
// @Repository
@Service
public class RetireServiceImpl extends BaseJpaServiceImpl implements RetireService {

	private static final Logger logger = Logger.getLogger(RetireService.class);

	@Autowired
	RetireDao retireDao;
	
	@Autowired
	 private YwBusinessService ywBusinessService ;

	@Override
	public String CheckRetire() {
		logger.info("start CheckRetire !! ");

		return null;
	}

	@Override
	public BaseJpaDao getJpaDao() {
		return retireDao;
	}

	@Override
	public String saveRetireRegister(RetireBO bo) {
		
		String businessType = BusinessTypeConstants.RETIRE;
		String businessNum = ywBusinessService.getBusinessNum(businessType);// 参数为业务类型
		//保存tq_yw_main_detail表
		TqYwMainDetailEntity tqYwMainDetail = new TqYwMainDetailEntity();
		
		tqYwMainDetail.setBusinessNum(businessNum);
		tqYwMainDetail.setGrzh(bo.getTqPersonBasicVO().getGrzh());
		tqYwMainDetail.setZjlx(bo.getTqPersonBasicVO().getZjlx());
		tqYwMainDetail.setZjhm(bo.getTqPersonBasicVO().getZjhm());
		tqYwMainDetail.setXingming(bo.getTqPersonBasicVO().getXingming());
		tqYwMainDetail.setHyzk(bo.getTqPersonBasicVO().getHyzk());
		tqYwMainDetail.setMateZjhm(bo.getTqPersonBasicVO().getMateZjhm());
		tqYwMainDetail.setMateZjlx(bo.getTqPersonBasicVO().getZjlx());
		
		tqYwMainDetail.setRelation(bo.getTqAgentVO().getRelation());
		tqYwMainDetail.setAgentXingming(bo.getTqAgentVO().getAgentXingming());
		tqYwMainDetail.setAgentZjhm(bo.getTqAgentVO().getAgentZjhm());
		tqYwMainDetail.setAgentSjhm(bo.getTqAgentVO().getAgentSjhm());
		
		tqYwMainDetail.setBankName(bo.getTqBankVO().getBankName());
		tqYwMainDetail.setCardNum(bo.getTqBankVO().getCardNum());
		
		retireDao.save(tqYwMainDetail);
		
		
		TqYwMainEntity tqYwMain = new TqYwMainEntity();
		
		tqYwMain.setBusinessNum(businessNum);
		tqYwMain.setBusinessType(businessType);
		tqYwMain.setBusinessSource("11");
		tqYwMain.setAcceptTime(DateUtil.getDateToLongStr());
		tqYwMain.setStatus("0");
		tqYwMain.setOperatorId("admin");
		tqYwMain.setVerifyCfgId(777);
		
		retireDao.save(tqYwMain);
		
		return null;
	}

}
