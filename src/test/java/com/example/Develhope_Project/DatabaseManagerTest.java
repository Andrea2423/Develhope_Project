package com.example.Develhope_Project;

import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.DatabaseManager;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DatabaseManagerTest {
    DatabaseManager databaseManager = new DatabaseManager();

    @Test
    public void testInsertReview() {
        Review review3 = new Review();

        review3.setRatingLocation(5);
        review3.setRatingService(5);
        review3.setQualityPrice(5);
        review3.setCommentReview("Test");

        databaseManager.insertReview(review3);

        String querySelect = "SELECT * FROM review WHERE comment_review = ?";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "developerCamu*@");
            PreparedStatement selectStatement = connection.prepareStatement(querySelect);
            selectStatement.setString(1, "Test");
            ResultSet resultSet = selectStatement.executeQuery();

            assertTrue(resultSet.next());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public  void testInsertUser(){
        User user = new User("Simone",
                "Benedetti",
                LocalDate.of(1994,3,7),
                "simone94@gmail.com",
                "3698521470",
                "no money");

        databaseManager.insertUser(user);

        String querySelect = "SELECT * FROM user WHERE email = ?";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "developerCamu*@");
            PreparedStatement selectStatement = connection.prepareStatement(querySelect);
            selectStatement.setString(1, "simone94@gmail.com");
            ResultSet resultSet = selectStatement.executeQuery();

            assertTrue(resultSet.next());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}