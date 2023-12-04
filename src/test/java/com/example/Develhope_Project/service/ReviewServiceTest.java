package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.repository.ReviewRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReviewServiceTest {


    private ReviewService reviewService;



    @Test
    public void testInsertReview(){

        Room room = new Room();
        room.setId(1);

        Review review = new Review();
        review.setRoom(room);


        assertEquals(1, room.getId());

        assertEquals(room, review.getRoom());
    }








}