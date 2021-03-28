package com.example.demo.business.userinfo.web;


import com.example.demo.business.userinfo.model.form.EmployeeForm;
import com.example.demo.business.userinfo.model.json.EmployeeJson;
import com.example.demo.business.userinfo.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping(value = "/test")
    public void test() {
        stringRedisTemplate.opsForValue().set("aaaa", "你好");
    }


    @ResponseBody
    @PostMapping("/getInfo")
    @ApiOperation(value = "获取数据库中所有用户信息", notes = "获取并返回所有用户信息")
    public EmployeeJson map(@RequestBody (required=false) EmployeeForm employeeForm) {
        return employeeService.selectByPrimaryKey(employeeForm);
    }


}
