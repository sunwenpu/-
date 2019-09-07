package com.example.demo.API;

import com.example.demo.model.UserModel;
import org.springframework.web.bind.annotation.*;

public interface User {
    //用户登录
    @RequestMapping(value = "/user/{userName}/{password}",method = RequestMethod.GET)
    String record(@PathVariable String userName,@PathVariable String password);
    //用户注册
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    String register(@RequestBody UserModel userModel);
    //收藏
    ///////////!!!
    ////////!!!!!! 有问题   数据库里并没有更新
    @RequestMapping(value = "/user/{collect}",method = RequestMethod.PUT)
    String collect(@RequestBody UserModel userModel,@PathVariable String collect);
}
