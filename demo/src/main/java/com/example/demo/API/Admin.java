package com.example.demo.API;

import com.example.demo.model.OrderModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface Admin {
    //管理员登录
    @RequestMapping(value = "/admin/{adminName}/{password}",method = RequestMethod.GET)
    String admin(@PathVariable String adminName,@PathVariable String password);
    //管理员处理订单
    @RequestMapping(value = "/admin/order/{result}",method = RequestMethod.PUT)
    String order(@RequestBody OrderModel orderModel);
    //管理员查看订单(处理+未处理)
    @RequestMapping(value = "/admin/order",method = RequestMethod.GET)
    List<OrderModel> order();
    //管理员查看(未)已处理订单
    @RequestMapping(value = "/admin/order/{result}",method = RequestMethod.GET)
    List<OrderModel> orderT(@PathVariable boolean result);
}
