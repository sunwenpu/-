package com.example.demo.repository;

import com.example.demo.model.Model;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface SwpRepository extends Repository<Model,Long> {
    List<Model> findAll();//查询表中所有数据
    Model findById(Long Id);
    void save(Model model);
    void deleteById(Long Id);//根据ID在数据库里进行删除
    void deleteAll();
    boolean existsByName(String name);


}
