package com.crud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.service.StudentService;

@RestController
@RequestMapping("/home")
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/insert")
	public String addStudent
	
	
}
