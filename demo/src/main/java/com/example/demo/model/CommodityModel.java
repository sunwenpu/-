package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "commodity")
//商品表
public class CommodityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//主键id
    private Long Id;
//商品名字
    private String CommodityName;
//商品价格
    private String price;
//商品数量
    private Long amount;
}
