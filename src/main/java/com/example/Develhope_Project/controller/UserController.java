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


    @PutMapping("/user-update")
    public String updateUser(@RequestParam int id, @RequestBody User user){

        userService.updateUser(id,
                Optional.ofNullable(user.getName()),
                Optional.ofNullable(user.getSurname()),
                Optional.of(user.getDateOfBirth()),
                Optional.ofNullable(user.getEmail()),
                Optional.ofNullable(user.getTelephoneNumber()),
                Optional.ofNullable(user.getPaymentMethod()));

        return "User updated";
    }


    @DeleteMapping("/user-delete")
    public String deleteUser(@RequestParam int id){
        userService.deleteUser(id);

        return "User with ID " + " deleted";
    }
}
