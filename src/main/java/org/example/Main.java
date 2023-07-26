package org.example;

public class Main {
    public static void main(String[] args)  {


        //Esempio di creazione di un'istanza della classe Prenotazione

        Prenotation prenotazione1 = new Prenotation("2023-07-25", "Mario Rossi", 1, true);
        Prenotation prenotazione2 = new Prenotation("2023-08-10", "Luca Bianchi", 1, true);
        Prenotation prenotazione3 = new Prenotation("2023-09-05", "Giulia Verdi", 1, true);

        /*System.out.println(Prenotation.getData());
        System.out.println(Prenotation.getNomeCliente());
        System.out.println(Prenotation.getNumeroPersone());
        System.out.println(Prenotation.getreservationConfirmed());*/


        /////////////////////////////////////////////
        System.out.println(Prenotation.getData());
        prenotazione1.setData("2023-07-25");
        prenotazione1.setData("2023-07-25");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione1.setNomeCliente("Mario Rossi");
        prenotazione1.setNomeCliente("Mario Rossi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione1.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione1.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);
        /////////////////////////////////////////////

        /////////////////////////////////////////////
        System.out.println(Prenotation.getData());
        prenotazione2.setData("2023-08-10");
        prenotazione1.setData("2023-08-10");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione2.setNomeCliente("Luca Bianchi");
        prenotazione1.setNomeCliente("Luca Bianchi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione2.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione2.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);
        /////////////////////////////////////////////

        /////////////////////////////////////////////
        System.out.println(Prenotation.getData());
        prenotazione3.setData("2023-09-05");
        prenotazione1.setData("2023-09-05");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione3.setNomeCliente("Giulia Verdi");
        prenotazione1.setNomeCliente("Giulia Verdi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione3.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione3.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);
        /////////////////////////////////////////////





















    }
}