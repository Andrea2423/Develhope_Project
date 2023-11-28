package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.service.PrenotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/prenotation")
public class PrenotationController {

    @Autowired
    PrenotationService prenotationService;


    @PostMapping("/user/{userID}/room/{roomID}")
    public ResponseEntity createPrenotation(@PathVariable int userID,
                                            @PathVariable int roomID,
                                            @RequestBody Prenotation prenotation){

        try {
            return ResponseEntity.ok(prenotationService.createPrenotation(userID, roomID, prenotation));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping
    public ResponseEntity getAllPrenotation(){

        try {
            return ResponseEntity.ok(prenotationService.viewPrenotation());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/room/{roomID}")
    public ResponseEntity getAllPrenotationByRoom(@PathVariable int roomID){

        try {
            return ResponseEntity.ok(prenotationService.viewPrenotationByRoom(roomID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/hotel/{hotelID}")
    public ResponseEntity getAllPrenotationByHotel(@PathVariable int hotelID){

        try {
            return ResponseEntity.ok(prenotationService.viewPrenotationByHotel(hotelID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity getPrenotationByID(@PathVariable int id){

        try {
            return ResponseEntity.ok(prenotationService.getPrenotationById(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity updatePrenotation(@PathVariable int id, @RequestBody Prenotation prenotation){

        try {
            return ResponseEntity.ok(prenotationService.updatePrenotation(id, prenotation));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @DeleteMapping("/{id}")
    public String deletePrenotation(@PathVariable int id){

        prenotationService.deletePrenotation(id);

        return String.format("Prenotation with ID %s deleted", id);
    }
}


