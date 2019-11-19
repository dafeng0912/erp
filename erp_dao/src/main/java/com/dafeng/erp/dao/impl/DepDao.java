package com.dafeng.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.jmx.support.MetricType;

import com.dafeng.base.dao.impl.BaseDao;
import com.dafeng.erp.dao.IDepDao;
import com.dafeng.erp.entity.Dep;

public class DepDao extends BaseDao<Dep> implements IDepDao {
	
	public DetachedCriteria getDetachedCriteria(Dep dep1, Dep dep2, Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Dep.class);
		if(dep1!=null){
			if(null != dep1.getName() && dep1.getName().trim().length()>0){
				dc.add(Restrictions.like("name", dep1.getName(), MatchMode.ANYWHERE));
			}
			if(null != dep1.getTele() && dep1.getTele().trim().length()>0){
				dc.add(Restrictions.like("tele", dep1.getTele(), MatchMode.ANYWHERE));
			}

		}
		return dc;
	}

	/** 
	  * @see com.dafeng.erp.dao.IDepDao#getList(com.dafeng.erp.entity.Dep, int, int)
	  * @Overriding : getList 
	  * @Description: TODO(这里用一句话描述这个方法的作用) 
	  * @param dep
	  * @param firstResult
	  * @param rows
	  * @return    
	  * @return IDepDao     
	  * @author  大风
	  * @data  2019年11月15日
	  * @version v1.0 
	*/
	public List<Dep> getList(Dep dep, int firstResult, int rows) {
		// TODO Auto-generated method stub
		return null;
	}
}
