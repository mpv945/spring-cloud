package com.pg.alert.controller;

import com.pg.alert.Service.UserService;
import com.pg.alert.model.UserMO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 15:42 2017/12/19
 * @Modified By
 */
@Api(value="测试controller",description="测试服务注册和swagger显示",tags={"测试操作接口"})
@RestController
public class TestController {

    @Autowired
    public UserService userService;

    @ApiOperation(value="/user/account/{account}", response=String.class, notes = "根据账号获取信息")
    @GetMapping("/user/account/{account}")
    public String findByAccount(@ApiParam(name="account",value="用户账号",required=true) @PathVariable String account) {

        return "返回结果"+account;
    }

    @ApiOperation(value="/user/getAll", response=List.class, notes = "获取全部的数据")
    @PostMapping("/user/getAll")
    public List<Map<String,String>> getAllData(){
        List<Map<String,String>> allData = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("name","xiehaijun");
        map1.put("age","33");
        allData.add(map1);

        Map<String,String> map2 = new HashMap<>();
        map2.put("name","test");
        map2.put("age","18");
        allData.add(map2);

        return allData;
    }

    @PostMapping(value="/user/allUser")
    public List<UserMO> AllUser(@ApiParam(name="page",value="当前页",required=true) @RequestParam String page, @ApiParam(name="count",value="每页数量",required=true) @RequestParam String count){
        UserMO userMo1 = new UserMO();
        userMo1.setName("张三");
        userMo1.setAge("43");
        List<UserMO> list = new ArrayList<>();
        list.add(userMo1);
        System.out.println("page="+page +" count="+count);
        return list;
    }

    @GetMapping(value="/user/getAllUser")
    public List<UserMO> getAllUser(@ApiParam(name="page",value="当前页",required=true) @RequestParam String page, @ApiParam(name="count",value="每页数量",required=true) @RequestParam String count){
        UserMO userMo1 = new UserMO();
        userMo1.setName("李四");
        userMo1.setAge("33");
        List<UserMO> list = new ArrayList<>();
        list.add(userMo1);
        System.out.println("page="+page +" count="+count);
        return list;
    }

    @PostMapping("/user/addUser")
    public String addUser(@RequestBody UserMO userMo){
        String ret = userService.addUser(userMo);
        if(!"添加成功".equals(ret)){
            return "添加失败！";
        }
        System.out.println("uname="+userMo.getName()+"  |age="+userMo.getAge());
        return "添加成功！";
    }

    @GetMapping("/user/jdbcFindAll")
    public List<Map<String,Object>> getAll(){
        return userService.getAllUser();
    }
}
