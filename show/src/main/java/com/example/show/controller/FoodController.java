package com.example.show.controller;

import com.example.show.api.BuyService;
import com.example.show.dto.FoodDto;
import com.example.show.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController implements BuyService {
    @Autowired
     private FoodService foodService;
    //下单物品
    public String buy(@RequestBody FoodDto foodDto){
        foodService.save(foodDto);
        return "successful";
    };
}
