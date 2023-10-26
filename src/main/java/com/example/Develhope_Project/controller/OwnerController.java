package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
}
