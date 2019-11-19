package com.dafeng.base.biz.impl;

import java.util.List;

import com.dafeng.base.biz.IBaseBiz;
import com.dafeng.base.dao.IBaseDao;

/** 
  * @ClassName: BaseBiz 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月15日 上午11:37:10 
  * @version v1.0 
*/
public class BaseBiz<T>  implements IBaseBiz<T>  {

	/** 数据访问注入*/
	private IBaseDao<T> baseDao;

	public void setBaseDao(IBaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}
	
	/**
	 * 更新
	 */
	public void update(T t){
		baseDao.update(t);
	}
	
	/**
	 * 	保存
	 */
	public void save(T t) {
		baseDao.save(t);
	}

	/**
	 * 删除
	 */
	public void delete(Long uuid){
		baseDao.delete(uuid);
	}
	
	/**
	 * 条件查询
	 */
	public List<T> getList(T t1,T t2,Object param){
		return baseDao.getList(t1,t2,param);
	}
	
	/**
	 * 条件查询
	 * @param t1
	 * @return
	 */
	public List<T> getListByPage(T t1,T t2,Object param,int firstResult, int maxResults){
		return baseDao.getListByPage(t1,t2,param,firstResult, maxResults);
	}

	public long getCount(T t1,T t2,Object param) {
		return baseDao.findCount(t1,t2,param);
	}

	/**
	 * 通过编号查询对象
	 * @param uuid
	 * @return
	 */
	public T findById(Long uuid){
		return baseDao.findById(uuid);
	}
}
