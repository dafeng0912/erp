package com.dafeng.base.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/** 
  * @ClassName: BaseDao 
  * <p>业务描述：抽取dao</p>
  * @author 大风
  * @date 2019年11月13日 上午8:57:16 
  * @version v1.0 
*/
public interface BaseDao<T> {
	/**
	 * 
	  * @Title: save 
	  * @Description: 增加
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public void save(T t);
	
	/**
	 * 
	  * @Title: update 
	  * @Description:更新
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public void update(T t);
	
	/**
	 * 
	  * @Title: delete 
	  * @Description:	删除
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public void delete(T t);
	
	/**
	  * @Title: findById 
	  * @Description: 根据ID查找
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public T findById(Serializable id);
	
	/**
	  * @Title: findAll 
	  * @Description:查询所有
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public List<T> findAll();
	
	/**
	  * @Title: findCount 
	  * @Description: 统计个数
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public Integer findCount(DetachedCriteria detachedCriteria);
	
	/**
	  * @Title: findByPage 
	  * @Description: 分页查询的方法:
	  * @param detachedCriteria
	  * @param begin
	  * @param pageSize
	  * @author  大风
	  * @data  2019年11月13日
	  * @version v1.0
	 */
	public List<T> findByPage(DetachedCriteria detachedCriteria,Integer begin,Integer pageSize);
}
