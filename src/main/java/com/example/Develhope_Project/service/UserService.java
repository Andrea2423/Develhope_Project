package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User insertUser(User user){
        return userRepository.save(user);
    }


    public List<User> viewAllUser(){
        return userRepository.findAll();
    }


    public Optional<User> viewUserById(int id) throws Exception{

        if (userRepository.findById(id).isPresent()){
            return userRepository.findById(id);
        } else {
            throw new Exception(String.format("User with ID %s not found", id));
        }

    }


    public User updateUser(int id, User newUser) throws Exception {

        if (userRepository.findById(id).isPresent()){

            User user = userRepository.findById(id).get();

            if (Objects.nonNull(newUser.getName())){
                user.setName(newUser.getName());
            }

            if (Objects.nonNull(newUser.getSurname())){
                user.setSurname(newUser.getSurname());
            }

            if (Objects.nonNull(newUser.getDateOfBirth())){
                user.setDateOfBirth(newUser.getDateOfBirth());
            }

            if (Objects.nonNull(newUser.getEmail())){
                user.setEmail(newUser.getEmail());
            }

            if (Objects.nonNull(newUser.getTelephoneNumber())){
                user.setTelephoneNumber(newUser.getTelephoneNumber());
            }

            if (Objects.nonNull(newUser.getPaymentMethod())){
                user.setPaymentMethod(newUser.getPaymentMethod());
            }
            return userRepository.save(user);
        } else {
            throw new Exception(String.format("User with ID %s not found", id));
        }

    }


    public void deleteUser(int id) {

        try {
            userRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
