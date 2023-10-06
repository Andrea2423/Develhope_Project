package org.example;

import java.util.Scanner;

public class OwnerInputManager {
    public void createRoom(){

        Room room = new Room();
        DatabaseManager databaseManager = new DatabaseManager();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Room Number:");
        int roomNumberScanner = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Room Type: ");
        String roomTypeScanner = scanner.nextLine();

        System.out.println("Guests: ");
        int roomGuests = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Room cost: ");
        double roomCost = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Is Available? True or False: ");
        boolean isAvailable = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Is clean? True or False: ");
        boolean isClean = scanner.nextBoolean();
        scanner.nextLine();

        room.setRoomNumber(roomNumberScanner);
        room.setRoomType(roomTypeScanner);
        room.setGuests(roomGuests);
        room.setPrice(roomCost);
        room.setAvailable(isAvailable);
        room.setClean(isClean);

        databaseManager.insertRoom(room);

        scanner.close();

    }

}
