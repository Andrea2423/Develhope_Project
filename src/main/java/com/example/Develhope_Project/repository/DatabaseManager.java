package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.models.User;

import java.sql.*;

public class DatabaseManager {

    public void insertReview(Review review) {

        String queryInsert = "INSERT INTO review(location_rating, service_rating, quality_price_rating, comment_review) VALUES(?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBcamu, Config.UsernameDBcamu, Config.PasswordDBcamu);

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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBcamu, Config.UsernameDBcamu, Config.PasswordDBcamu);

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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBdruwan, Config.UsernameDBdruwan, Config.PasswordDBdruwan);
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


    public void insertPrenotation(Prenotation prenotation) {

        String queryInsert = "INSERT INTO prenotation(costumers_names, number_of_people_booked, duration_of_the_booking, price, extra_customer_requests, cancel_the_reservation, reservation_confirmed) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBmike, Config.UsernameDBmike, Config.PasswordDBmike);

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);

            preparedStatement.setString(1, prenotation.getClientName());
            preparedStatement.setInt(2, prenotation.getNumeroPersone());
            preparedStatement.setInt(3, prenotation.getDurataPernottamento());preparedStatement.setDouble(4, prenotation.getPrice());
            preparedStatement.setString(5, prenotation.getComment());
            preparedStatement.setBoolean(6, prenotation.getAnnullata());
            preparedStatement.setBoolean(7, prenotation.getReservationConfirmed());


            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

    /*
    metodo per selezionare tutte le recensioni, ma dopo lo modificherò perchè
    non ha senso selezionare tutte le recensioni, ma ha più senso collegare la struttura della quale voglio
    vedere la recensione e soprattutto l'utente che ha fatto la recensione
     */

    public void selectAllFromReview() {

        String querySelect = "SELECT * FROM review WHERE data_review < NOW()";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBcamu, Config.UsernameDBcamu, Config.PasswordDBcamu);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(querySelect);

            while (resultSet.next()) {
                int reviewID = resultSet.getInt("review_id");
                double ratingLocation = resultSet.getDouble("location_rating");
                double ratingService = resultSet.getDouble("service_rating");
                double ratingQualityPrice = resultSet.getDouble("quality_price_rating");
                String commentReview = resultSet.getString("comment_review");
                Timestamp dateReview = resultSet.getTimestamp("data_review");

                System.out.println("id recensione: " + reviewID);
                System.out.println("valutazione location: " + ratingLocation);
                System.out.println("valutazione del servizio: " + ratingService);
                System.out.println("valutazione rapporto qualità - prezzo: " + ratingQualityPrice);
                System.out.println("commento del soggiorno: " + commentReview);
                System.out.println("data recensione: " + dateReview);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void selectAllFromPrenotation() {

        String querySelect = "SELECT * FROM prenotation";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBmike, Config.UsernameDBmike, Config.PasswordDBmike);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(querySelect);

            while (resultSet.next()) {
                int idPrenotation = resultSet.getInt("id_prenotation");
                String clientName = resultSet.getString("costumers_names");
                int numberPerson = resultSet.getInt("number_of_people_booked");
                Timestamp dataPrenotation = resultSet.getTimestamp("booking_date_and_time");
                int durataPernottamento = resultSet.getInt("duration_of_the_booking");
                double price = resultSet.getDouble("price");
                boolean annullata = resultSet.getBoolean("cancel_the_reservation");
                boolean reservationConfirmed = resultSet.getBoolean("reservation_confirmed");

                System.out.println("id prenotazione: " + idPrenotation);
                System.out.println("nomi clienti: " + clientName);
                System.out.println("numero persone prenotate: " + numberPerson);
                System.out.println("data prenotazione: " + dataPrenotation);
                System.out.println("durata pernottamento: " + durataPernottamento);
                System.out.println("prezzo camera: " + price);
                System.out.println("prenotazione annullata?: " + annullata);
                System.out.println("prenotazione confermata?: " + reservationConfirmed);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAllFromRoom() {
        String querySelect = "SELECT * FROM room";

        try {
            Connection connection = DriverManager.getConnection(Config.urlDB + Config.NameDBdruwan, Config.UsernameDBdruwan, Config.PasswordDBdruwan);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(querySelect);

            while (resultSet.next()) {
                int room_number = resultSet.getInt("room_number");
                String room_type = resultSet.getString("room_type");
                int room_guest = resultSet.getInt("room_guest");
                double room_cost = resultSet.getDouble("room_cost");
                boolean room_available = resultSet.getBoolean("room_available");
                boolean room_clean = resultSet.getBoolean("room_clean");

                System.out.println("-Room number: " + room_number);
                System.out.println("--Room type: " + room_type);
                System.out.println("---Room guest: " + room_guest);
                System.out.println("----Room cost: €" + room_cost);
                System.out.println("-----Room is available? " + room_available);
                System.out.println("------Room is clean? " + room_clean);
            }

        } catch (SQLException e) {

        }
    }

}
