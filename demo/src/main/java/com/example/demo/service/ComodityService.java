package com.example.demo.service;

import com.example.demo.model.CommodityModel;

import java.util.List;

public interface ComodityService {
    //对商品表的数量增加/减少
    String amountUpdate(CommodityModel commodityModel);
    List<CommodityModel> querl();
}
