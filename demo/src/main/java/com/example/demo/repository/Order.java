package com.example.demo.repository;

import com.example.demo.model.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//订单表
public interface Order extends CrudRepository<OrderModel,Long> {
    //新创建一条订单表、对订单表进行更改
    OrderModel save(OrderModel orderModel);
    List<OrderModel> findAll();
    List<OrderModel>findAllByResult(boolean result);

}
