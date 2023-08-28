package org.example;

import java.time.LocalDateTime;

public class Review {
    private String reviewerName;
    private String stayDate;
    private int hotelRating;

    private String commentHotel;

    private LocalDateTime dataReview;

    public String getReviewerName(){
        return reviewerName;
    }

    public void setReviewerName(String reviewerName){
        this.reviewerName = reviewerName;
    }

    public String getStayDate(){
        return stayDate;
    }

    public void setStayDate(String stayDate){
        this.stayDate = stayDate;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getCommentHotel() {
        return commentHotel;
    }

    public void setCommentHotel(String commentHotel) {
        this.commentHotel = commentHotel;
    }

    public LocalDateTime getDataReview() {
        return dataReview;
    }

    public void setDataReview(LocalDateTime dataReview) {
        this.dataReview = dataReview;
    }



    public Review(String reviewerName,String stayDate, int hotelRating, String commentHotel, LocalDateTime dataReview){
        this.reviewerName = reviewerName;
        this.stayDate = stayDate;
        this.hotelRating = hotelRating;
        this.commentHotel = commentHotel;
        this.dataReview = dataReview;
    }

    public void printDetails(){
        System.out.println( "Nome dell'autore della recensione: " + reviewerName + "\n" + "periodo del soggiormo presso la struttura: "+ stayDate + "\n"+"valutazione data dal cliente: " + hotelRating + "\n" +
                "commento del cliente: " + commentHotel + "\n" +
                "data della recensione: " + dataReview);
    }
}
