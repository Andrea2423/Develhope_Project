package com.example.Develhope_Project;

import com.example.Develhope_Project.models.User;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user = new User("Peppe",
            "Palermo",
            LocalDate.of(1994, 05, 10),
            "peppe@gmail.com", "+3_499_855892",
            "Card");

    @Test
    public void testGetFormattedDate() {
        user.getFormattedDate();
        assertEquals("10 05 1994", user.getFormattedDate());
    }
}