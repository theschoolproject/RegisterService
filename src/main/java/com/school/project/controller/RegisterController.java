package com.school.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.model.School;
import com.school.project.service.RegisterService;

@RestController
@Transactional
@RequestMapping(value = "/register")
public class RegisterController {
	
	private final Logger logger = LoggerFactory.getLogger(RegisterController.class);

	@Autowired
	private RegisterService service;

	@RequestMapping(value = "school", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void register(@RequestBody School school) {
		logger.info("Register controller for school:" +school.getName());
		service.register(school);
	}

}
