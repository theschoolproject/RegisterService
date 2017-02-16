package com.school.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.dao.RegisterDao;
import com.school.project.model.School;
import com.school.project.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegisterDao dao;

	@Override
	public void register(School school) {
		dao.saveSchool(school);
	}

}
