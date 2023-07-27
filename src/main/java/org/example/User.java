package org.example;

public class User {
    private String name;
    private String surname;
    private String birthDate;
    private String email;
    private int telephoneNumber;

    private String paymentMethod;


    public User(){};

    public User(String name, String surname, String birthDate, String email, int telephoneNumber, String paymentMethod) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    public void setPaymentMethod(String methodOfPayment) {
        this.paymentMethod = methodOfPayment;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber + '\'' +
                ", methodOfPayment='" + paymentMethod + '\'' + '}';
    }
}
