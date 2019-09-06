package com.example.show.repository;

import com.example.show.model.UserLnfo;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface xxJpa extends CrudRepository<SecurityProperties.User,Long> {

    boolean existsByName(String username);
    boolean existsByNameAndPassword(String username,String password);

    void save(UserLnfo userLnfo);
}
