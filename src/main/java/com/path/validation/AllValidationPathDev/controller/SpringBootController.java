package com.path.validation.AllValidationPathDev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.path.validation.AllValidationPathDev.bean.StudentBean;
import com.path.validation.AllValidationPathDev.service.StrudentService;

@RestController
public class SpringBootController {
	
	@Autowired
	private StrudentService studentService;

	@RequestMapping("/allStudent")
	public List<StudentBean> getStudentDetails(){
		return studentService.getStudentDetails();
	}
	}
