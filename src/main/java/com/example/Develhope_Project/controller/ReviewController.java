package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {
    @Autowired
    ReviewRepository reviewRepository;

    @PostMapping("/insert-new-review")
    public String insertNewReview(@RequestBody Review review){
        reviewRepository.save(review);
        return "New review inserted";
    }


    @GetMapping("/view-review")
    public List<Review> reviewList(){
        return reviewRepository.findAll();
    }
}
