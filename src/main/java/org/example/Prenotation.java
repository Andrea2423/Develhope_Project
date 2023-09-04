package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prenotation {
    //variabili di istanza

    //attributo
    private static LocalDate data;
    private static String nomeCliente;
    private static int numeroPersone;
    private static LocalTime time;
    private static double price;
    private static int durataPernottamento;
    private static boolean reservationConfirmed;


    //metodo costruttore
    public Prenotation(LocalDate data, String nomeCliente, int numeroPersone, boolean reservationConfirmed, LocalTime time, double price, int durataPernottamento) {
        Prenotation.data = data;
        Prenotation.nomeCliente = nomeCliente;
        Prenotation.numeroPersone = numeroPersone;
        Prenotation.time = time;
        Prenotation.reservationConfirmed = reservationConfirmed;
        Prenotation.durataPernottamento = durataPernottamento;
        Prenotation.price = price;
    }


    // Metodi get e set per accedere e modificare gli attributi
    public static LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        Prenotation.data = data;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        Prenotation.nomeCliente = nomeCliente;
    }

    public static int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        Prenotation.numeroPersone = numeroPersone;
    }

    public static int getPrice() {
        return (int) price;
    }

    public void setPrice(int price) {
        Prenotation.price = price;
    }

    public static int getDurataPernottamento() {
        return durataPernottamento;
    }

    public void setDurataPernottamento(int durataPernottamento) {
        Prenotation.durataPernottamento = durataPernottamento;
    }

    public static boolean getreservationConfirmed() {
        return reservationConfirmed;
    }

    public void setreservationConfirmed(boolean reservationConfirmed) {
        Prenotation.reservationConfirmed = reservationConfirmed;
    }

    public static LocalTime getLocalTime() {
        return getLocalTime();
    }

    public void LocalTime(LocalTime time) {
        Prenotation.time = time;
    }

    public void printDetails() {
        System.out.println("Dati personali cliente: " + nomeCliente + "\n" + "numero persone prenotate : " +
                numeroPersone + "\n" + "data di prenotazione: " + data + "\n" + "ora di prenotazione: " + time + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" + "la prenotazione è confermata? " + reservationConfirmed);
    }


}