package org.example;


public class Prenotation {

    private static String data;
    private static String nomeCliente;
    private static int numeroPersone;
    private static boolean reservationConfirmed;


    //metodo costruttore
    public Prenotation(String data, String nomeCliente, int numeroPersone, boolean reservationConfirmed) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.numeroPersone = numeroPersone;
        this.reservationConfirmed = reservationConfirmed;
    }


    // Metodi get e set per accedere e modificare gli attributi
    public static String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public  void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public static int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }

    public static boolean getreservationConfirmed() {
        return reservationConfirmed;
    }

    public void setreservationConfirmed(boolean reservationConfirmed) {
        this.reservationConfirmed = reservationConfirmed;
    }
}
