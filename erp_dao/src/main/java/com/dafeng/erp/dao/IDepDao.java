package com.dafeng.erp.dao;

import java.util.List;

import com.dafeng.base.dao.IBaseDao;
import com.dafeng.erp.entity.Dep;

public interface IDepDao extends IBaseDao<Dep> {
	
	List<Dep> getList(Dep dep, int firstResult, int rows);
}
