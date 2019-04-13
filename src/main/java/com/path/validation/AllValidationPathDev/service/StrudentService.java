package com.path.validation.AllValidationPathDev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.path.validation.AllValidationPathDev.bean.StudentBean;
import com.path.validation.AllValidationPathDev.reository.StudentRepository;

@Service
public class StrudentService {

	private StudentRepository studentRepository;

	public List<StudentBean> getStudentDetails() {
		return (List<StudentBean>) studentRepository.findAll();
	}

}
