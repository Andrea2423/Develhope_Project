package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Modifying
    @Query("UPDATE Review r SET r.ratingLocation = :ratingLocation, " +
            "r.ratingService = :ratingService, " +
            "r.qualityPrice = :qualityPrice, " +
            "r.commentReview = :commentReview " +
            "WHERE r.id = :id")
    void updateReview(@Param("id") int id,
                      @Param("ratingLocation") double ratingLocation,
                      @Param("ratingService") double ratingService,
                      @Param("qualityPrice") double qualityPrice,
                      @Param("commentReview") String commentReview);
}
