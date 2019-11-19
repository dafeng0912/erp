package com.dafeng.erp.action.dep;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IRoleBiz;
import com.dafeng.erp.entity.Role;

/**
 * 角色Action 
 * @author Administrator
 *
 */
public class RoleAction extends BaseAction<Role> {

	private IRoleBiz roleBiz;

	public void setRoleBiz(IRoleBiz roleBiz) {
		this.roleBiz = roleBiz;
		super.setBaseBiz(this.roleBiz);
	}

}
