package com.example.demo.service.serviceImp;

import com.example.demo.dto.Dto;
import com.example.demo.model.Model;
import com.example.demo.repository.SwpRepository;
import com.example.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class IServiceImp implements IService {
    @Autowired
    //可以对类成员变量、方法及构造函数进行呢标注。完成自动装配的工作。通过@Autowired的使用来消除set，get方法
    private SwpRepository swpRepository;
//    @Resource
//    private iMapper iMaper;
//查询表里全部信息
    @Override
    public List<Model> findAll(){
        return swpRepository.findAll();
    }
//通过ID进行查询
    @Override
    public Model getID(Long Id){
       Model model = swpRepository.findById(Id);
       return model;
    }
//根据ID进行更新、新增数据
    @Override
    public void update(Model model){
        swpRepository.save(model);
    }
//根据ID进行假删除
    @Override
    public void update(Dto dto, @PathVariable Long Id){
        Model model = swpRepository.findById(Id);
        model.setIsDelete(true);
        swpRepository.save(model);
    }
    @Override
//根据ID进行真删除（数据库里没有了）
    public void deletely(Long Id){
        swpRepository.deleteById(Id);
    }
//全部删除
    public void deleteAll(){
        swpRepository.deleteAll();
    }


    public boolean qqq(String name){
        return swpRepository.existsByName(name);
    }

}
