package org.example;
import java.time.LocalDate;
import java.time.LocalTime;

public class Prenotation {
    //variabili di istanza
    private static LocalDate data;
    private static String nomeCliente;
    private static int numeroPersone;
    private static LocalTime time;
    private static int durataPernottamento;
    private static boolean reservationConfirmed;


    //metodo costruttore
    public Prenotation(LocalDate data, String nomeCliente, int numeroPersone, boolean reservationConfirmed, LocalTime time, int durataPernottamento) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.numeroPersone = numeroPersone;
        this.time = time;
        this.reservationConfirmed = reservationConfirmed;
        this.durataPernottamento = durataPernottamento;
    }




    // Metodi get e set per accedere e modificare gli attributi
    public static LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public static int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public static int getDurataPernottamento() {
        return durataPernottamento;
    }

    public void setDurataPernottamento(int durataPernottamento) {
        this.durataPernottamento = durataPernottamento;
    }

    public static boolean getreservationConfirmed() {
        return reservationConfirmed;
    }

    public void setreservationConfirmed(boolean reservationConfirmed) {
        this.reservationConfirmed = reservationConfirmed;
    }

    public static LocalTime getLocalTime() {
        return getLocalTime();
    }

    public void LocalTime (LocalTime time) {
        this.time = time;

    }

    public void printDetails() {
        System.out.println("Dati personali cliente: " + nomeCliente + "\n" + "numero persone prenotate : " +
                numeroPersone + "\n"  + "data di prenotazione: " + data + "\n" + "ora di prenotazione: " + time + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "la prenotazione è confermata? " +  reservationConfirmed);
    }

  

}
