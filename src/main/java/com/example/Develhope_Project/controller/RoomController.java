package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("view-all-rooms")
    public List<Room> viewAllRooms() {
        return roomService.viewAllRoom();
    }

    @PostMapping("/insert-room")
    public String insertRoom(@RequestBody Room room) {
        roomService.insertRoom(room);
        return "New room inserted";
    }

    @DeleteMapping("/delete-room-byid")
    public String deleteRoom(@RequestParam int id){
        roomService.deleteRoom(id);
        return "Room deleted.";
    }

    //fare metodo crud PutMapping

}
