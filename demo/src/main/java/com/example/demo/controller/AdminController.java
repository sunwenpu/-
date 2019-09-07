package com.example.demo.controller;

import com.example.demo.API.Admin;
import com.example.demo.model.OrderModel;
import com.example.demo.service.AdminService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController implements Admin {
    @Autowired
    private AdminService adminService;
    @Autowired
    private OrderService orderService;
    @Override
    //管理员登录
    public String admin(String adminName, String password) {
        if(adminService.admin(adminName)){
            if (adminService.admin(adminName,password)){
                return "登录成功";
            }return "密码输入错误";
        }return "账号不存在";
    }

    @Override
    //管理员处理订单
    public String order(OrderModel orderModel) {
        orderService.save(orderModel);
        return "处理成功";
    }

    @Override
    //管理员查看订单(处理+未处理)
    public List<OrderModel> order() {
        return orderService.querl();
    }
    //管路员查看（处理、未处理）订单
    @Override
    public List<OrderModel> orderT(@PathVariable boolean result) {
        return orderService.querl(result);
    }
}
