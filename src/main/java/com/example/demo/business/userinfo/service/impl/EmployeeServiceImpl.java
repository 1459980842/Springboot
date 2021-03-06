package com.example.demo.business.userinfo.service.impl;

import com.example.demo.business.userinfo.mapper.EmployeeMapper;
import com.example.demo.business.userinfo.model.entity.Employee;
import com.example.demo.business.userinfo.model.form.EmployeeForm;
import com.example.demo.business.userinfo.model.json.EmployeeJson;
import com.example.demo.business.userinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "employeejson")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    @Cacheable
    public EmployeeJson selectByPrimaryKey(EmployeeForm employeeForm) {
        return employeeMapper.selectByPrimaryKey(employeeForm);
    }
}
