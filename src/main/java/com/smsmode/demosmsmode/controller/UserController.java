package com.smsmode.demosmsmode.controller;

import com.smsmode.demosmsmode.model.User;
import com.smsmode.demosmsmode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    private UserService userService;

    @PutMapping("/users/{username}")
    public User addUser(@PathVariable(name = "username", required = true) String username){

        User user = new User();
        user.setID(UUID.randomUUID().toString());
        user.setUserName(username);

        userService.save(user);

        return user;

    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id", required = true) String ID){
        User userByID = userService.findUserByID(ID);
        System.out.println(userByID);
        return userByID;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
