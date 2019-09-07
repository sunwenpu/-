package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

//订单表
@Setter
@Getter
@Entity
@Table(name = "order")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//主键
    private Long Id;
//用户名字
    private String userName;
//商品名字
    private String name;
//用户下单时间
    private Date startingTime;
//管理员处理时间
    private Date endTime;
//是否处理完成
    private boolean result = false;
}
