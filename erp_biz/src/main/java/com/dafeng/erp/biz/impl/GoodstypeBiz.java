package com.dafeng.erp.biz.impl;
import com.dafeng.base.biz.impl.BaseBiz;
import com.dafeng.erp.biz.IGoodstypeBiz;
import com.dafeng.erp.dao.IGoodstypeDao;
import com.dafeng.erp.entity.Goodstype;
/**
 * 商品分类业务逻辑类
 * @author Administrator
 *
 */
public class GoodstypeBiz extends BaseBiz<Goodstype> implements IGoodstypeBiz {

	private IGoodstypeDao goodstypeDao;
	
	public void setGoodstypeDao(IGoodstypeDao goodstypeDao) {
		this.goodstypeDao = goodstypeDao;
		super.setBaseDao(this.goodstypeDao);
	}
	
}
