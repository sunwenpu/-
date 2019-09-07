package com.example.demo.controller;

import com.example.demo.API.Order;
import com.example.demo.model.OrderModel;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements Order {
    @Autowired
    private OrderService orderService;
    @Override
    public void order(OrderModel orderModel, @PathVariable Long account){
        orderService.save(orderModel);

    }
}
