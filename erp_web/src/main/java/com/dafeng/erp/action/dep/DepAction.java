package com.dafeng.erp.action.dep;

import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IDepBiz;
import com.dafeng.erp.entity.Dep;

/** 
  * @ClassName: DepAction 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月13日 上午10:44:46 
  * @version v1.0 
*/
public class DepAction extends BaseAction<Dep>{
//	属性驱动：条件查询
	private IDepBiz depBiz;

	public void setDepBiz(IDepBiz depBiz) {
		this.depBiz = depBiz;
		super.setBaseBiz(this.depBiz);
	}
	
}
