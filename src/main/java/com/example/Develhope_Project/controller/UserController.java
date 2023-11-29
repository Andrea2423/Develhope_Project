package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.User;

import com.example.Develhope_Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping
    public ResponseEntity insertUser(@RequestBody User user){

        try {
            return ResponseEntity.ok(userService.insertUser(user));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }


    @GetMapping
    public ResponseEntity viewAllUsers(){

        try {
            return ResponseEntity.ok(userService.viewAllUser());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity viewUserByID(@PathVariable int id){

        try {
            return ResponseEntity.ok(userService.viewUserById(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable int id, @RequestBody User user){

        try {
            return ResponseEntity.ok(userService.updateUser(id, user));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);

        return String.format("User with ID %s deleted", id);
    }
}
