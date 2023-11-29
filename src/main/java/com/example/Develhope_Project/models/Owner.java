package com.example.Develhope_Project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String address;

    @Column(unique = true)
    private String email;

    private String phoneNumber;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Hotel> hotels;



    public Owner(){

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public List<Hotel> getHotels() {
        return hotels;
    }


    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
