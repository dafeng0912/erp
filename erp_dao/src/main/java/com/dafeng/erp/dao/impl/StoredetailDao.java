package com.dafeng.erp.dao.impl;
import org.hibernate.criterion.DetachedCriteria;

import com.dafeng.base.dao.impl.BaseDao;
import com.dafeng.erp.dao.IStoredetailDao;
import com.dafeng.erp.entity.Storedetail;
/**
 * 仓库库存数据访问类
 * @author Administrator
 *
 */
public class StoredetailDao extends BaseDao<Storedetail> implements IStoredetailDao {

	/**
	 * 构建查询条件
	 * @param dep1
	 * @param dep2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(Storedetail storedetail1,Storedetail storedetail2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Storedetail.class);
		if(storedetail1!=null){

		}
		return dc;
	}

}
