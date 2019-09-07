package com.example.demo.service;

import com.example.demo.model.UserModel;

public interface UserRegisterService {
    //用户登录
    boolean record(String userName);
    boolean record(String userName,String password);
    //用户注册
    void register(UserModel userModel);
    //用户收藏夹
}
