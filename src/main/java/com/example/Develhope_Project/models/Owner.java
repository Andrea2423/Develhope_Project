package com.example.Develhope_Project.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String indirizzo;
    private String email;
    private String numeroTelefono;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Hotel> hotels;

    /*
    Bloccano l'app

    private List<Hotel> strutture;
    private List<Review> recensioni; //Creare un metodo che restituisce la MEDIA delle recensioni

     */

    public Owner(){

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
}
