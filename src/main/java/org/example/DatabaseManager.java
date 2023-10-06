package org.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseManager {

    public void insertReview(Review review) {

        String queryInsert = "INSERT INTO review(location_rating, service_rating, quality_price_rating, comment_review) VALUES(?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "developerCamu*@");

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setDouble(1, review.getRatingLocation());
            preparedStatement.setDouble(2, review.getRatingService());
            preparedStatement.setDouble(3, review.getQualityPrice());
            preparedStatement.setString(4, review.getCommentReview());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

    public void insertUser(User user) {

        String queryInsert = "INSERT INTO user(name, surname, date_of_birth, email, phone_number, method_payment) VALUES(?, ?, ?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "developerCamu*@");

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setDate(3, Date.valueOf(user.getDateOfBirth()));
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getTelephoneNumber());
            preparedStatement.setString(6, user.getPaymentMethod());


            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

    public void insertRoom(Room room) {

        String queryInsert = "INSERT INTO room(room_number, room_type, room_guest, room_cost, room_available, room_clean) VALUES( ? , ? , ? , ? , ? , ? )";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "Asdasd123stella.");
            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setInt(1, room.getRoomNumber());
            preparedStatement.setString(2, room.getRoomType());
            preparedStatement.setInt(3, room.getGuests());
            preparedStatement.setDouble(4, room.getPrice());
            preparedStatement.setBoolean(5, room.getavailable());
            preparedStatement.setBoolean(6, room.getIsClean());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

}
