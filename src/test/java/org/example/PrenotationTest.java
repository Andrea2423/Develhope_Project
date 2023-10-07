package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrenotationTest {

    @Test
    public void testPrintDetails() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", false, true);

        String result = prenotation.printDetails();
        System.out.println(result);

        assertEquals("Dati personali cliente: Luca Rossi\n" +
                "numero persone prenotate : 2\n" +
                "durata pernottamento giorni: 3\n" +
                "scegli il prezzo100.0\n" + "Commento: richiesta di letto extra" + "\n" + "vuoi annullare la prenotazione?false" + "\n" +
                "la prenotazione è confermata? true", prenotation.printDetails());
    }

    @Test
    public void testAddComment() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", false, true);

        prenotation.addComment("richiesta di letto extra");

        assertEquals("richiesta di letto extra", prenotation.getComment());
    }
}
