package com.example.demo.controller;


import com.example.demo.dto.Dto;
import com.example.demo.model.Model;
import com.example.demo.API.OswpService;
import com.example.demo.service.IService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//ModelMapper是从一个对象到对象(object-object)的框架，能将Java Bean（Pojo）对象从一种表现形式转化为另一种表现形式。
//它采用“通过约定来配置”的方式，自动匹配不同的对象映射，同时具备满足某些特殊需求的高级功能。
//1.基于名称的对象属性映射2.复制公开的、受保护的和私有的字段3.略过某些字段4.可用转换器来影响映射（如将字符串转换为小写）
//5.在不同类型的字段间进行映射（如将字符串转换为数字）6.采用不同的条件进行映射7.默认条件不充分时采用松散的映射策略
//8.对映射过程进行验证以确保所有字段都被处理9.对特殊情况下的映射过程进行完全可定制化的控制10.与Guice或Spring集成
@RestController
public class Controller implements OswpService {
    @Autowired
    private IService iService;
    public Controller(){}                           //无参构造函数，系统默认会给每个类创建的构造函数。
// 查询全部                                       //如果额外写了有参构造函数，要想再用无惨构造函数，必须自己再写一遍
    @Override                                       //有参构造函数：为了类中的属性初始化
    public List<Dto>get(){                          //无参构造函数：
        List<Model> model = iService.findAll();

        // System.out.println(model.get(1));           //????为啥返回的是地址
        //System.out.println(model.get(0).toString());

        ModelMapper modelMapper = new ModelMapper();//List是一个接口，而ArrayList是一个类，而且继承List。（ArrayList是List的子类）
        List<Dto> dtoList = new ArrayList<>();      //使用List作为一种变量来存储ArrayList类的对象，使用new（）运算符创建。称为接口编程
       if(!CollectionUtils.isEmpty(model)) {        //判断model不为空(返回值类型是boolean)
           model.forEach(m ->{                      //将model中的数据用foreach导入dto中
            Dto dto =  modelMapper.map(m,Dto.class);//
              dtoList.add(dto);                     //在将dto中的数据导入dtoList（ArrayList类型）中
           });
       }
        return dtoList;                             //向前端返回dtoList
    }
//根据ID进行查询
    @Override
    public Dto getID(@PathVariable Long Id){
        final Model models = iService.getID(Id);
        ModelMapper modelMapper = new ModelMapper();
        Dto dto = modelMapper.map(models,Dto.class);
        return dto;
    }
//新增
    @Override
    public String  create(@RequestBody Dto dto){
        ModelMapper modelMapper = new ModelMapper();

        Model model = modelMapper.map(dto,Model.class);


        iService.update(model);
        return "success";
    }
//更改
    @Override
    public String  update(@RequestBody Dto dto, @PathVariable Long Id){
        ModelMapper modelMapper = new ModelMapper();
        Model model = modelMapper.map(dto,Model.class);
        iService.update(model);
        return "success";
    }
//假删除
    @Override
    public String delete(@RequestBody Dto dto,@PathVariable Long Id){
        iService.update(dto,Id);
        return "success";
    }
//真删除
    @Override
    public String deletely(@PathVariable Long Id){
        iService.deletely(Id);
        return "success";
    }

//删除全部
    @Override
    public String deleteAll(){
        iService.deleteAll();
        return "success";
    }

}
