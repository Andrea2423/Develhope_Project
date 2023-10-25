package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.User;

import java.time.format.DateTimeFormatter;

public class UserService {
    User user = new User();
    // formatted print date from yyyy mm dd to dd MM yyyy
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        return user.getDateOfBirth().format(formatter);
    }
}
