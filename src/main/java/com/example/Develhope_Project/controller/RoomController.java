package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/{id}")
    public ResponseEntity viewRoomByID(@PathVariable int id) {

        try {
            return ResponseEntity.ok(roomService.viewRoom(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping
    public ResponseEntity viewAllRooms() {

        try {
            return ResponseEntity.ok(roomService.viewAllRoom());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/hotel/{hotelID}")
    public ResponseEntity viewRoomsByHotel(@PathVariable int hotelID){

        try {
            return ResponseEntity.ok(roomService.viewRoomsByHotel(hotelID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PostMapping("/{hotelID}")
    public ResponseEntity insertRoom(@PathVariable int hotelID, @RequestBody Room room) {

        try {
            return ResponseEntity.ok(roomService.insertRoom(hotelID, room));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable int id){

        roomService.deleteRoom(id);

        return String.format("Room with ID %s deleted", id);
    }


    @PutMapping("/{id}")
    public ResponseEntity updateReview(@PathVariable int id, @RequestBody Room room) {

        try {
            return ResponseEntity.ok(roomService.updateRoom(id, room));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/{id}/available/{changeStatus}")
    public ResponseEntity changeStatusRoom(@PathVariable int id, @PathVariable boolean changeStatus){

        try {
            return ResponseEntity.ok(roomService.changeStatusRoom(id, changeStatus));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
