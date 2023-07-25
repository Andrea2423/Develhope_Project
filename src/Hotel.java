public class Hotel {
    private String hotelName;
    private double hotelRatingInStars;
    private int hotelFloors;
    private String hotelAddress;
    private String hotelInfo;
    private String hotelServices;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getHotelRatingInStars() {
        return hotelRatingInStars;
    }

    public void setHotelRatingInStars(double hotelRatingInStars) {
        this.hotelRatingInStars = hotelRatingInStars;
    }

    public int getHotelFloors() {
        return hotelFloors;
    }

    public void setHotelFloors(int hotelFloors) {
        this.hotelFloors = hotelFloors;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(String hotelServices) {
        this.hotelServices = hotelServices;
    }

    @Override
    public String toString() {
        return "Hotel: '" + hotelName + '\'' +
                "\nValutazione da 0 a 5: " + hotelRatingInStars + " stelle" +
                "\nPiani: " + hotelFloors +
                "\nIndirizzo: '" + hotelAddress + '\'' +
                "\n\nInfo: '" + hotelInfo + '\n' +
                "\nServizi: '" + hotelServices;
    }
    public Hotel() {
        System.out.println("Benvenuto!");
    }
}
