import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotelMoresco = new Hotel();

        hotelMoresco.setHotelName("Hotel Moresco");
        hotelMoresco.setHotelRatingInStars(5.0);
        hotelMoresco.setHotelFloors(4);
        hotelMoresco.setHotelAddress("L’Hotel Moresco si trova in Via Aurelia 96 – 17051 Andora (SV).");
        hotelMoresco.setHotelInfo("L’albergo è situato in posizione centrale, sulla splendida passeggiata a mare di Levante.\n" +
                "I recenti lavori di rinnovamento hanno creato un ambiente gradevole che unisce il calore dell’accoglienza familiare al comfort di una moderna struttura.\n" +
                "La gestione curata direttamente dai gestori,pone particolare attenzione alla cucina ed al servizio, sempre attento e cordiale.\n" +
                "L’Hotel Moresco è convenzionato con lo stabilimento balneare, Bagni Europa, di fronte l’albergo. Avrete la possibilità di prenotare direttamente.\n" +
                "Consigliamo agli ospiti dell’ Hotel di prenotare, telefonicamente al 328/3533080," +
                "con largo anticipo il posto in spiaggia per i mesi Luglio ed Agosto per ottenere la garanzia di un posto riservato.");
        hotelMoresco.setHotelServices("L’albergo dispone di una sala da pranzo, una sala bar, una sala di soggiorno, una sala di ritrovo, ascensore ed aria condizionata.\n" +
                "Inoltre, a disposizione degli ospiti: wi-fi in tutto l’hotel ed un ampio dehor fiorito.\n" +
                "Il menù del nostro ristorante prevede una scelta tra due primi e due secondi (tre a cena) di carne e di pesce, con una preferenza per piatti liguri.\n" +
                "Per tutti nostri ospiti è inoltre disponibile un buffet self-service di verdure e sono possibili semplici variazioni preventivamente concordate.\n" +
                "Il servizio culla per i bimbi comprende anche la preparazione di alimenti specifici.");

        while(true) {
            System.out.print("Inserisci il nome dell'hotel per ricevere tutte le informazioni: ");
            String hotelName = input.nextLine();
            switch(hotelName) {
                case "Hotel Moresco":
                    System.out.println(hotelMoresco.toString());
                    break;
                default:
                    System.out.println("Hotel non trovato");
            }
        }
    }
}
