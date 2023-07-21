package com.example.demo1.rest;

import com.example.demo1.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public static String welcome(){

        return "Hello World!...";
    }
    @GetMapping("/user")
    public User getUser(){
        User user= new User();
        user.setName("Ganesh H A");
        user.setDateOfBirth("2000-12-08");
        user.setAge(22);
        return user;
    }


}
