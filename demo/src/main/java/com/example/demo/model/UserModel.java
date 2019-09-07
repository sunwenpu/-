package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
*用户表
*/
@Setter
@Getter
@Entity
@Table(name = "User")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//用户ID
    private Long Id;
//用户账号
    private String userName;
//用户密码
    private String password;
//收藏的商品名字
    @Column(name = "commodity_name")
    private String commodityName;
}
