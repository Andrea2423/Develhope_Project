package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
@Autowired
    private HotelRepository hotelRepository;
}
