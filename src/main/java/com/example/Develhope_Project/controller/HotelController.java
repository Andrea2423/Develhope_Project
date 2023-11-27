package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.repository.HotelRepository;
import com.example.Develhope_Project.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @GetMapping
    public ResponseEntity getAllHotel(){

        try {
            return ResponseEntity.ok(hotelService.getAllHotel());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity getHotelById(@PathVariable int id){

        try {
            return ResponseEntity.ok(hotelService.getHotelById(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/owner/{ownerID}")
    public ResponseEntity getHotelsByOwner(@PathVariable int ownerID){

        try {
            return ResponseEntity.ok(hotelService.viewAllHotelByOwner(ownerID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PostMapping("/{ownerID}")
    public ResponseEntity addHotel(@PathVariable int ownerID, @RequestBody Hotel hotel){

        try {
            return ResponseEntity.ok(hotelService.insertHotel(ownerID, hotel));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateHotel(@PathVariable int id, @RequestBody Hotel hotel){

        try {
            return ResponseEntity.ok(hotelService.updateHotel(id, hotel));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public String deleteHotel(@PathVariable int id){
        hotelService.deleteHotel(id);

        return String.format("Hotel with ID %s deleted", id);
    }
}
