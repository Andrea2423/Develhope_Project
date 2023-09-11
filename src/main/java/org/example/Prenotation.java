package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean annullata,  boolean reservationConfirmed ) {
static Prenotation prenotazione;
    public String printDetails() {
        String result = "Dati personali cliente: " + nomeCliente + "\n" + "numero persone prenotate : " +
                numeroPersone + "\n" + "data di prenotazione: " + data + "\n" + "ora di prenotazione: " + time + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" + "vuoi annullare la prenotazione?" + annullata + "\n" + "la prenotazione è confermata? " + reservationConfirmed;
        return result;
    }
};


