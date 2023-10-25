package com.example.Develhope_Project;

import com.example.Develhope_Project.models.Prenotation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrenotationTest {

    @Test
    public void testPrintDetails() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", "", false, true, "");

        String result = prenotation.printDetails();
        System.out.println(result);

        assertEquals("Dati personali cliente: Luca Rossi\n" +
                "numero persone prenotate : 2\n" +
                "durata pernottamento giorni: 3\n" +
                "scegli il prezzo100.0\n" + "Commento: richiesta di letto extra" + "\n"
                + "notifica: " + "\n" + "vuoi annullare la prenotazione?false" + "\n" +
                "la prenotazione è confermata? true" + "\n" + "Ricevuta: ",prenotation.printDetails());
    }


    @Test
    public void testAddComment() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", "notifica: ", false, true, "Ricevuta: ");

        String comment = "richiesta di letto extra";
        prenotation.addComment(comment);

        assertEquals(comment, prenotation.getComment());
    }

    @Test
    public void testNotificaCliente() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", "notifica: ", false, true, "Ricevuta: ");

        prenotation.notificaCliente();

        assertEquals("notifica: ", prenotation.getNotificaCliente());
    }


    @Test
    public void testStampaRicevuta() {
        Prenotation prenotation = new Prenotation(
                "Luca Rossi", 2,
                100.0, 3, "richiesta di letto extra", "notifica: ", false, true, "Ricevuta: ");
    }
}
