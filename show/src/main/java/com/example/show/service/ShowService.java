package com.example.show.service;

import com.example.show.dto.CreateDto;

public interface ShowService {
    //判断账号
    boolean existUser(String username);
    //判断账号和密码
    boolean existUser(String username,String password);

    void save(CreateDto createDto);

}
