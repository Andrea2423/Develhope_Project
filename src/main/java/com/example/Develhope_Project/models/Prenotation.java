package com.example.Develhope_Project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

//public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean calcolaTotale, String Comment, boolean annullata,  boolean reservationConfirmed ) {

@Entity
public class Prenotation {

    @Id
    @GeneratedValue
    private int id;
    private String clientName;
    private int numeroPersone;
    private double price;
    private int durataPernottamento;
    private String comment;
    private boolean annullata;
    private boolean reservationConfirmed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public Prenotation(String clientName, int numeroPersone, double price, int durataPernottamento, String comment, boolean annullata, boolean reservationConfirmed) {
        this.clientName = clientName;
        this.numeroPersone = numeroPersone;
        this.price = price;
        this.durataPernottamento = durataPernottamento;
        this.comment = comment;
        this.annullata = annullata;
        this.reservationConfirmed = reservationConfirmed;
    }

    public Prenotation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAnnullata() {
        return annullata;
    }

    public boolean isReservationConfirmed() {
        return reservationConfirmed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String printDetails() {
        String result = "Dati personali cliente: " + clientName + "\n" + "numero persone prenotate : " + numeroPersone + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" + "Commento: " + comment
                + "\n" + "vuoi annullare la prenotazione?" + annullata + "\n" + "la prenotazione è confermata? " + reservationConfirmed;
        return result;
    }


    public void addComment(String comment) {
        System.out.println("commento aggiunto: " + comment);
    }


}


