package com.example.Develhope_Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Hotel {
    @Id
    @GeneratedValue

    private int id;
    private String hotelName;

    private int hotelFloors;

    private String hotelAddress;

    private String hotelInfo;

    private String hotelServices;



    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonIgnore
    private Owner owner;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Room> rooms;

    @ManyToOne
    @JoinColumn(name = "prenotation_id")
    @JsonIgnore
    private Prenotation prenotation;


    public Hotel(int hotelId, String s) {

    }

    public Hotel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelFloors() {
        return hotelFloors;
    }

    public void setHotelFloors(int hotelFloors) {
        this.hotelFloors = hotelFloors;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(String hotelServices) {
        this.hotelServices = hotelServices;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Prenotation getPrenotation() {
        return prenotation;
    }

    public void setPrenotation(Prenotation prenotation) {
        this.prenotation = prenotation;
    }
}
