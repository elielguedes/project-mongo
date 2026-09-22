package com.gsDev.workShopMongo.service;

import com.gsDev.workShopMongo.domain.User;
import com.gsDev.workShopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findALl(){
        return repository.findAll();
    }

}
