package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.PrenotationRepository;
import com.example.Develhope_Project.service.OwnerService;
import com.example.Develhope_Project.service.PrenotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PrenotationController {
    @Autowired
    PrenotationService prenotationService;

    @PostMapping("/insert-prenotation")
    public String insertPrenotation(@RequestBody Prenotation prenotation) {
        prenotationService.insertPrenotation(prenotation);
        return "reservation entered";
    }

    @GetMapping("/view-prenotation")
    public List<Prenotation> viewPrenotation() {
        return prenotationService.viewPrenotation();
    }

    @PutMapping("/put-prenotation-user")
    public List<Prenotation> putPrenotationUser(@RequestBody Prenotation prenotation) {
        prenotationService.insertPrenotation(prenotation);
        return prenotationService.putPrenotationUser(prenotation);
    }
}


