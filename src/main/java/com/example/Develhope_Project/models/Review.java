package com.example.Develhope_Project.models;


import jakarta.persistence.*;


@Entity
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private double ratingLocation;

    private double ratingService;

    private double qualityPrice;

    private String commentReview;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }




    public Review() {

    }

    public Review(double ratingLocation, double ratingService, double qualityPrice, String commentReview) {
        this.ratingLocation = ratingLocation;
        this.ratingService = ratingService;
        this.qualityPrice = qualityPrice;
        this.commentReview = commentReview;
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


    @Override
    public String toString() {
        return "Review{" +
                " ratingLocation=" + ratingLocation +
                ", ratingService=" + ratingService +
                ", qualityPrice=" + qualityPrice +
                ", commentReview='" + commentReview + '\'' +
                '}';
    }
}
