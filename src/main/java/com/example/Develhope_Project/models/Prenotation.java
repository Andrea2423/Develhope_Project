package com.example.Develhope_Project.models;


//public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean calcolaTotale, String Comment, boolean annullata,  boolean reservationConfirmed ) {

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Prenotation {
    private String clientName;
    private int numeroPersone;
    private double price;
    private int durataPernottamento;
    private String comment;
    private String notificaCliente;
    private boolean annullata;
    private boolean reservationConfirmed;
    private String stampaRicevuta;

    public Prenotation(String clientName, int numeroPersone, double price, int durataPernottamento, String comment, String notificaCliente, boolean annullata, boolean reservationConfirmed , String stampaRicevuta) {
        this.clientName = clientName;
        this.numeroPersone = numeroPersone;
        this.price = price;
        this.durataPernottamento = durataPernottamento;
        this.comment = comment;
        this.notificaCliente = notificaCliente;
        this.annullata = annullata;
        this.reservationConfirmed = reservationConfirmed;
        this.stampaRicevuta = stampaRicevuta;
    }

    public Prenotation() {

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getNotificaCliente() {
        return notificaCliente;
    }
    public void setNotificaCliente(String notificaCliente) {
        this.notificaCliente = notificaCliente;
    }
    public boolean getAnnullata() {
        return annullata;
    }

    public void setAnnullata(boolean annullata) {
        this.annullata = annullata;
    }

    public boolean getReservationConfirmed() {
        return reservationConfirmed;
    }

    public void setReservationConfirmed(boolean reservationConfirmed) {
        this.reservationConfirmed = reservationConfirmed;
    }

    public String getStampaRicevuta() {
        return stampaRicevuta;
    }

    public void setStampaRicevuta(String stampaRicevuta) {
        this.stampaRicevuta = stampaRicevuta;
    }

    public String printDetails() {
        String result = "Dati personali cliente: " + clientName + "\n" + "numero persone prenotate : " + numeroPersone + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" + "Commento: " + comment
                + "\n" + "notifica: " + notificaCliente + "\n" + "vuoi annullare la prenotazione?" + annullata + "\n"
                + "la prenotazione è confermata? " + reservationConfirmed + "\n" + "Ricevuta: " + stampaRicevuta;
        return result;
    }


    public void addComment(String comment) {
        System.out.println("commento aggiunto: " + comment);
    }

    public void notificaCliente() {
        System.out.println(notificaCliente + "\n" + "la sua prenotazione è stata confermata!");
    }

    public void stampaRicevuta() {
        System.out.println("Ricevuta: " + stampaRicevuta);

    }



}


