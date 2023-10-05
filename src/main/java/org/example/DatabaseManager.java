package org.example;

import java.sql.*;

public class DatabaseManager {

    public void insertReview(Review review) {

        String queryInsert = "INSERT INTO review(location_rating, service_rating, quality_price_rating, comment_review) VALUES(?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "developerCamu*@");

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
            preparedStatement.setInt(1, review.getRatingLocation());
            preparedStatement.setInt(2, review.getRatingService());
            preparedStatement.setInt(3, review.getQualityPrice());
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

    public void insertPrenotation(Prenotation prenotation) {

        String queryInsert = "INSERT INTO prenotation(costumers_names, number_of_people_booked, booking_date_and_time, duration_of_the_booking, price, calculate_total, extra_customer_requests, cancel_the_reservation, reservation_confirmed) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_project",
                    "root",
                    "Maicoldevelhope12.");

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);

            preparedStatement.setString(1, prenotation.nomiClienti());
            preparedStatement.setInt(2, prenotation.numeroPersone());
            preparedStatement.setDate(3, Date.valueOf(prenotation.data()));
            preparedStatement.setTime(4, Time.valueOf(prenotation.time()));
            preparedStatement.setInt(5, prenotation.durataPernottamento());
            preparedStatement.setDouble(6, prenotation.price());
            preparedStatement.setBoolean(7, prenotation.calcolaTotale());
            preparedStatement.setString(8, prenotation.Comment());
            preparedStatement.setBoolean(9, prenotation.annullata());
            preparedStatement.setBoolean(10, prenotation.reservationConfirmed());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

}
