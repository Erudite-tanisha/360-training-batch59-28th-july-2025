package org.training.Session3.services;

import org.training.Session3.entities.User;

import java.util.List;

public interface UserService {

    //add a user
    User addUser(User user);

    //get all users
    List<User> getAllUsers();

    // delete a user by id
    User deleteUserById(int id);

}
