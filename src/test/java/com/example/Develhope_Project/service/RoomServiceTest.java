package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Room;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {
    Room room = new Room();
    Room room1 = new Room(1, "Standard", 2, true, true, 100);
    ArrayList<Room> rooms = new ArrayList<>();


    @Test
    void searchRoom() {
        rooms.add(room1);
        Room result = room1;
        assertEquals(room1.toString(), result);
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