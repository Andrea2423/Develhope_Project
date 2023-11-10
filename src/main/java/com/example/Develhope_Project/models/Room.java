package com.example.Develhope_Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private int id;
    private int roomNumber; //numero stanza
    private String roomType; //tipologia di stanza
    private int guests;  //numero ospiti
    private double cost;  //costo stanza
    private boolean available;  //disponibile
    private boolean clean;   //pulita

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Review> reviewList;


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isClean() {
        return clean;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }




    public Room() {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
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
