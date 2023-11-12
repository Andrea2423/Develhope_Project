package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.ReviewRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    RoomRepository roomRepository;


    public void insertReview(int roomID, Review review) {

        Room room = roomRepository.findById(roomID).get();
        review.setRoom(room);

        reviewRepository.save(review);
    }

    public Review getReviewById(int id){
        return reviewRepository.getById(id);
    }


    public List<Review> viewAllViewsByRoom(int RoomID) {

        Room room = roomRepository.findById(RoomID).orElse(null);

        if (room != null) {
            List<Review> reviews = room.getReviewList();
            return reviews;
        } else
            return null;
    }


    @Transactional
    public void updateReview(int id,
                             Optional<Double> ratingLocation,
                             Optional<Double> ratingService,
                             Optional<Double> qualityPrice,
                             Optional<String> commentReview) {

        Review review = reviewRepository.getById(id);

        if (review != null) {
            ratingLocation.ifPresent(review::setRatingLocation);
            ratingService.ifPresent(review::setRatingService);
            qualityPrice.ifPresent(review::setQualityPrice);
            commentReview.ifPresent(review::setCommentReview);

            reviewRepository.updateReview(id,
                    review.getRatingLocation(),
                    review.getRatingService(),
                    review.getQualityPrice(),
                    review.getCommentReview());
        }
    }


    public void deleteReview(int id) {
        reviewRepository.deleteById(id);
    }


    /*
    in questa lista poi passeranno le recensioni che verranno richiestie
    con le chiamate API e che riguardano la medesima struttura

    poi farò un metodo per prendere la recensione ricercata e così potrà calcolare
    e seguire i metodi sulla recensione richiesta
     */
    private List<Review> reviewList = new ArrayList<>();

    public double avarageRatingLocation(List<Review> reviewList) {
        double total = 0;
        for (Review review1 : reviewList) {
            total += review1.getRatingLocation();
        }
        return total / reviewList.size();
    }

    public double averageRatingService(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getRatingService();
        }
        return total / reviewList.size();
    }

    public double averageRatingQualityPrice(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getQualityPrice();
        }
        return total / reviewList.size();
    }

    public double totalAverageRatingToStructure(List<Review> reviewList) {
        double total = 0;
        for (Review review : reviewList) {
            total += review.getRatingLocation() + review.getRatingService() + review.getQualityPrice();
        }
        return total / 3;
    }

    public String showReview(List<Review> reviewList) {
        String result = "";
        for (Review review : reviewList) {
            result = review.getCommentReview();
        }
        return result;
    }


    public ReviewService() {

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
