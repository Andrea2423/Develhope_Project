package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.example.Prenotation.prenotazione;
import static org.junit.jupiter.api.Assertions.*;

public class PrenotationTest {

    @Test
    public void testPrintDetails() {
        Prenotation prenotation = new Prenotation(LocalDate.of(2023, 9, 7),
                "Luca Rossi", 2, LocalTime.of(10, 0),
                0.0, 3, false,  true);

        String result = prenotation.printDetails();

        assertEquals("Dati personali cliente: Luca Rossi\n" +
                "numero persone prenotate : 2\n" +
                "data di prenotazione: 2023-09-07\n" +
                "ora di prenotazione: 10:00\n" +
                "durata pernottamento giorni: 3\n" +
                "scegli il prezzo0.0\n" + "vuoi annullare la prenotazione?false" + "\n" +
                "la prenotazione è confermata? true", prenotation.printDetails());
    }
}

