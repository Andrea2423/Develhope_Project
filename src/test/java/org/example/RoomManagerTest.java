package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomManagerTest {

    @Test
    void addRoom() {
        Room room1 = new Room();
        room1.addRoom(1,"Double",2,true,true,100);
        int resut = room1.getGuests();
        assertNotEquals(2,room1);
    }

    @Test
    void searchRoom() {
    }

    @Test
    void lisOfAvailableRooms() {
    }

    @Test
    void isAvailableOrNot() {
    }

    @Test
    void isCleanOrNot() {
    }

    @Test
    void canCheckIN() {
    }
}