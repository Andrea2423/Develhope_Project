package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {
    Registration registration = new Registration("Andrea",
            "Zora",
            "Zoor",
            "andrea@gmail.com",
            "andrea93*@",
            "andrea93*@",
            LocalDate.of(1993, 05, 10),
            "3201313893");

    @Test
    public void testRegister(){
        registration.register();
        assertEquals("Registrazione completata con successo!", registration.register());
    }
}