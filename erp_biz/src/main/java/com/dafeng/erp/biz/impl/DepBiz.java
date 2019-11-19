package com.dafeng.erp.biz.impl;

import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.IDepBiz;
import com.dafeng.erp.dao.IDepDao;
import com.dafeng.erp.entity.Dep;

/** 
  * @ClassName: DepBiz 
  * @author 大风
  * @date 2019年11月13日 上午10:39:03 
  * @version v1.0 
*/
public class DepBiz extends BaseBiz<Dep> implements IDepBiz {
	
	private IDepDao depDao;
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
		super.setBaseDao(this.depDao);
	}

}
