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
public interface IBaseDao<T> {
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
	public void delete(Long uuid);
	
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
	public Long findCount(T t1,T t2,Object param);
	
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
	public List<T> findByPage(T t1,T t2,Object param,Integer begin,Integer pageSize);
	
	/**
	  * @Title: getList 
	  * @Description: 条件查询
	  * @return   List<T>    
	  * @author  大风
	  * @data  2019年11月15日
	  * @version v1.0
	 */
	public List<T> getList(T t1,T t2,Object param);
	
	/**
	  * @Title: getListByPage 
	  * @Description: 条件查询分页查找
	  * @param t1	泛型，用户自己设置
	  * @param t2	备用，时间相减的情况下
	  * @param param
	  * @param firstResult
	  * @param maxResults
	  * @return  List<T>    
	  * @author  大风
	  * @data  2019年11月15日
	  * @version v1.0
	 */
	public List<T> getListByPage(T t1,T t2,Object param,int firstResult, int maxResults);
	
	/**
	  * @Title: getDetachedCriteria 
	  * @Description: 子类实现 
	  * @param t1
	  * @param t2
	  * @param param
	  * @return DetachedCriteria    
	  * @author  大风
	  * @data  2019年11月15日
	  * @version v1.0
	 */
	public DetachedCriteria getDetachedCriteria(T t1, T t2, Object param);
}
