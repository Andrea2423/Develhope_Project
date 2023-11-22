package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/{id}")
    public Room viewRoom(@PathVariable int id) {
        return roomService.viewRoom(id);
    }

    @GetMapping
    public List<Room> viewAllRooms() {
        return roomService.viewAllRoom();
    }

    @PostMapping
    public String insertRoom(@RequestBody Room room) {
        roomService.insertRoom(room);
        return "New room inserted";
    }

    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable int id){
        roomService.deleteRoom(id);
        return "Room deleted.";
    }

    @PutMapping("/{id}")
    public String updateReview(@PathVariable int id, @RequestBody Room room) {

        roomService.updateRoom(id,
                Optional.of(room.getRoomNumber()),
                Optional.ofNullable(room.getRoomType()),
                Optional.of(room.getGuests()),
                Optional.of(room.getCost()),
                Optional.of(room.getavailable()),
                Optional.of(room.getIsClean()));

        return "Room updated";

    }

}
