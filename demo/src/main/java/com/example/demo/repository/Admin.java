package com.example.demo.repository;

import com.example.demo.model.AdministratorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//管理员表
public interface Admin extends CrudRepository<AdministratorModel,Long> {
    //管理员
    boolean existsByAdminName(String adminName);
    boolean existsByAdminNameAndPassword(String adminName,String password);
}
