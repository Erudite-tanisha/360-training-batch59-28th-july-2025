package com.example.UserService.services;

import com.example.UserService.entities.User;
import com.example.UserService.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private ProductClient productClient;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<User> newUserList = users.stream().map(user -> {
            user.setProducts(productClient.getProductByUser(user.getId()));
            return user;
        }).collect(Collectors.toList());
        return newUserList;
    }

    @Override
    public User getUser(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setProducts(productClient.getProductByUser(user.getId()));
        return user;
    }
}
