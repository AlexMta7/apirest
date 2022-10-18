package com.example.ApiRest.services;

import com.example.ApiRest.models.UserModel;
import com.example.ApiRest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel usuario){
        return userRepository.save(usuario);
    }
}
