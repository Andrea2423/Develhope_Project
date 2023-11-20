package com.example.Develhope_Project.service;


import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.RoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public List<Room> viewAllRoom() {
        return roomRepository.findAll();
    }

    public void insertRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(int id){
        roomRepository.deleteById(id);
    }

    @Transactional
    public void updateRoom(int id,
                           Optional<Integer> roomNumber,
                           Optional<String> roomType,
                           Optional<Integer> guests,
                           Optional<Double> cost,
                           Optional<Boolean> available,
                           Optional<Boolean> clean) {

        Room room = roomRepository.getById(id);

        if (room != null) {
            roomNumber.ifPresent(room::setRoomNumber);
            roomType.ifPresent(room::setRoomType);
            guests.ifPresent(room::setGuests);
            cost.ifPresent(room::setCost);
            available.ifPresent(room::setAvailable);
            clean.ifPresent(room::setClean);


            roomRepository.updateRoom(id,
                    room.getRoomNumber(),
                    room.getRoomType(),
                    room.getGuests(),
                    room.getCost(),
                    room.getavailable(),
                    room.getIsClean());
        }
    }



    ArrayList<Room> rooms = new ArrayList<>();


//    public void addRoom(int roomNumber, String roomType, int guest, boolean available, boolean clean, double cost) {
//        Room addRoom = new Room();
//        rooms.add(addRoom);
//    }   // aggiungi stanza *DA AGGIUSTARE*


    public void searchRoom(Room roomNumber) {   //cerca stanza
        for (Room room : rooms) {
            if (roomNumber.getRoomNumber() == room.getRoomNumber()) {
                System.out.println(room.toString());
                ;
            }
        }
        System.out.println("La stanza non esiste.");
    } //cerca stanza


//    public Room lisOfAvailableRooms() {
//        List<Room> availableRooms = new ArrayList<>();
//        for (String room : rooms) {
//            if (available == true) {
//                availableRooms.add(room);
//            }
//        }
//        return null;
//    } //elenco stanze disponibili *DA AGGIUSTARE*

    public void isAvailableOrNot(Room roomNumber) {
        if (roomNumber.getavailable() == true) {
            System.out.println("La stanza " + roomNumber + "è libera.");
        } else {
            System.out.println("La stanza " + roomNumber + "è occupata.");
        }
    }// è disponibile o no?

    public void isCleanOrNot(Room room) {
        if (room.getIsClean() == true) {
            System.out.println("La stanza è pulita.");
        } else {
            System.out.println("La stanza NON è pulita.");
        }
    } // è pulita o no?

    public static void canCheckIN(Room roomNumber) {
        if (roomNumber.getavailable() == true && roomNumber.getIsClean() == true) {
            System.out.println("La stanza " + roomNumber.getRoomNumber() + " è pronta per il checkin.");
        } else {
            System.out.println("La stanza " + roomNumber.getRoomNumber() + " NON è pronta per il checkin.");
        }
    }// disponibile per il CheckIN

}
