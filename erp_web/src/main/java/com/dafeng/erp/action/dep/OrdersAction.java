package com.dafeng.erp.action.dep;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IOrdersBiz;
import com.dafeng.erp.entity.Orders;

/**
 * 订单Action 
 * @author Administrator
 *
 */
public class OrdersAction extends BaseAction<Orders> {

	private IOrdersBiz ordersBiz;

	public void setOrdersBiz(IOrdersBiz ordersBiz) {
		this.ordersBiz = ordersBiz;
		super.setBaseBiz(this.ordersBiz);
	}

}
