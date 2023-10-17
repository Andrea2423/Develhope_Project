package org.example.models;

import java.util.List;

public class Review {
    private double ratingLocation;
    private double ratingService;
    private double qualityPrice;
    private String commentReview;


    public static double totalPointToStructure(Review review) {
        return review.getRatingLocation() + review.getRatingService() + review.getQualityPrice();
    }

    public double calculateTotalAvarageRatingToStructure() {
        double total = getRatingLocation() + getRatingService() + getQualityPrice();
        return total / 3;
    }

    public static double avarageRatingLocation(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getRatingLocation();
        }
        return total / reviewList.size();
    }

    public static double avarageRatingService(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getRatingService();
        }
        return total / reviewList.size();
    }

    public static double avarageRatingQualityPrice(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getQualityPrice();
        }
        return total / reviewList.size();
    }

    @Override
    public String toString() {
        return "Review{" +
                "ratingLocation: " + ratingLocation +
                ", ratingService: " + ratingService +
                ", qualityPrice: " + qualityPrice +
                ", commentReview: '" + commentReview + '\'' +
                '}';
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

}
