package org.example;

import org.example.models.Room;
import org.junit.jupiter.api.Test;


import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room room = new Room();
    Room room1 = new Room(1,"Single",1,true,true,150.00);
    HashSet<Room> roomHashSet = new HashSet<>();



    @Test
    void testSearchRoom() {
        roomHashSet.add(room1);
        room1.searchRoom(1);
        assertEquals("Room{roomNumber=1, roomType='Single', guests=1, cost=150.0, available=true, clean=true}", room1.toString());
    }
    @Test
    void testIsAvailableOrNot() {
    }

    @Test
    void testIsCleanOrNot() {
    }

    @Test
    void testCanCheckIN() {
    }
}