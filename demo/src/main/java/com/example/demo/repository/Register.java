package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//用户表
public interface Register extends CrudRepository<UserModel,Long> {
    //登录<验证账号是否存在>
    boolean existsByCommodityName(String userName);
    //登录<验证账号密码是否一致>
    boolean existsByCommodityNameAndPassword(String userName,String password);
    //注册、收藏
    UserModel save(UserModel userModel);

}
