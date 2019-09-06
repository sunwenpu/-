package com.example.show.service.serviceImp;

import com.example.show.dto.CreateDto;
import com.example.show.model.UserLnfo;
import com.example.show.repository.xxJpa;
import com.example.show.service.ShowService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements ShowService {
    //账号判断
    @Autowired
    private xxJpa xxjpa;
    @Override
    public boolean existUser(String username){
        return xxjpa.existsByName(username);
    }
    //账号和密码判断
    @Override
    public boolean existUser(String username,String password){
        return xxjpa.existsByNameAndPassword(username,password);
    }
    //新建用户存储
    @Override
    public void save(CreateDto createDto){
        ModelMapper modelMapper = new ModelMapper();
        UserLnfo userLnfo = modelMapper.map(createDto,UserLnfo.class);
        xxjpa.save(userLnfo);
    }

}

