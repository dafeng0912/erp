package com.dafeng.erp.biz.impl;
import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.IRoleBiz;
import com.dafeng.erp.dao.IRoleDao;
import com.dafeng.erp.entity.Role;
/**
 * 角色业务逻辑类
 * @author Administrator
 *
 */
public class RoleBiz extends BaseBiz<Role> implements IRoleBiz {

	private IRoleDao roleDao;
	
	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
		super.setBaseDao(this.roleDao);
	}
	
}
