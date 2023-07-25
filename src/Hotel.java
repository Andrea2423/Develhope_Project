public class Hotel {
    private String hotelName;
    private double hotelRating;
    private int hotelFloors;
    private String hotelAddress;
    private String hotelInfo;
    private String hotelServices;
    private int hotelCategory;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelCategory() {
        return hotelCategory;
    }

    public void setHotelCategory(int hotelCategory) {
        this.hotelCategory = hotelCategory;
    }

    public double getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(double hotelRating) {
        this.hotelRating = hotelRating;
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
                "\nStelle: " + hotelCategory + "*" +
                "\nValutazione hotel: " + hotelRating +
                "\nPiani: " + hotelFloors +
                "\nIndirizzo: '" + hotelAddress + '\'' +
                "\n\nInfo: '" + hotelInfo + '\n' +
                "\nServizi: '" + hotelServices;
    }

    public Hotel() {
        System.out.println("Benvenuto!");
    }
}
