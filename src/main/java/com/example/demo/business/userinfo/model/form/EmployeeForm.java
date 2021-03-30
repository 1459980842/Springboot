package com.example.demo.business.userinfo.model.form;

import java.io.Serializable;

public class EmployeeForm implements Serializable {

    public EmployeeForm() {
    }

    public EmployeeForm(Integer id) {
        this.id = id;
    }


    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeForm{" +
                "id=" + id +
                '}';
    }
}
