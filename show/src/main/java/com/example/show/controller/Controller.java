package com.example.show.controller;
import com.example.show.api.ApiService;
import com.example.show.dto.CreateDto;
import com.example.show.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements ApiService {
    @Autowired
    private ShowService showService;
    @Override
    public String get(@PathVariable String username, @PathVariable String password){
         //先进行判断该账号是否存在

        if ((showService.existUser(username))){
                 //若存在则判断该账号和密码是否相对应
            if (showService.existUser(username, password)){
                return "登录成功";
            }else return "密码不正确";
        }else return "账号不存在";
    }
    @Override
    public String register(@RequestBody CreateDto createDto, @PathVariable String username){
        if (showService.existUser(username)){
            return "账号已存在请重新输入";
        }//判断各个属性必须输入，在前端可以进行约束
        showService.save(createDto);
        return "注册成功";
    }
}
