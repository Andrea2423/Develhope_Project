package com.example.Develhope_Project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double ratingLocation;

    private double ratingService;

    private double qualityPrice;

    private String commentReview;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "room_id")
    @JsonIgnore
    private Room room;


    public Review() {
        this.dateCreation = new Date();                 // così inserisce la data ogni volta che creo un oggetto review
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRatingLocation() {
        return ratingLocation;
    }

    public void setRatingLocation(double ratingLocation) {
        this.ratingLocation = ratingLocation;
    }

    public double getRatingService() {
        return ratingService;
    }

    public void setRatingService(double ratingService) {
        this.ratingService = ratingService;
    }

    public double getQualityPrice() {
        return qualityPrice;
    }

    public void setQualityPrice(double qualityPrice) {
        this.qualityPrice = qualityPrice;
    }

    public String getCommentReview() {
        return commentReview;
    }

    public void setCommentReview(String commentReview) {
        this.commentReview = commentReview;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
