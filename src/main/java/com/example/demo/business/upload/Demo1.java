package com.example.demo.business.upload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/aaa")
public class Demo1 {


    @ResponseBody
    @PostMapping("/ccc")
    @ApiOperation(value = "获取数据库中所有用户信息", notes = "获取并返回所有用户信息")
    public void map(@RequestBody List<Map<String,List<Map<String,Object>>>> list) {
        for(int i=0;i<list.size();i++){
            Map map1 = list.get(i);
            List list2 = (List)map1.get("xxxx");
            for(int j=0;j<list2.size();j++){
                Map map2 = (Map)list2.get(j);
                int xxx1 = (int)map2.get("xxx1");
                String xx2 = (String)map2.get("xx2");
                Map map3 = (Map)map2.get("xxx3");
                int object_id = (int)map3.get("object_id");
                double x = (double)map3.get("x");
                double y = (double)map3.get("y");
                double w = (double)map3.get("w");
                double h = (double)map3.get("h");
                String name = (String)map3.get("name");
                String xxx4 = (String)map3.get("xxx4");

            }

        }


    }

}
