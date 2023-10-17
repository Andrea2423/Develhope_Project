package org.example.controller;

import org.example.repository.DatabaseManager;
import org.example.models.Room;

import java.util.Scanner;

public class OwnerInputManager {
    public void createRoom() {

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
        scanner.nextLine();

    }

    /*
    creato questo metodo dove potenzialmente potremmo inserire tutti i metodi che richiedono ad un utente di
    interagire tramite console grazie allo switch case
     */
    public void ownerAction() {

        System.out.println("se vuoi vedere tutte le recensioni, inserisci il numero 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        switch (number) {
            case 1:
                DatabaseManager databaseManager = new DatabaseManager();
                databaseManager.selectAllFromReview();
                break;
            case 2:
                DatabaseManager databaseManager2 = new DatabaseManager();
                databaseManager2.selectAllFromPrenotation();
                break;
        }

        scanner.close();
    }

}
