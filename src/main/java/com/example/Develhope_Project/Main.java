package com.example.Develhope_Project;

import com.example.Develhope_Project.controller.OwnerInputManager;
import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.Room;

import com.example.Develhope_Project.repository.Config;


import java.sql.*;

import static com.example.Develhope_Project.models.Room.canCheckIN;


public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, "Single", 1, true, true, 225);
        Room room2 = new Room(2, "Double", 2, true, false, 550);
        Room room3 = new Room(3, "Suite", 2, false, false, 1550);
        Room room4 = new Room(4, "Suite", 2, true, true, 2800);
        Room room5 = new Room(5, "Luxury", 2, false, true, 6000);


        canCheckIN(room3);


        Room[] rooms = {room1, room2, room3, room4, room5};
        for (int i = 0; i < rooms.length; i++) {

            System.out.println("Room #" + rooms[i].getRoomNumber());
            System.out.println("Room Type: " + rooms[i].getRoomType());
            System.out.println("Is Clean: " + rooms[i].getIsClean());
            System.out.println("Price: " + rooms[i].getPrice());
            System.out.println("\n");
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Config.NameDBdruwan, Config.UsernameDBdruwan, Config.PasswordDBdruwan);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT MAX(room_number) AS LAST_NUMBER " +
                    "FROM room WHERE room_number;");
            if (resultSet.next()) {
                int lastRoomNumber = resultSet.getInt("LAST_NUMBER");
                System.out.println("Last Room Number: " + lastRoomNumber); //per vedere l'ultimo numero di stanza creata
            }
            OwnerInputManager ownerInputManager = new OwnerInputManager();
            ownerInputManager.createRoom();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        Prenotation prenotation = new Prenotation();

        Prenotation[] prenotations = {prenotation};
        for (int i = 0; i < prenotations.length; i++) {
            System.out.println(prenotation.printDetails());
        }


    }

}


