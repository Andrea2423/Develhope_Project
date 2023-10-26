package com.example.Develhope_Project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

public class Owner {

    private int id;
    private String nome;
    private String indirizzo;
    private String email;
    private String numeroTelefono;
    private List<Hotel> strutture;
    private List<Review> recensioni; //Creare un metodo che restituisce la MEDIA delle recensioni

    public Owner( String nome, String indirizzo, String email, String numeroTelefono, List<Hotel> strutture, List<Review> recensioni) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.strutture = strutture;
        this.recensioni = recensioni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public List<Hotel> getStrutture() {
        return strutture;
    }

    public void setStrutture(List<Hotel> strutture) {
        this.strutture = strutture;
    }

    public List<Review> getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(List<Review> recensioni) {
        this.recensioni = recensioni;
    }

}
