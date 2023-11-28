package com.example.Develhope_Project.service;


import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.HotelRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    HotelRepository hotelRepository;


    public Optional<Room> viewRoom(int id) throws Exception{

        if (roomRepository.findById(id).isPresent()){
            return roomRepository.findById(id);
        } else {
            throw new Exception(String.format("Room with ID %s not found", id));
        }
    }


    public List<Room> viewAllRoom() {
        return roomRepository.findAll();
    }


    public List<Room> viewRoomsByHotel(int hotelID) throws Exception{

        if (hotelRepository.findById(hotelID).isPresent()) {
            Hotel hotel = hotelRepository.findById(hotelID).orElse(null);

            List<Room> rooms;
            rooms = hotel.getRooms();

            return rooms;
        } else {
            throw new Exception(String.format("Hotel with ID %s not found", hotelID));
        }

    }


    @Transactional
    public Room insertRoom(int hotelID, Room room) throws Exception {

        if (hotelRepository.findById(hotelID).isPresent()){
            Hotel hotel = hotelRepository.findById(hotelID).orElse(null);

            room.setHotel(hotel);
            hotel.getRooms().add(room);


            hotelRepository.save(hotel);

        } else {
            throw new Exception(String.format("Hotel with ID %s not found", hotelID));
        }

        return roomRepository.save(room);
    }


    public void deleteRoom(int id){

        try {
            roomRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public Room updateRoom(int id, Room updateRoom) throws Exception{

        if (roomRepository.findById(id).isPresent()){

            Room room = roomRepository.findById(id).get();

            if (updateRoom.getRoomNumber() != 0){
                room.setRoomNumber(updateRoom.getRoomNumber());
            }

            if (Objects.nonNull(updateRoom.getRoomType())){
                room.setRoomType(updateRoom.getRoomType());
            }

            if (updateRoom.getGuests() != 0){
                room.setGuests(updateRoom.getGuests());
            }

            if (updateRoom.getCost() != 0){
                room.setCost(updateRoom.getCost());
            }

            if (updateRoom.getavailable() != room.getavailable()){
                room.setAvailable(updateRoom.getavailable());
            }

            return roomRepository.save(room);

        } else {
            throw new Exception(String.format("Room with ID %s not found", id));
        }

    }
}
