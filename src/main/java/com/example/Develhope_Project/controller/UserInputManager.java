package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.Review;
import com.example.Develhope_Project.repository.DatabaseManager;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInputManager {


    /*
       questo metodo permette all'utente di creare una recensione e poi la inserisce direttamente nella tabella mySQL
       sicuramente da rivedere perchè vorrei inserire delle eccezioni, ma il metodo funziona
    */

    public void createReview(){
        DatabaseManager databaseManager = new DatabaseManager();

        Review review = new Review();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una valutazione da 1 a 5 per la location:");
        double valutationLocation = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Inserisci una valutazione da 1 a 5 per il servizio:");
        double valutationService = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Inserisci una valutazione da 1 a 5 per il rapporto qualità prezzo:");
        double valutationQualityPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Lasciaci un commento per descrivere la tua vancanza:");
        String commentReview = scanner.nextLine();

        review.setRatingLocation(valutationLocation);
        review.setRatingService(valutationService);
        review.setQualityPrice(valutationQualityPrice);
        review.setCommentReview(commentReview);

        databaseManager.insertReview(review);

        scanner.close();
    }

    public void createPrenotation() {

        DatabaseManager databaseManager = new DatabaseManager();

        Prenotation prenotation = new Prenotation();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter duration of stay: ");
        int durationOfStay = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter comment: ");
        String comment = scanner.nextLine();

        System.out.print("Is cancelled (true/false): ");
        boolean isCancelled = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Is reservation confirmed (true/false): ");
        boolean isReservationConfirmed = scanner.nextBoolean();

        String notificaCliente = scanner.nextLine();
        System.out.println("Prenotazione confermata a presto!");

        System.out.println("Vuoi stampare la ricevuta? (Si/No)");
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("Sì")) {
            System.out.println("Ricevuta della prenotazione:");
            System.out.println("Nome del cliente: " + clientName);
            System.out.println("Numero di persone: " + numberOfPeople);
            System.out.println("Durata della prenotazione: " + durationOfStay);
            System.out.println("Prezzo della prenotazione: " + price);

        } else {
            System.out.println("Grazie per aver utilizzato il nostro servizio!");
        }

        prenotation.setClientName(clientName);
        prenotation.setNumeroPersone(numberOfPeople);
        prenotation.setDurataPernottamento(durationOfStay);
        prenotation.setPrice(price);
        prenotation.setComment(comment);
        prenotation.setNotificaCliente(notificaCliente);
        prenotation.setAnnullata(isCancelled);
        prenotation.setReservationConfirmed(isReservationConfirmed);
        prenotation.setStampaRicevuta(risposta);

        databaseManager.insertPrenotation(prenotation);

        scanner.close();
    }
}
