package com.dafeng.base.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.dafeng.base.dao.IBaseDao;

/**
  * @ClassName: BaseDaoImpl 
  * <p>业务描述：通用Dao实现类 </p>
  * @author 大风
  * @date 2019年11月13日 上午9:04:33 
  * @version v1.0
  * @param <T>
 */
public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {
	
	private Class clazz;

	// 提供构造方法：在构造方法中传入具体类型的class
	/**
	 * 不想子类上有构造方法，必须在父类中提供无参数的构造，在无参构造中获得具体类型的Class。
	 * 具体类型的Class是参数类型中的实际类型参数。
	 */
	public BaseDao() {
		// 反射：第一步获得Class
		Class clazz = this.getClass();// 正在被调用那个类的Class,CustomerDaoImpl或者LinkManDaoImpl。
		// 查看JDK的API
		Type type = clazz.getGenericSuperclass();// 参数化类型：BaseDaoImpl<Customer>，BaseDaoImpl<LinkMan>
		System.out.println(type);
		// 得到这个type就是一个参数化的类型， 将type强转成参数化的类型:
		ParameterizedType pType = (ParameterizedType) type;
		// 通过参数化类型获得实际类型参数:得到一个实际类型参数的数组？Map<String,Integer>.
		Type[] types = pType.getActualTypeArguments();
		// 只获得第一个实际类型参数即可。
		this.clazz = (Class) types[0];// 得到Customer、LinkMan、User
	}

	public void save(T t) {
		this.getHibernateTemplate().save(t);
	}

	public void update(T t) {
		this.getHibernateTemplate().update(t);
	}

	public void delete(Long uuid) {
		T t = (T) this.getHibernateTemplate().get(clazz, uuid);
		this.getHibernateTemplate().delete(t);
	}

	public T findById(Serializable id) {
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

	// 查询所有的方法
	public List<T> findAll() {
		return (List<T>) this.getHibernateTemplate().find("from "+clazz.getSimpleName());
	}

	// 统计个数的方法
	public Long findCount(T t1,T t2,Object param) {
		// 设置统计个数的条件:
		DetachedCriteria dc = getDetachedCriteria(t1,t2,param);
		dc.setProjection(Projections.rowCount());
		List<Long> list = (List<Long>)getHibernateTemplate().findByCriteria(dc);
		return list.get(0);
	}

	
	// 分页查询
	public List<T> findByPage(T t1,T t2,Object param, Integer begin, Integer pageSize) {
		DetachedCriteria dc = getDetachedCriteria(t1,t2,param);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc, begin, pageSize);
	}
	
	//	条件查询
	public List<T> getList(T t1, T t2, Object param) {
		DetachedCriteria dc = getDetachedCriteria(t1,t2,param);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc);
	}

	public List<T> getListByPage(T t1,T t2,Object param,int firstResult, int maxResults) {
		DetachedCriteria dc = getDetachedCriteria(t1,t2,param);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc,firstResult, maxResults);
	}
	
	public DetachedCriteria getDetachedCriteria(T t1, T t2, Object param){
		return null;
	}
}
