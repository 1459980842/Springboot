package com.example.demo.business.userinfo.service;

import com.example.demo.business.userinfo.model.entity.Employee;
import com.example.demo.business.userinfo.model.form.EmployeeForm;
import com.example.demo.business.userinfo.model.json.EmployeeJson;

public interface EmployeeService {

    EmployeeJson selectByPrimaryKey(EmployeeForm employeeForm);

}
