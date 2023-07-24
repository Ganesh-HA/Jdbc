package com.example.demo1.service;



import com.example.demo1.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(Integer id);
    User addUser(User user);
    User updateUser(Integer id,User user);
    void deleteUser(Integer id);
}

