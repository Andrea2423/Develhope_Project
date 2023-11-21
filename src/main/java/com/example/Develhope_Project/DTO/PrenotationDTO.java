package com.example.Develhope_Project.DTO;

import com.example.Develhope_Project.models.Prenotation;

public class PrenotationDTO {
    private String clientName;
    private String prenotationDate;

    public PrenotationDTO() {

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPrenotationDate() {
        return prenotationDate;
    }

    public void setPrenotationDate(String prenotationDate) {
        this.prenotationDate = prenotationDate;
    }

    public static PrenotationDTO fromPrenotation(Prenotation prenotation) {
        PrenotationDTO userDTO = new PrenotationDTO();
        userDTO.setClientName(prenotation.getClientName());
        userDTO.setPrenotationDate(prenotation.getPrenotationDate().toString());
        return userDTO;
    }

    public Prenotation toPrenotation(PrenotationDTO prenotationDTO) {
        Prenotation prenotation = new Prenotation();
        prenotationDTO.setClientName(prenotation.getClientName());
        prenotation.setPrenotationDate(prenotation.getPrenotationDate());
        return prenotation;
    }
}
