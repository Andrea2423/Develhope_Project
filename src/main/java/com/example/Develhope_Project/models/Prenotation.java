package com.example.Develhope_Project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;


//public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean calcolaTotale, String Comment, boolean annullata,  boolean reservationConfirmed ) {

@Entity
public class Prenotation {

    @Id
    @GeneratedValue
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date prenotationDate;
    private String clientName;
    private int numberOfPeopleBooked;
    private double price;
    private int overnightStayDuration;
    private String comment;
    private boolean reservationCancelled;
    private boolean reservationConfirmed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @PrePersist
    protected void onCreate() {
        prenotationDate = new Date();
    }

    public Prenotation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPrenotationDate() {
        return prenotationDate;
    }

    public void setPrenotationDate(Date prenotationDate) {
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

    public int getOvernightStayDuration() {
        return overnightStayDuration;
    }

    public void setOvernightStayDuration(int overnightStayDuration) {
        this.overnightStayDuration = overnightStayDuration;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isReservationCancelled() {
        return reservationCancelled;
    }

    public void setReservationCancelled(boolean reservationCancelled) {
        this.reservationCancelled = reservationCancelled;
    }

    public boolean isReservationConfirmed() {
        return reservationConfirmed;
    }

    public void setReservationConfirmed(boolean reservationConfirmed) {
        this.reservationConfirmed = reservationConfirmed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


