package com.example.show.service.serviceImp;

import com.example.show.dto.FoodDto;
import com.example.show.model.Food;
import com.example.show.repository.FoodJpa;
import com.example.show.service.FoodService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImp implements FoodService {
    @Autowired
    private FoodJpa foodJpa;
    //下单物品（把DTO中的数据传到model中去，使用save方法）
    public void save(FoodDto foodDto){
        ModelMapper modelMapper = new ModelMapper();
        Food food = modelMapper.map(foodDto,Food.class);
        foodJpa.save(food);
    }
}
