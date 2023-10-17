package org.example.models;

import java.util.ArrayList;

public class Room {
    private int roomNumber; //numero stanza
    private String roomType; //tipologia di stanza
    private int guests;  //numero ospiti
    private double cost;  //costo stanza
    boolean available;  //disponibile
    boolean clean;   //pulita


    public int getGuests() {
        return guests;
    }

    public void setGuests(int numeroDiOspiti) {
        this.guests = numeroDiOspiti;
    }

    public boolean getavailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getIsClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public double getPrice() {
        return cost;
    }

    public void setPrice(double price) {
        this.cost = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Room(int roomNumber, String roomType, int guests, boolean available, boolean clean, double cost) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guests = guests;
        this.available = available;
        this.clean = clean;
        this.cost = cost;
    }
    public Room(){}

    ArrayList<Room> rooms = new ArrayList<>();


//    public void addRoom(int roomNumber, String roomType, int guest, boolean available, boolean clean, double cost) {
//        Room addRoom = new Room();
//        rooms.add(addRoom);
//    }   // aggiungi stanza *DA AGGIUSTARE*

    public String searchRoom(int roomNumber) {   //cerca stanza
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.toString();
            } else {
                return "La stanza non esiste.";
            }
        }
        return null;
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

    public void isAvailableOrNot(int roomNumber) {
        if (available = true) {
            System.out.println("La stanza " + roomNumber + "è libera.");
        } else {
            System.out.println("La stanza " + roomNumber + "è occupata.");
        }
    }// è disponibile o no?

    public void isCleanOrNot(Room room) {
        if (room.clean == true) {
            System.out.println("La stanza è pulita.");
        } else {
            System.out.println("La stanza NON è pulita.");
        }
    } // è pulita o no?

    public static void canCheckIN(Room roomNumber) {
        if (roomNumber.available == true && roomNumber.clean == true) {
            System.out.println("La stanza " + roomNumber.getRoomNumber() + " è pronta per il checkin.");
        } else {
            System.out.println("La stanza " + roomNumber.getRoomNumber() + " NON è pronta per il checkin.");
        }
    }// disponibile per il CheckIN


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Room{");
        sb.append("roomNumber=").append(roomNumber);
        sb.append(", roomType='").append(roomType).append('\'');
        sb.append(", guests=").append(guests);
        sb.append(", cost=").append(cost);
        sb.append(", available=").append(available);
        sb.append(", clean=").append(clean);
        sb.append('}');
        return sb.toString();
    }

}
