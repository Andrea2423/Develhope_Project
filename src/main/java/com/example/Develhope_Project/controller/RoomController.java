package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @PostMapping("/insert-room")
    public String insertRoom(@RequestBody Room room){
        roomRepository.save(room);
        return "New room inserted";
    }
}
