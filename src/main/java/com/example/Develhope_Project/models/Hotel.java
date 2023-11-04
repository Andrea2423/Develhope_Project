package com.example.Develhope_Project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Hotel {
    @Id
    @GeneratedValue

    private int id;
    private String hotelName;
    private double hotelRating;
    private int hotelFloors;
    private String hotelAddress;
    private String hotelInfo;
    private String hotelServices;
    private int hotelCategory;

    public Hotel(int hotelId, String s) {

    }

    public Hotel(String hotelName, String hotelAddress, int hotelCategory, double hotelRating, int hotelFloors) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelCategory = hotelCategory;
        this.hotelRating = hotelRating;
        this.hotelFloors = hotelFloors;
    }

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

    public String toString() {
        return "Hotel: " + hotelName +
                "\nStelle: " + hotelCategory + "✩" +
                "\nValutazione hotel: " + hotelRating +
                "\nPiani: " + hotelFloors +
                "\nIndirizzo: " + hotelAddress +
                "\n\nInfo: " + hotelInfo +
                "\nServizi: " + hotelServices;
    }
}
