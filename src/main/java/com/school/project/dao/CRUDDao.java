package com.school.project.dao;

public interface CRUDDao {
	
	public void save(Object object);	
	public void saveUpdate(Object object);
	public Object findById(Class clz, Integer id);
	public void delete(Object entity);
	public void update(Object entity);

}
