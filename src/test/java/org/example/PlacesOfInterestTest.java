package org.example;

import org.example.models.PlacesOfInterest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlacesOfInterestTest {
    PlacesOfInterest placesOfInterest = new PlacesOfInterest("Sicilia", "Agrigento", "Valle dei Templi");

    @Test
    public void testPlaceIfInterest() {
        String result = placesOfInterest.toString();
        String aspected = "Regione: Sicilia\n" + "Città: Agrigento\n" + "Luogo di interesse: Valle dei Templi";
        assertEquals(aspected, result);
    }
}