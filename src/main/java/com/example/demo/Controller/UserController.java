package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public String getMethodName() {
        return new String("Niraj Amrutkar");
    }

    @PostMapping("/add/")
    public UserEntity saveUserEntity(@RequestBody UserEntity entity) {
        return userService.saveUser(entity);
    }
    
    @GetMapping("/user/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/user/{age}")
    public List<UserEntity> findByAge(@PathVariable int age) {
        return userService.findByUserAge(age);
    }
    
    
}
