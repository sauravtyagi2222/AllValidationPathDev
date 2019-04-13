package com.path.validation.AllValidationPathDev.reository;

import org.springframework.data.repository.CrudRepository;

import com.path.validation.AllValidationPathDev.bean.StudentBean;

public interface StudentRepository extends CrudRepository<StudentBean, String> {

}
