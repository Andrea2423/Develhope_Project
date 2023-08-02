import java.util.Scanner;

public class TestHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hotel hotelMoresco = new Hotel();

        hotelMoresco.setHotelName("Hotel Moresco");
        hotelMoresco.setHotelCategory(4);
        hotelMoresco.setHotelRating(5.0);
        hotelMoresco.setHotelFloors(4);
        hotelMoresco.setHotelAddress("Via Aurelia, 96 – 17051 Andora (SV).");


        Hotel hotelNavona = new Hotel();

        hotelNavona.setHotelName("Navona Central Suites");
        hotelNavona.setHotelCategory(5);
        hotelNavona.setHotelRating(8.7);
        hotelNavona.setHotelFloors(3);
        hotelNavona.setHotelAddress("Via Della Scrofa, 22 - 00186 Roma (RM)");

        Hotel hotelMangili = new Hotel("Mangili Garden Hotel",
                "Via Giuseppe Mangili, 31 - 00197 Villa Borghese/Parioli, Roma (RM)", 5,
                9.2, 2);

        PlacesOfInterest colosseo = new PlacesOfInterest("Roma", "Colosseo");

        PlacesOfInterest piazzaNavona = new PlacesOfInterest("Roma", "Piazza Navona");

        PlacesOfInterest fontanaDiTrevi = new PlacesOfInterest("Roma", "Fontana Di Trevi");



        do {
            System.out.println("Benvenuto!");
            System.out.println("Scegli cosa ricercare: \n" +
                    "1. Hotel\n" + "2. Luoghi di interesse");
            int choice;
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Inserisci il nome dell'hotel per ricevere tutte le informazioni:");
                    String hotelName = input.nextLine();
                    switch (hotelName) {
                        case "Hotel Moresco":
                            System.out.println(hotelMoresco.toString());
                            break;
                        case "Navona Central Suites":
                            System.out.println(hotelNavona.toString());
                            break;
                        case "Mangili Garden Hotel":
                            System.out.println(hotelMangili.toString());
                            break;
                        default:
                            System.out.println("Hotel non trovato");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il nome del luogo di interesse per avere delle informazioni a riguardo:");
                    String placeOfInterest = input.nextLine();
                    switch(placeOfInterest) {
                        case "Colosseo":
                            System.out.println(colosseo.toString());
                            break;
                        case "Piazza Navona":
                            System.out.println(piazzaNavona.toString());
                            break;
                        case "Fontana Di Trevi":
                            System.out.println(fontanaDiTrevi.toString());
                            break;
                        default:
                            System.out.println("Luogo non trovato");
                            break;
                    }
            }
        } while(true);
    }
}
