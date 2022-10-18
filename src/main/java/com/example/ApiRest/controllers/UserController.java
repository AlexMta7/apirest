package com.example.ApiRest.controllers;

import com.example.ApiRest.models.UserModel;
import com.example.ApiRest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel usuario){
        return this.userService.saveUser(usuario);
    }
}
