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
@RequestMapping("/review")
public class ReviewController {


    @Autowired
    ReviewService reviewService;


    @PostMapping("/insert/{roomID}")
    public String insertNewReview(@RequestBody Review review, @PathVariable int roomID) {
        reviewService.insertReview(roomID, review);
        return "New review inserted";
    }


    @GetMapping("/view/{roomID}")
    public List<Review> reviewList(@PathVariable int roomID) {
        return reviewService.viewAllViewsByRoom(roomID);
    }


    @PutMapping("/update/{id}")
    public String updateReview(@PathVariable int id, @RequestBody Review review) {

        reviewService.updateReview(id,
                Optional.of(review.getRatingLocation()),
                Optional.of(review.getRatingService()),
                Optional.of(review.getQualityPrice()),
                Optional.ofNullable(review.getCommentReview()));

        return "Review updated";
    }


    @DeleteMapping("/delete/{id}")
    public String deleteReview(@PathVariable int id) {
        reviewService.deleteReview(id);

        return "Review with ID " + id + " deleted";
    }

}
