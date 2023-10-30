package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.User;

import com.example.Develhope_Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/insert-user")
    public String insertUser(@RequestBody User user){
        userService.insertUser(user);
        return "New user inserted";
    }

    @GetMapping("/view-all-user")
    public List<User> viewAllUsers(){
        return userService.viewAllUser();
    }

    @GetMapping("/view-user-by-id")
    public Optional<User> viewUserByID(@RequestParam int id){
        return userService.viewUserById(id);
    }

}
