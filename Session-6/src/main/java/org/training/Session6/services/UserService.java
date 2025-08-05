package org.training.Session6.services;

import org.springframework.stereotype.Service;
import org.training.Session6.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User(UUID.randomUUID().toString(), "tanisha", "tan@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Aditya", "adi@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Harzeen", "Har@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(), "Shashank", "shashank@gmail.com"));

    }

    public List<User> getAllUsers(){
        return this.list;
    }

}
