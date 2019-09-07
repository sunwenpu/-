package com.example.demo.service;

import com.example.demo.dto.Dto;
import com.example.demo.model.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IService {
    List<Model> findAll();      //查找全部
    Model getID(Long Id);       //根据ID进行查询
    void update(Model model);   //更新数据、新增数据
    void update(Dto dto, @PathVariable Long Id);//假删除数据
    void deletely(Long Id);     //真删除数据
    void deleteAll();

    boolean qqq(String name);

}
