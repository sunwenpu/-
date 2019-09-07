package com.example.demo.service.serviceImp;

import com.example.demo.model.OrderModel;
import com.example.demo.repository.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImp implements OrderService {
    @Autowired
    private Order order;
    @Override
    public void save(OrderModel orderModel) {
        order.save(orderModel);

    }

    @Override
    public List<OrderModel> querl(){
       return order.findAll();
    }

    @Override
    public List<OrderModel> querl(boolean result) {
        order.findAllByResult(result);
        return null;
    }
}
