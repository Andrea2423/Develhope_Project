package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prenotation {
    //variabili di istanza

    //attributo
    private LocalDate data;
    private String nomeCliente;
    private int numeroPersone;
    private LocalTime time;
    private double price;
    private int durataPernottamento;
    private boolean reservationConfirmed;


    //metodo costruttore
    public Prenotation(LocalDate data, String nomeCliente, int numeroPersone, boolean reservationConfirmed, LocalTime time, double price, int durataPernottamento) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.numeroPersone = numeroPersone;
        this.time = time;
        this.reservationConfirmed = reservationConfirmed;
        this.durataPernottamento = durataPernottamento;
        this.price = price;
    }


    // Metodi get e set per accedere e modificare gli attributi
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDurataPernottamento() {
        return durataPernottamento;
    }

    public void setDurataPernottamento(int durataPernottamento) {
        this.durataPernottamento = durataPernottamento;
    }

    public boolean getreservationConfirmed() {
        return reservationConfirmed;
    }

    public void setreservationConfirmed(boolean reservationConfirmed) {
        this.reservationConfirmed = reservationConfirmed;
    }

    public LocalTime getLocalTime() {
        return getLocalTime();
    }

    public void LocalTime(LocalTime time) {
        this.time = time;
    }

    public void printDetails() {
        System.out.println("Dati personali cliente: " + nomeCliente + "\n" + "numero persone prenotate : " +
                numeroPersone + "\n" + "data di prenotazione: " + data + "\n" + "ora di prenotazione: " + time + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" +
                "la prenotazione è confermata? " + reservationConfirmed);
    }
}