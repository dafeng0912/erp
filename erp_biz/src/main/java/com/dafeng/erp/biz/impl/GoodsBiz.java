package com.dafeng.erp.biz.impl;
import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.IGoodsBiz;
import com.dafeng.erp.dao.IGoodsDao;
import com.dafeng.erp.entity.Goods;
/**
 * 商品业务逻辑类
 * @author Administrator
 *
 */
public class GoodsBiz extends BaseBiz<Goods> implements IGoodsBiz {

	private IGoodsDao goodsDao;
	
	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
		super.setBaseDao(this.goodsDao);
	}
	
}
