package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void insertUser(User user){
        userRepository.save(user);
    }


    public List<User> viewAllUser(){
        return userRepository.findAll();
    }


    public Optional<User> viewUserById(int id){
        return userRepository.findById(id);
    }


    @Transactional
    public void updateUser(int id,
                           Optional<String> name,
                           Optional<String> surname,
                           Optional<LocalDate> dateOfBirth,
                           Optional<String> email,
                           Optional<String> telephoneNumber,
                           Optional<String> paymentMethod){

        User user = userRepository.getById(id);

        if (user != null){
            name.ifPresent(user::setName);
            surname.ifPresent(user::setSurname);
            dateOfBirth.ifPresent(user::setDateOfBirth);
            email.ifPresent(user::setEmail);
            telephoneNumber.ifPresent(user::setTelephoneNumber);
            paymentMethod.ifPresent(user::setPaymentMethod);

            userRepository.updateUser(id,
                    user.getName(),
                    user.getSurname(),
                    user.getEmail(),
                    user.getDateOfBirth(),
                    user.getTelephoneNumber(),
                    user.getPaymentMethod());
        }
    }


    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

}
