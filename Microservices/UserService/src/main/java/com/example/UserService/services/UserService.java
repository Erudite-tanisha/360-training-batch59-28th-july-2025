package com.example.UserService.services;

import com.example.UserService.entities.User;

import java.util.List;

public interface  UserService {

    User add(User user);

    List<User> getAllUsers();

    User getUser(int id);


}