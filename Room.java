public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;
    private boolean isClean;
    private double price;

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public Room(int roomNumber, String roomType, boolean isOccupied, boolean isClean, double price) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
        this.isClean = true;
        this.price = price;
    }
}
