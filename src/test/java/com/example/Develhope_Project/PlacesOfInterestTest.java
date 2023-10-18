package com.example.Develhope_Project;

import com.example.Develhope_Project.models.PlacesOfInterest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlacesOfInterestTest {
    PlacesOfInterest placesOfInterest = new PlacesOfInterest("Sicilia", "Agrigento", "Valle dei Templi");

    @Test
    public void testPlaceIfInterest() {
        String result = placesOfInterest.toString();
        String aspected = "Regione: Sicilia\n" + "Città: Agrigento\n" + "Luogo di interesse: Valle dei Templi";
        assertEquals(aspected, result);
    }
}