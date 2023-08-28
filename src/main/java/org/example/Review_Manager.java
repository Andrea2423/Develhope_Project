package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Review_Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisca di sotto la valutazione del suo soggiorno, grazie.");

        System.out.println("Prima di inserire la sua recensione deve inserire il suo nome: ");
        String reviewerName = scanner.nextLine();

        System.out.println("Data del suo soggiorno: ");
        String stayData = scanner.nextLine();

        System.out.println("valutazione da 1 a 10 del suo soggiorno:");
        int hotelRating = scanner.nextInt();
        scanner.nextLine();

        System.out.println("perché ?:");
        String commentHotel = scanner.nextLine();

        LocalDateTime dataReview = LocalDateTime.now();

        Review firstReview = new Review(reviewerName, stayData, hotelRating, commentHotel, dataReview);

        scanner.close();

        firstReview.printDetails();
    }
}
