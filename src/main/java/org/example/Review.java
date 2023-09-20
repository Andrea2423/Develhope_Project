package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Review {
    private User user;
    private Room room;
    private int ratingLocation;
    private int ratingService;
    private int qualityPrice;
    private String commentReview;
    private LocalDateTime dateReview;

    public static int totalPointToStructure(Review review) {
        return review.getRatingLocation() + review.getRatingService() + review.getQualityPrice();
    }

    public double calculateTotalAvarageRatingToStructure() {
        double total = getRatingLocation() + getRatingService() + getQualityPrice();
        return total / 3;
    }

    public static double avarageRatingLocation(List<Review> reviewList) {
        int total = 0;
        for (Review review : reviewList) {
            total += review.getRatingLocation();
        }
        return total / reviewList.size();
    }

    public static double avarageRatingService(List<Review> reviewList) {
        int total = 0;
        for (Review review : reviewList) {
            total += review.getRatingService();
        }
        return total / reviewList.size();
    }

    public static double avarageRatingQualityPrice(List<Review> reviewList) {
        int total = 0;
        for (Review review : reviewList) {
            total += review.getQualityPrice();
        }
        return total / reviewList.size();
    }

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user +
                ", room=" + room +
                ", ratingLocation=" + ratingLocation +
                ", ratingService=" + ratingService +
                ", qualityPrice=" + qualityPrice +
                ", commentReview='" + commentReview + '\'' +
                ", dateReview=" + dateReview +
                '}';
    }

    public Review(User user, Room room, int ratingLocation, int ratingService, int qualityPrice, String commentReview, LocalDateTime dateReview) {
        this.user = user;
        this.room = room;
        this.ratingLocation = ratingLocation;
        this.ratingService = ratingService;
        this.qualityPrice = qualityPrice;
        this.commentReview = commentReview;
        this.dateReview = dateReview;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRatingLocation() {
        return ratingLocation;
    }

    public void setRatingLocation(int ratingStructure) {
        this.ratingLocation = ratingLocation;
    }

    public int getRatingService() {
        return ratingService;
    }

    public void setRatingService(int ratingService) {
        this.ratingService = ratingService;
    }

    public int getQualityPrice() {
        return qualityPrice;
    }

    public void setQualityPrice(int qualityPrice) {
        this.qualityPrice = qualityPrice;
    }

    public String getCommentReview() {
        return commentReview;
    }

    public void setCommentReview(String commentReview) {
        this.commentReview = commentReview;
    }

    public LocalDateTime getDateReview() {
        return dateReview;
    }

    public void setDateReview(LocalDateTime dateReview) {
        this.dateReview = dateReview;
    }
}
