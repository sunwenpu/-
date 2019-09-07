package com.example.demo.service.serviceImp;

import com.example.demo.model.CommodityModel;
import com.example.demo.repository.Commodity;
import com.example.demo.service.ComodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityImp implements ComodityService {
    @Autowired
    private Commodity commodity;
    //对订单表里的数量进行修改
    @Override
    public String amountUpdate(CommodityModel commodityModel) {
        commodity.save(commodityModel);
        return "操作成功";
    }
   //查看订单表里的数据
    @Override
    public List<CommodityModel> querl() {
        List<CommodityModel> commodityModelList=commodity.findAll();
        return commodityModelList;
    }
}
