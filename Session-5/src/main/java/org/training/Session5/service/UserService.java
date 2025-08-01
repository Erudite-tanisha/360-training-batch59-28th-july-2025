package org.training.Session5.service;

import org.springframework.stereotype.Service;
import org.training.Session5.entities.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();


    public UserService() {
        list.add(new User("Harzeen", "Harzeen", "har@gmail.com"));
        list.add(new User("Aditya", "Aditya", "adi@gmail.com"));
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUserByUsername(String username){
        return this.getAllUsers().stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

}
