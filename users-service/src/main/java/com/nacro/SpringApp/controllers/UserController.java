package com.nacro.SpringApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nacro.SpringApp.entity.User;
import com.nacro.SpringApp.service.UserService;


@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAll()
    {
        return userService.getAllUsers();
    }
    @PostMapping("/users")
    public User createUser(@RequestBody User user)
    {
       return userService.createUser(user);
    }
}
