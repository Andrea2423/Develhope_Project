package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.repository.HotelRepository;
import com.example.Develhope_Project.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable int id){
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public void addHotel(@RequestBody Hotel hotel){
        hotelService.addHotel(hotel);
    }

    @PostMapping("/{id}")
    public void updateHotel(@PathVariable int id, @RequestBody Hotel hotel){
        hotelService.updateHotel(id,hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable int id){
        hotelService.deleteHotel(id);
    }
}
