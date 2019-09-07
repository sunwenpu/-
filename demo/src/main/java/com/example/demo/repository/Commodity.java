package com.example.demo.repository;

import com.example.demo.model.CommodityModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//商品信息表
@Repository
public interface Commodity extends CrudRepository <CommodityModel,Long>{
    //购买（商品数量减少/增多）
    CommodityModel save(CommodityModel commodityModel);
    //查看全部商品表全部数据
    @Override
    List<CommodityModel> findAll();
}
