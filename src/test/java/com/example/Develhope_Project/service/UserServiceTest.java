package com.example.Develhope_Project.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class UserServiceTest {

    UserService userService= new UserService();

    @Test
    public void testGetFormattedDate() {
        userService.getFormattedDate();
        assertEquals("10 05 1994", userService.getFormattedDate());
    }
}