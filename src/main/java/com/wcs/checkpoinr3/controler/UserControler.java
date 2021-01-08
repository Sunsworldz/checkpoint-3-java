package com.wcs.checkpoinr3.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.checkpoinr3.entity.User;
import com.wcs.checkpoinr3.repository.UserRepository;
import com.wcs.checkpoinr3.services.UserService;


@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
    @RestController
    @RequestMapping("/users")



        public class UserControler {

	@Autowired
    UserService  userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> readAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User read(@RequestParam(value="id") Long id) {
        return userService.getUserById(id);
    }
}