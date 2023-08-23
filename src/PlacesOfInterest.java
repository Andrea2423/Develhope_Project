public class PlacesOfInterest {
    private String region;
    private String city;
    private String placeOfInterest;

    public PlacesOfInterest() {}

    public PlacesOfInterest(String placeOfInterest) {
        this.placeOfInterest = placeOfInterest;
    }

    public PlacesOfInterest(String city, String placeOfInterest) {
        this.city = city;
        this.placeOfInterest = placeOfInterest;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPlaceOfInterest(String placeOfInterest) {
        this.placeOfInterest = placeOfInterest;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getPlaceOfInterest() {
        return placeOfInterest;
    }

    public String toString() {
        return "Città: " + city + "\nLuogo di interesse: " + placeOfInterest;
    }
}
