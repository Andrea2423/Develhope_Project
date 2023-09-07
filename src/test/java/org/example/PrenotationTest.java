package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class PrenotationTest {

    @Test
    public void testPrintDetails() {
        Prenotation prenotation = new Prenotation(LocalDate.of(2023, 9, 7),
        "Luca Rossi", 2, true,LocalTime.of(10, 0),
        150.0, 3);
    }
}