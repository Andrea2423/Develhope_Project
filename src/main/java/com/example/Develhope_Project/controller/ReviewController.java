package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.ReviewRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;


    @PostMapping("/insert-new-review")
    public String insertNewReview(@RequestBody Review review, @RequestParam int roomID) {
        reviewService.insertReview(roomID, review);
        return "New review inserted";
    }


    @GetMapping("/view-review-by-id")
    public Review getReviewByID(@RequestParam int reviewID){
        return reviewService.getReviewById(reviewID);
    }


    @GetMapping("/view-review-by-room")
    public List<Review> reviewList(int roomID) {
        return reviewService.viewAllViewsByRoom(roomID);
    }


    @PutMapping("/review-update")
    public String updateReview(@RequestParam int id, @RequestBody Review review) {

        reviewService.updateReview(id,
                Optional.of(review.getRatingLocation()),
                Optional.of(review.getRatingService()),
                Optional.of(review.getQualityPrice()),
                Optional.ofNullable(review.getCommentReview()));

        return "Review updated";
    }


    @DeleteMapping("/review-delete")
    public String deleteReview(@RequestParam int id) {
        reviewService.deleteReview(id);

        return "Review with ID " + id + " deleted";
    }

}
