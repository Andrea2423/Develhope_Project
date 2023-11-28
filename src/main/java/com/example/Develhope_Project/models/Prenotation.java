package com.example.Develhope_Project.models;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


//public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean calcolaTotale, String Comment, boolean annullata,  boolean reservationConfirmed ) {

@Entity
public class Prenotation {

    @Id
    @GeneratedValue
    private int id;


    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime prenotationDate;

    private String clientName;

    private int numberOfPeopleBooked;

    private double price;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate toStart;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate theEnd;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @JsonIgnore
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "room_id")
    @JsonIgnore
    private Room rooms;




    public Prenotation() {
        this.prenotationDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getPrenotationDate() {
        return prenotationDate;
    }

    public void setPrenotationDate(LocalDateTime prenotationDate) {
        this.prenotationDate = prenotationDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }

    public LocalDate getToStart() {
        return toStart;
    }

    public void setToStart(LocalDate toStart) {
        this.toStart = toStart;
    }

    public LocalDate getTheEnd() {
        return theEnd;
    }

    public void setTheEnd(LocalDate theEnd) {
        this.theEnd = theEnd;
    }
}


