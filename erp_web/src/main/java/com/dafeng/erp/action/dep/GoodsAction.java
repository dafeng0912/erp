package com.dafeng.erp.action.dep;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IGoodsBiz;
import com.dafeng.erp.entity.Goods;

/**
 * 商品Action 
 * @author Administrator
 *
 */
public class GoodsAction extends BaseAction<Goods> {

	private IGoodsBiz goodsBiz;

	public void setGoodsBiz(IGoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
		super.setBaseBiz(this.goodsBiz);
	}

}
