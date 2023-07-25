package org.example;

import java.util.Date;
import java.util.Scanner;

public class Review_Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisca di sotto la valutazione del suo soggiorno, grazie.");

        System.out.println("valutazione da 1 a 10 del suo soggiorno:");
        int hotelRating = scanner.nextInt();
        scanner.nextLine();

        System.out.println("perché ?:");
        String commentHotel = scanner.nextLine();

        System.out.println("data:");
        String dataReview =scanner.nextLine();

        Review firstReview = new Review(hotelRating, commentHotel, dataReview);

        System.out.println("valutazione data dal cliente: " + firstReview.hotelRating + "\n" +
                "commento del cliente: " + firstReview.commentHotel + "\n" +
                "data della recensione: " + firstReview.dataReview);

        scanner.close();
    }
}
