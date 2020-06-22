package com.nacro.SpringApp.service;

import java.util.List;

import com.nacro.SpringApp.entity.User;


public interface UserService {
    public List<User> getAllUsers();
    public  User createUser(User user);
}

