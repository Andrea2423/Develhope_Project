package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Registration;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceTest {
    RegistrationService registrationService = new RegistrationService();
    Registration registration = new Registration("Andrea",
            "Zora",
            "Zoor",
            "andrea@gmail.com",
            "andrea93*@",
            "andrea93*@",
            LocalDate.of(1993, 05, 10),
            "3201313893");

    @Test
    public void testRegister() {
        registrationService.register();
        assertEquals("Registrazione completata con successo!", registrationService.register());
    }
}