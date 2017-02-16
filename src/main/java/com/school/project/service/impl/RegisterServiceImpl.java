package com.school.project.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.dao.RegisterDao;
import com.school.project.model.School;
import com.school.project.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	private final Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);

	@Autowired
	RegisterDao dao;

	@Override
	public void register(School school) {
		logger.info("Register Service for school:" +school.getName());
		dao.saveSchool(school);
	}

}
