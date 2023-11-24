package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {


    @Autowired
    ReviewService reviewService;


    @PostMapping("/{roomID}")
    public ResponseEntity insertNewReview(@RequestBody Review review, @PathVariable int roomID) {

        try{
            return ResponseEntity.ok(reviewService.insertReview(roomID, review));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/{roomID}")
    public ResponseEntity reviewList(@PathVariable int roomID) {

        try {
            return ResponseEntity.ok(reviewService.viewAllViewsByRoom(roomID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity updateReview(@PathVariable int id, @RequestBody Review review) {

        try {
            return ResponseEntity.ok(reviewService.updateReview(id,
                    review));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }


    }


    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable int id) {

        reviewService.deleteReview(id);

        return String.format("Review with ID %s deleted ", id);
    }



    @GetMapping("/avg/{roomID}")
    public ResponseEntity avgRoom(@PathVariable int roomID){

        try {
            return ResponseEntity.ok(reviewService.AVGRating(roomID));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
