package org.example;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Andrea", "Zora", "11-1-1999", "zora.andrea@gmail.com", 123456789, "PayPal");
        Prenotazione prenotazione1 = new Prenotazione();

        prenotazione1.setUser(user1);
        System.out.println(prenotazione1.toString());
    }
}