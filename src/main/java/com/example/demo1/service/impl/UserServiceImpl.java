package com.example.demo1.service.impl;

import com.example.demo1.domain.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository repository;

    @Override
    public List<User> getUsers() {
        return repository.findAll();
    }
}
