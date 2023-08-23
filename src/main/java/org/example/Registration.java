package org.example;

import java.util.Date;

public class Registration {

    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private Date birthDate;
    private int telephoneNumber;
    public boolean isValidEmail;

    public Registration() {
    }

    public Registration(String name, String surname, String username, String email, String password, String confirmPassword, Date birthDate, int telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public boolean isValidEmail() {
        return isValidEmail;
    }

    public void setValidEmail(boolean validEmail) {
        isValidEmail = validEmail;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", birthDate=" + birthDate +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }

    public boolean isValidEmail(String email) {
        isValidEmail = email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    }

    public void register() {
        // Verifica che la password e la conferma della password siano uguali
        if (!password.equals(confirmPassword)) {
            System.out.println("La password e la conferma della password non corrispondono.");
            return; // Esce dal metodo se la registrazione non può essere completata
        }

        // Verifica che l'email sia valida
        if (!isValidEmail(email)) {
            System.out.println("L'email inserita non è valida.");
            return; // Esce dal metodo se la registrazione non può essere completata
        }

        // Effettua la registrazione al sito
        // Qui puoi inserire la logica specifica per la registrazione al tuo sito
        // Ad esempio, potresti inviare una richiesta HTTP al server del sito per inviare i dati di registrazione
        // o interagire con un database per salvare le informazioni dell'utente

        System.out.println("Registrazione completata con successo!");
    }


}
