package com.example.demo.business.userinfo.mapper;


import com.example.demo.business.userinfo.model.entity.Employee;
import com.example.demo.business.userinfo.model.form.EmployeeForm;
import com.example.demo.business.userinfo.model.json.EmployeeJson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    EmployeeJson selectByPrimaryKey(EmployeeForm employeeForm);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}