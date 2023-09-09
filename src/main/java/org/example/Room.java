package org.example;

public abstract class Room {
    private int roomNumber;
    private String roomType;
    private int numeroDiOspiti;
    private boolean isOccupied;
    private boolean isClean;
    private double prezzoDiOggi;

    public int getNumeroDiOspiti() {
        return numeroDiOspiti;
    }

    public void setNumeroDiOspiti(int numeroDiOspiti) {
        this.numeroDiOspiti = numeroDiOspiti;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getPrice() {
        return prezzoDiOggi;
    }

    public void setPrice(double price) {
        this.prezzoDiOggi = price;
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

    public Room(int roomNumber, String roomType, boolean isOccupied, boolean isClean, double prezzoDiOggi) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.isClean = isClean;
        this.prezzoDiOggi = prezzoDiOggi;
    }

    public void isOccupiedOrNot() {
        if (isOccupied = true) {
            System.out.println("La stanza " + roomNumber + "è occupata.");
        } else {
            System.out.println("La stanza " + roomNumber + "è libera.");
        }
    }

    public void isCleanOrNot() {
        if (isClean = true) {
            System.out.println("La stanza " + roomNumber + "è pulita.");
        } else {
            System.out.println("La stanza " + roomNumber + "NON è pulita.");
        }
    }

    public void canCheckIN() {
        if (isOccupied = false && isClean == true) {
            System.out.println("La stanza " + roomNumber + "è pronta per il checkin.");
        } else {
            System.out.println("La stanza " + roomNumber + "NON è pronta per il checkin.");
        }
    }
}
