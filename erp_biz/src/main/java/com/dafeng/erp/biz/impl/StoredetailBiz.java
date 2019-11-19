package com.dafeng.erp.biz.impl;
import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.IStoredetailBiz;
import com.dafeng.erp.dao.IStoredetailDao;
import com.dafeng.erp.entity.Storedetail;
/**
 * 仓库库存业务逻辑类
 * @author Administrator
 *
 */
public class StoredetailBiz extends BaseBiz<Storedetail> implements IStoredetailBiz {

	private IStoredetailDao storedetailDao;
	
	public void setStoredetailDao(IStoredetailDao storedetailDao) {
		this.storedetailDao = storedetailDao;
		super.setBaseDao(this.storedetailDao);
	}
	
}
