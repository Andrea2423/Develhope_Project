package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
}
