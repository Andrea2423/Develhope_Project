package org.example;

import java.util.ArrayList;
import java.util.List;

public  abstract class RoomManager {
    boolean available;  //disponibile
    boolean clean;   //pulita

    private List<Room> rooms;

    public RoomManager(boolean clean){
        this.clean = clean;
    }

    public RoomManager() {
        rooms = new ArrayList<>();
    }

    public void addRoom(int roomNumber, String roomType,int guest,boolean available,boolean isClean, double cost) {       //aggiungi stanza
        Room addRoom = new Room();
        rooms.add(addRoom);
    }

    public Room searchRoom(int roomNumber) {   //cerca stanza
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public List<RoomManager> lisOfAvailableRooms() {        //elenco stanze disponibili
        List<RoomManager> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getavailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }


    public void isAvailableOrNot(String roomNumber) { // è disponibile o no?
        if (available = true) {
            System.out.println("La stanza " + roomNumber + "è libera.");
        } else {
            System.out.println("La stanza " + roomNumber + "è occupata.");
        }
    }

    public void isCleanOrNot(String roomNumber) { //è pulita o no?
        if (clean = true) {
            System.out.println("La stanza " + roomNumber + "è pulita.");
        } else {
            System.out.println("La stanza " + roomNumber + "NON è pulita.");
        }
    }

    public void canCheckIN(String roomNumber) {  // disponibile per il CheckIN
        if (available = true && clean == true) {
            System.out.println("La stanza " + roomNumber + "è pronta per il checkin.");
        } else {
            System.out.println("La stanza " + roomNumber + "NON è pronta per il checkin.");
        }
    }
}
