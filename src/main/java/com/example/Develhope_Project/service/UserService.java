package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /*
    User user = new User();
    // formatted print date from yyyy mm dd to dd MM yyyy
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        return user.getDateOfBirth().format(formatter);
    }

     */

    public void insertUser(User user){
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        //user.getDateOfBirth().format(formatter);
        userRepository.save(user);
    }

    public List<User> viewAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> viewUserById(int id){
        return userRepository.findById(id);
    }

}
