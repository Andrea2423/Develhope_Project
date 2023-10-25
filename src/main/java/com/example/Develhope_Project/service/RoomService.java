package com.example.Develhope_Project.service;


import com.example.Develhope_Project.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomService {

    ArrayList<Room> rooms = new ArrayList<>();



//    public void addRoom(int roomNumber, String roomType, int guest, boolean available, boolean clean, double cost) {
//        Room addRoom = new Room();
//        rooms.add(addRoom);
//    }   // aggiungi stanza *DA AGGIUSTARE*


    public void searchRoom(Room roomNumber) {   //cerca stanza
        for (Room room : rooms) {
            if (roomNumber.getRoomNumber() == room.getRoomNumber()) {
                System.out.println(room.toString());;
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
