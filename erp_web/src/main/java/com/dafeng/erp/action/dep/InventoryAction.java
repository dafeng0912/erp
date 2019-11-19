package com.dafeng.erp.action.dep;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IInventoryBiz;
import com.dafeng.erp.entity.Inventory;

/**
 * 盘盈盘亏Action 
 * @author Administrator
 *
 */
public class InventoryAction extends BaseAction<Inventory> {

	private IInventoryBiz inventoryBiz;

	public void setInventoryBiz(IInventoryBiz inventoryBiz) {
		this.inventoryBiz = inventoryBiz;
		super.setBaseBiz(this.inventoryBiz);
	}

}
