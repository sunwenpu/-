package com.example.demo.service.serviceImp;

import com.example.demo.repository.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    private Admin admin;
    @Override
    public boolean admin(String adminName) {
        return admin.existsByAdminName(adminName);
    }

    @Override
    public boolean admin(String adminName, String password) {
        return admin.existsByAdminNameAndPassword(adminName,password);
    }
}
