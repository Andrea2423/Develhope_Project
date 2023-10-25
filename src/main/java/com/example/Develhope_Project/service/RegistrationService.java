package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Registration;

public class RegistrationService {
    Registration registration = new Registration();
    public boolean isValidEmail(String email) {
        registration.isValidEmail= email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    }

    public String register() {
        // Verifica che la password e la conferma della password siano uguali
        if (registration.getPassword().equals(registration.getConfirmPassword())) {
            return "Registrazione completata con successo!";
        } else {
            return "Le password non corrispondono";
        }
    }
}
