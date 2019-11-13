package com.dafeng.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.jmx.support.MetricType;

import com.dafeng.base.dao.impl.BaseDaoImpl;
import com.dafeng.erp.dao.IDepDao;
import com.dafeng.erp.entity.Dep;

public class DepDao extends BaseDaoImpl<Dep> implements IDepDao {
  
	public List<Dep> getList(Dep dep) {
		DetachedCriteria dc = DetachedCriteria.forClass(Dep.class);
		if (null != dep) {
			if (null != dep.getName()&& dep.getName().trim().length()>0) {
				dc.add(Restrictions.like("name", dep.getName(),MatchMode.ANYWHERE));
			}
			if (null != dep.getTele()&&dep.getTele().trim().length()>0) {
				dc.add(Restrictions.like("tele", dep.getTele(), MatchMode.ANYWHERE));
			}
		}
		return (List<Dep>) this.getHibernateTemplate().findByCriteria(dc);
	}
	
}
