package com.dafeng.erp.action.dep;
import com.dafeng.erp.action.bash.BaseAction;
import com.dafeng.erp.biz.IGoodstypeBiz;
import com.dafeng.erp.entity.Goodstype;

/**
 * 商品分类Action 
 * @author Administrator
 *
 */
public class GoodstypeAction extends BaseAction<Goodstype> {

	private IGoodstypeBiz goodstypeBiz;

	public void setGoodstypeBiz(IGoodstypeBiz goodstypeBiz) {
		this.goodstypeBiz = goodstypeBiz;
		super.setBaseBiz(this.goodstypeBiz);
	}

}
