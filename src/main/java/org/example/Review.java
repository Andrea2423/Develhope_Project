package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Review {
    int hotelRating;
    String commentHotel;
    String dataReview;



    public Review(int hotelRating, String commentHotel, String dataReview){
        this.hotelRating = hotelRating;
        this.commentHotel = commentHotel;
        this.dataReview = dataReview;
    }
}
