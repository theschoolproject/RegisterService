package com.school.project.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractDevPortalDao implements CRUDDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void save(Object object){
		getHibernateTemplate().save(object);
	}
	
	public void saveUpdate(Object object){
		getHibernateTemplate().saveOrUpdate(object);
	}

	public Object findById(Class clz, Integer id) {
		Object entity = getHibernateTemplate().get(clz, id);
		return entity;
	}

	public void delete(Object entity) {
		getHibernateTemplate().delete(entity);
		
	}

	
	public void deleteAll(Collection lisOfBlueprints){
		getHibernateTemplate().deleteAll(lisOfBlueprints);
	}
	
	
	public void update(Object entity) {
		getHibernateTemplate().update(entity);
		
	}

	
}
