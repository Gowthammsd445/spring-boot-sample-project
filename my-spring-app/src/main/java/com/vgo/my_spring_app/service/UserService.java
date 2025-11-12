package com.vgo.my_spring_app.service;

import com.vgo.my_spring_app.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void createUser(User user);
    boolean updateUser(int id, User user);
    boolean deleteUser(int id);
}

