package com.school.project.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.school.project.dao.AbstractDevPortalDao;
import com.school.project.dao.RegisterDao;
import com.school.project.model.School;

@Component
public class RegisterDaoImpl extends AbstractDevPortalDao implements RegisterDao{
	private final Logger logger = LoggerFactory.getLogger(RegisterDaoImpl.class);
	@Override
	public void saveSchool(School school) {
		logger.info("saving school:" +school.getName());
		super.save(school);
	}

}
