package com.example.demo.service;

import com.example.demo.model.OrderModel;

import java.util.List;

public interface OrderService {
    //创建和修改订单表
    void save(OrderModel orderModel);
    List<OrderModel> querl();
    List<OrderModel> querl(boolean result);
}
