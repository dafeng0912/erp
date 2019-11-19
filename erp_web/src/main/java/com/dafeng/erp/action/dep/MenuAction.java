package com.dafeng.erp.action.dep;
import com.alibaba.fastjson.JSON;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IMenuBiz;
import com.dafeng.erp.entity.Menu;

/**
 * 菜单Action 
 * @author Administrator
 *
 */
public class MenuAction extends BaseAction<Menu> {

	private IMenuBiz menuBiz;

	public void setMenuBiz(IMenuBiz menuBiz) {
		this.menuBiz = menuBiz;
		super.setBaseBiz(this.menuBiz);
	}
	
	/**
	 * 获取菜单数据
	 */
	public void getMenuTree(){
		//通过获取主菜单，自关联就会带其下所有的菜单
		Menu menu = menuBiz.findById(Long.valueOf("0"));
		write(JSON.toJSONString(menu));
	}

}
