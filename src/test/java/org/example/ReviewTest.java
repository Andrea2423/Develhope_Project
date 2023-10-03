package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ReviewTest {

    private Review review = new Review(new User("Claudio", "Caporaso", LocalDate.of(1999, 6, 7), "claudio.ca@gmail.com", "39354929602l", "Crypto"),
            new Room(0, "Doppia", 2, true, true, 75.50), 5, 5, 5, "Ottimo", LocalDateTime.now());
    private Review review2 = new Review(new User("Claudio", "Caporaso", LocalDate.of(1999, 6, 7), "claudio.ca@gmail.com", "39354929602l", "Crypto"),
            new Room(0, "Doppia", 2, true, true, 75.50), 5, 5, 5, "Perfetto", LocalDateTime.now());

    @Test
    public void testTotalPointToStructure() {
        int total = Review.totalPointToStructure(review);
        assertEquals(15, total);
    }

    @Test
    public void testAvarageRatingLocation() {
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);
        reviewList.add(review2);

        double x = Review.avarageRatingLocation(reviewList);
        assertEquals(5, x);
    }

    @Test
    public void testAvarageRatingService() {
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);
        reviewList.add(review2);

        double x = Review.avarageRatingService(reviewList);
        assertEquals(5, x);
    }

    @Test
    public void testAvarageRatingQualityPrice() {
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);
        reviewList.add(review2);

        double x = Review.avarageRatingQualityPrice(reviewList);
        assertEquals(5, x);
    }

    @Test
    public void testCalculateTotalAvarageRatingToStructure() {
        double x = review.calculateTotalAvarageRatingToStructure();
        assertEquals(5, x);
    }

    @Test
    public void testInsertReview() {
        Review review3 = new Review();

        review3.setRatingLocation(5);
        review3.setRatingService(5);
        review3.setQualityPrice(5);
        review3.setCommentReview("Test");

        review3.insertReview(review3);
    }
}