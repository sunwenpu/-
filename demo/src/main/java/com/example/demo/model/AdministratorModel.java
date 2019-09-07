package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//管理员表
@Setter
@Getter
@Entity
@Table(name = "administrator")
public class AdministratorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//主键id
    private Long Id;
//管理员账号
    private String adminName;
//管理员密码
    private String password;
}
