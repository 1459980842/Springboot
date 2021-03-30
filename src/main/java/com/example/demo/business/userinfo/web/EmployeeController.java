package com.example.demo.business.userinfo.web;


import com.example.demo.business.userinfo.model.form.EmployeeForm;
import com.example.demo.business.userinfo.model.json.EmployeeJson;
import com.example.demo.business.userinfo.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping(value = "/test")
    public void test() {
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.multi();
        redisTemplate.opsForValue().set("a1", "你好2");
        redisTemplate.opsForValue().set("a2", "你好23");
        redisTemplate.opsForValue().set("a3", "你好233");
        redisTemplate.opsForValue().set("a4", "你好2333");
        redisTemplate.opsForValue().set("a5", "你好2333");
        redisTemplate.opsForValue().set("a6", "你好2333");
        redisTemplate.opsForValue().set("a7", "你好2333");
        redisTemplate.opsForValue().set("a8", "你好2333");
        redisTemplate.opsForValue().set("a9", "a9");
        redisTemplate.exec();

    }


    @ResponseBody
    @PostMapping("/getInfo")
    @ApiOperation(value = "获取数据库中所有用户信息", notes = "获取并返回所有用户信息")
    public void map(@RequestBody(required = false) EmployeeForm employeeForm) {
        EmployeeJson employeeJson = employeeService.selectByPrimaryKey(employeeForm);

        EmployeeJson employeeJson2 = employeeService.selectByPrimaryKey(employeeForm);
        System.out.println(employeeJson);
        System.out.println(employeeJson2);
    }


}
