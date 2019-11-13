package com.dafeng.erp.biz.impl;

import java.util.List;

import com.dafeng.erp.biz.IDepBiz;
import com.dafeng.erp.dao.IDepDao;
import com.dafeng.erp.entity.Dep;

/** 
  * @ClassName: DepBiz 
  * @author 大风
  * @date 2019年11月13日 上午10:39:03 
  * @version v1.0 
*/
public class DepBiz implements IDepBiz {
	
	private IDepDao depDao;
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}


	public List<Dep> findAll() {
		return depDao.findAll();
	}


	public List<Dep> getList(Dep dep) {
		return depDao.getList(dep);
	}

}
