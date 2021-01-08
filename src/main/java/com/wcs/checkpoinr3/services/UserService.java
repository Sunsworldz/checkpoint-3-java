package com.wcs.checkpoinr3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.checkpoinr3.entity.User;
import com.wcs.checkpoinr3.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository UserRepo;


    public List<User> getAllUsers() {
        return UserRepo.findAll();
    }

    public User getUserById(Long id) {
        return UserRepo.findById(id).get();
    }


}