package com.school.project.dao.impl;

import org.springframework.stereotype.Component;

import com.school.project.dao.AbstractDevPortalDao;
import com.school.project.dao.RegisterDao;
import com.school.project.model.School;

@Component
public class RegisterDaoImpl extends AbstractDevPortalDao implements RegisterDao{
	
	@Override
	public void saveSchool(School school) {
		super.save(school);
	}

}
