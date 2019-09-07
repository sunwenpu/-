package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "swp")
public class Model {

    @Id
    //标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性生命语句之前，可与声明语句同行，也可写在单独行上。
    //id标注也可置于属性的getter方法之前
    @GeneratedValue(strategy = GenerationType.AUTO) //为一个实体生成一个唯一标识的主键
    private Long Id;
    private String name;
    private String email;
    private String sex;
    @Column(name = "IS_DELETE")
    private Boolean isDelete = false;

}
/*
@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键、提供了逐渐的生成策略
有两个属性 ①strategy：1.AUTO主键由程序控制，默认选项，不设置就是这个
                     2.IDENTITY 主键由数据库生成，采用数据库增长，Oracle不支持这种方式
                     3.SEQUENCE 通过数据库的序列产生主键，MYSQL 不支持
                     4.Table 提供特定的数据库产生主键，该方式更有利于数据库的移值


          ②generator：属性的值是一个字符串，默认为“”，其声明了主键生成器的名称
*/