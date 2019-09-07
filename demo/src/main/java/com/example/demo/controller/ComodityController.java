package com.example.demo.controller;

import com.example.demo.API.Comodity;
import com.example.demo.model.CommodityModel;
import com.example.demo.service.ComodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComodityController implements Comodity {
    @Autowired
    private ComodityService comodityService;

    @Override
    public List<CommodityModel> comodity() {
        return comodityService.querl();
    }
}
