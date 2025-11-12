package com.vgo.my_spring_app.service;

import com.vgo.my_spring_app.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>(List.of(
        new User(1, "Gowtham", "gowtham@example.com"),
        new User(2, "John", "john@example.com")
    ));

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public boolean updateUser(int id, User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return users.removeIf(u -> u.getId() == id);
    }
}
