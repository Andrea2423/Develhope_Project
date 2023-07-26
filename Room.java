public class Room {
    int roomNumber;
    String roomType;
    boolean isOccupied;
    boolean isClean;
    double price;

    public Room(int roomNumber, String roomType, boolean isOccupied, boolean isClean, double price) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
        this.isClean = true;
        this.price = price;
    }
}
