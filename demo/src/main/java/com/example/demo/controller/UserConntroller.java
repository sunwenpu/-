package com.example.demo.controller;

import com.example.demo.API.User;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConntroller implements User {
    @Autowired
    private UserRegisterService userRegisterService;
    @Override
    public String record(String userName, String password) {
        if (userRegisterService.record(userName)){
            if (userRegisterService.record(userName,password)){
                return "登录成功";
            }return "密码错误";
        }return "用户名不存在";
    }

    @Override
    public String register(UserModel userModel) {
        userRegisterService.register(userModel);
        return "注册成功";
    }

    @Override
    public String collect(UserModel userModel, String collect) {
        userRegisterService.register(userModel);
        return "添加成功";
    }
}
