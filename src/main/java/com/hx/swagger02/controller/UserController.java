package com.hx.swagger02.controller;

import com.hx.swagger02.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Minghua Chen on 2019/03/22.
 * add jxust-nc
 */


@Api(value="用户模块",description = "用户模块接口信息")
@RestController
public class UserController {


    public static List<User> userArrayList=new ArrayList<>();

    static
    {
        userArrayList.add(new User("1","xiaoming", "123456"));
        userArrayList.add(new User("2","xiaoliu", "123"));
    }


    @ApiOperation(value = "获取用户列表",notes = "获取所有用户的信息")
    @ResponseBody
    @GetMapping("/users")
    public Object index(){
        HashMap<String, List> map = new HashMap<>();
        map.put("users", userArrayList);
        return map;
    }

    @ApiOperation(value = "根据id查询用户",notes = "查询单个用户信息")
    @ApiImplicitParam(name = "id",value = "用户ID",dataType = "int",paramType = "path")
    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        User user = userArrayList.get(id);
        return user;
    }

    @ApiOperation(value = "添加用户",notes = "根据传入的用户信息添加用户")
    //@ApiImplicitParam(name = "添加用户",value = "用户类",paramType = "query")
    @ResponseBody
    @PostMapping("/user/add")
    public boolean addUser(User user){
        System.out.println(user);
        return userArrayList.add(user);
    }

    @ApiOperation(value = "删除用户",notes = "根据传入的用户id删除用户")
    @ApiImplicitParam(name="id",value = "用户ID",paramType = "path")
    @ResponseBody
    @DeleteMapping("/user/delete/{id}")
    public void delUserById(@PathVariable int id){
        userArrayList.remove(id);
    }

}
