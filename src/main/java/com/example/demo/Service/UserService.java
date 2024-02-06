package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;

@Component
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public List<UserEntity> findByUserAge(int age){
        return userRepository.findByAge(age);
    }

    public UserEntity saveUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }


}
