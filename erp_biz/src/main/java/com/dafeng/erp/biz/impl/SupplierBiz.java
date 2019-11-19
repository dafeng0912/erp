package com.dafeng.erp.biz.impl;
import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.ISupplierBiz;
import com.dafeng.erp.dao.ISupplierDao;
import com.dafeng.erp.entity.Supplier;
/**
 * 供应商业务逻辑类
 * @author Administrator
 *
 */
public class SupplierBiz extends BaseBiz<Supplier> implements ISupplierBiz {

	private ISupplierDao supplierDao;
	
	public void setSupplierDao(ISupplierDao supplierDao) {
		this.supplierDao = supplierDao;
		super.setBaseDao(this.supplierDao);
	}
	
}
