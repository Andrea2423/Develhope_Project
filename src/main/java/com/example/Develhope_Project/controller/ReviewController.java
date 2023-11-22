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


    @DeleteMapping("/{roomID}/{id}")
    public ResponseEntity deleteReview(@PathVariable int roomID, @PathVariable int id) throws Exception{

        try {
            reviewService.deleteReview(roomID, id);

            return ResponseEntity.ok(String.format("Review with ID %s deleted", id));
        } catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

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
