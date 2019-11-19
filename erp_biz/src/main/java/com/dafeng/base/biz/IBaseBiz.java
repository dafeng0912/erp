package com.dafeng.base.biz;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/** 
  * @ClassName: IBaseBiz 
  * <p>业务描述：</p>
  * @date 2019年11月15日 上午11:36:31 
  * @version v1.0 
*/
public interface IBaseBiz <T>{ 
	
	/**
	 * 新增
	 */
	void save(T t);
	
	/**
	 * 删除
	 */
	void delete(Long uuid);
	
	/**
	 * 更新
	 */
	void update(T t);
	
	/**
	 * 通过编号查询对象
	 */
	T findById(Long uuid);
	
	/**
	 * 计算总记录数
	 */
	public long getCount(T t1,T t2,Object param);
	/**
	 * 条件查询
	 * @param t1
	 * @return
	 */
	List<T> getList(T t1,T t2,Object param);
	
	/**
	 * 分页查询
	 */
	List<T> getListByPage(T t1,T t2,Object param,int firstResult, int maxResults);
	
}
