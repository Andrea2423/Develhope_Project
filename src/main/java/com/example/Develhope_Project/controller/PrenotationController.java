package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.service.PrenotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/prenotations/{id}")
    public ResponseEntity<Prenotation> getPrenotationById(@PathVariable int id) {
        Prenotation prenotation = prenotationService.getPrenotationById(id);
        return ResponseEntity.ok(prenotation);
    }

    @PutMapping("/put-prenotation-user")
    public List<Prenotation> putPrenotationUser(@RequestBody Prenotation prenotation) {
        prenotationService.insertPrenotation(prenotation);
        return prenotationService.putPrenotationUser(prenotation);
    }

    //@DeleteMapping("/delete-prenotation-user/{id}")
    //public List<Prenotation> deletePrenotationUser(@PathVariable int id) {
    //    Prenotation prenotation = new Prenotation();
    //    prenotation.setId(id);
    //    prenotationService.insertPrenotation(prenotation);
    //    return prenotationService.putPrenotationUser(prenotation);
    //}

    @DeleteMapping("/delete-prenotation-user")
    public List<Prenotation> deletePrenotationUser(@RequestBody Prenotation prenotation) {
        return prenotationService.deletePrenotation(prenotation);
    }
}


