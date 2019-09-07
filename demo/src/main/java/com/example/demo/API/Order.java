package com.example.demo.API;

import com.example.demo.model.OrderModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Order {
    //新建订单(同时把商品表中的数量进行调整)！！！！！！！！！！！！！！！！！！！！！！！！！！！
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    void order(@RequestBody OrderModel orderModel, @PathVariable Long account);


}
