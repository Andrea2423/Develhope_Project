package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.ReviewRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;


    @PostMapping("/insert-new-review")
    public String insertNewReview(@RequestBody Review review, @RequestParam int roomID){
        reviewService.insertReview(review, roomID);
        return "New review inserted";
    }


    @GetMapping("/view-review")
    public List<Review> reviewList(){
        return reviewService.viewAllViews();
    }


}
