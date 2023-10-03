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
                0.0, 3, false, "richiesta di letto extra", false, true);

        String result = prenotation.printDetails();
        System.out.println(result);

        assertEquals("Dati personali cliente: Luca Rossi\n" +
                "numero persone prenotate : 2\n" +
                "data di prenotazione: 2023-09-07\n" +
                "ora di prenotazione: 10:00\n" +
                "durata pernottamento giorni: 3\n" +
                "scegli il prezzo0.0\n" + "calcola totalefalse\n" + "Commento: richiesta di letto extra" + "\n" + "vuoi annullare la prenotazione?false" + "\n" +
                "la prenotazione è confermata? true", prenotation.printDetails());
    }

        @Test
    public void testCalculateTotal() {
        Prenotation prenotation = new Prenotation(LocalDate.of(2023, 9, 7),
                "Luca Rossi", 2, LocalTime.of(10, 0),
                100.0, 3, false, "Commento: richiesta di letto extra", false, true);

        double total = prenotation.calculateTotal();

        assertEquals(300.0, total, 0.01); // Assicura che il totale sia 300.0
    }

    @Test
    public void testAddComment() {
        Prenotation prenotation = new Prenotation(LocalDate.of(2023, 9, 7),
                "Luca Rossi", 2, LocalTime.of(10, 0),
                100.0, 3, false, "richiesta di letto extra", false, true);

        prenotation.addComment("richiesta di letto extra");

        assertEquals("richiesta di letto extra", prenotation.Comment());
    }
}
