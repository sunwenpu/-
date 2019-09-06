package com.example.show.api;

import com.example.show.dto.FoodDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface BuyService {
    //下单物品
    @RequestMapping(value = "/form",method = RequestMethod.POST)
    public String buy(@RequestBody FoodDto foodDto);
}
