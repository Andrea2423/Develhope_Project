package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReviewServiceTest {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private RoomService roomService;

    @Test
    void testInsertReview(){

        Review review = new Review();


        Room room = new Room();


        reviewService.insertReview(1, review);

        List<Review> result = reviewService.viewAllViewsByRoom(1);

        assertEquals(1, result.size());
    }


    @Test
    void testViewAllReviewsByRoom(){

        Review review1 = new Review();
        Review review2 = new Review();


        Room room = new Room();


        List<Review> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);

        reviewService.insertReview(1, review1);
        reviewService.insertReview(1, review2);

        List<Review> result = reviewService.viewAllViewsByRoom(1);

        assertEquals(result.size(), reviews.size());
    }

/*
    @Test
    void testUpdateReview(){

        Review review = new Review();

        reviewService.insertReview(1, review);

        reviewService.updateReview(1,
                Optional.of(4.5),
                Optional.of(4.0),
                Optional.of(4.0),
                Optional.of("New comment"));

        Review updatedReview = reviewService.getReviewById(1);


        assertEquals(4.5, updatedReview.getRatingLocation());
    }

 */

    @Test
    void testDeleteReview(){

        Room room = new Room();

        roomService.insertRoom(room);

        Review review = new Review();

        reviewService.insertReview(1,review);

        reviewService.deleteReview(1);

    }

}