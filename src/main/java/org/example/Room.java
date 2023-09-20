package org.example;

public class Room extends RoomManager {
    private int roomNumber; //numero stanza
    private String roomType; //tipologia di stanza
    private int guests;  //numero ospiti
    private double cost;  //costo stanza

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

    public Room() {}

    public Room(int guests, boolean available, boolean isClean, double cost) {
        this.guests = guests;
        this.available = available;
        this.clean = isClean;
        this.cost = cost;
    }

    public Room(boolean isClean){
        this.clean = isClean;
    }


}
