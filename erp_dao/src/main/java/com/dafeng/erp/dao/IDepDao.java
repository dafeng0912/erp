package com.dafeng.erp.dao;

import java.util.List;

import com.dafeng.base.dao.BaseDao;
import com.dafeng.erp.entity.Dep;

public interface IDepDao extends BaseDao<Dep> {
	
	List<Dep> getList(Dep dep);
}
