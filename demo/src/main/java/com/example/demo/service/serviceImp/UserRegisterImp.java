package com.example.demo.service.serviceImp;

import com.example.demo.model.UserModel;
import com.example.demo.repository.Register;
import com.example.demo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterImp implements UserRegisterService {
    @Autowired
    private Register register;
    @Override
    public boolean record(String userName) {
        return register.existsByCommodityName(userName);
    }

    @Override
    public boolean record(String userName, String password) {
        return register.existsByCommodityNameAndPassword(userName,password);
    }

    @Override
    public void register(UserModel userModel) {
        register.save(userModel);

    }
}
