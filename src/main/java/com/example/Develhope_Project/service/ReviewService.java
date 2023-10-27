package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.ReviewRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    RoomRepository roomRepository;


    public void insertReview(Review review, int roomID){
        Room room = roomRepository.findById(roomID).get();
        review.setRoom(room);
        reviewRepository.save(review);
    }


    public List<Review>viewAllViews(){
        return reviewRepository.findAll();
    }



    /*
    in questa lista poi passeranno le recensioni che verranno richiestie
    con le chiamate API e che riguardano la medesima struttura

    poi farò un metodo per prendere la recensione ricercata e così potrà calcolare
    e seguire i metodi sulla recensione richiesta
     */
    private List<Review> reviewList = new ArrayList<>();

    public double avarageRatingLocation(List<Review> reviewList){
        double total = 0;
        for (Review review1 : reviewList){
            total += review1.getRatingLocation();
        }
        return total / reviewList.size();
    }

    public double averageRatingService(List<Review> reviewList){
        double total = 0;
        for (Review review : reviewList){
            total += review.getRatingService();
        }
        return total / reviewList.size();
    }

    public double averageRatingQualityPrice(List<Review> reviewList){
        double total = 0;
        for (Review review : reviewList){
            total += review.getQualityPrice();
        }
        return total / reviewList.size();
    }

    public double totalAverageRatingToStructure(List<Review> reviewList){
        double total = 0;
        for (Review review : reviewList){
            total += review.getRatingLocation() + review.getRatingService() + review.getQualityPrice();
        }
        return total / 3;
    }

    public String showReview(List<Review> reviewList){
        String result = "";
        for (Review review : reviewList){
            result = review.getCommentReview();
        }
        return result;
    }


    public ReviewService(){

    }

    public ReviewService(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
}
