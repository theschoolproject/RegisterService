package com.school.project.controller;


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

	@Autowired
	private RegisterService service;

	@RequestMapping(value = "school", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void register(@RequestBody School school) {
		
		service.register(school);
	}

}
