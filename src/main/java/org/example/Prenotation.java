package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public record Prenotation(LocalDate data, String nomeCliente, int numeroPersone, LocalTime time, double price, int durataPernottamento, boolean reservationConfirmed) {

    public String printDetails() {
        String result = "Dati personali cliente: " + nomeCliente + "\n" + "numero persone prenotate : " +
                numeroPersone + "\n" + "data di prenotazione: " + data + "\n" + "ora di prenotazione: " + time + "\n" +
                "durata pernottamento giorni: " + durataPernottamento + "\n" + "scegli il prezzo" + price + "\n" + "la prenotazione è confermata? " + reservationConfirmed;
        return result;
    }
};


