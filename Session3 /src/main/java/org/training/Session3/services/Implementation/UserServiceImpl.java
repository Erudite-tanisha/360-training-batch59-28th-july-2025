package org.training.Session3.services.Implementation;

import org.springframework.stereotype.Service;
import org.training.Session3.entities.User;
import org.training.Session3.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> list = new ArrayList<>();


    @Override
    public User addUser(User user) {
        list.add(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return this.list;
    }

    @Override
    public User deleteUserById(int id) {
        return null;
    }
}
