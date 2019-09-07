package com.example.demo.API;

import com.example.demo.model.CommodityModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface Comodity {
    //管理人员查看商品数量
    @RequestMapping(value = "/comodity",method = RequestMethod.GET)
    List<CommodityModel> comodity();
}
