package com.example.Develhope_Project.models;

import com.example.Develhope_Project.service.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
    private String telephoneNumber;
    private String paymentMethod;


    public User() {
    }

    public User(String name, String surname, LocalDate dateOfBirth, String email, String telephoneNumber, String paymentMethod) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.paymentMethod = paymentMethod;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String methodOfPayment) {
        this.paymentMethod = methodOfPayment;
    }

    UserService userService = new UserService();
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + userService.getFormattedDate()+ '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber + '\'' +
                ", methodOfPayment='" + paymentMethod + '\'' + '}';
    }
}
