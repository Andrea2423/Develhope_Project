package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.repository.PrenotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrenotationService {

    @Autowired
    PrenotationRepository prenotationRepository;

    public void insertPrenotation(Prenotation prenotation) {
       prenotationRepository.save(prenotation);
   }

    public List<Prenotation> viewPrenotation() {
        return prenotationRepository.findAll();
    }

    public Prenotation getPrenotationById(int id) {
        Optional<Prenotation> prenotation = prenotationRepository.findById(id);
        if (prenotation.isPresent()) {
            return prenotation.get();
        } else {
            throw new IllegalArgumentException("ID della prenotazione non valido");
        }
    }

    private List<Prenotation> userList = new ArrayList<>();
    public List<Prenotation> putPrenotationUser(Prenotation prenotation) {
        userList.add(prenotation);
        return userList;
    }

    public List<Prenotation> deletePrenotation(Prenotation prenotation) {
        prenotationRepository.delete(prenotation);
        return prenotationRepository.findAll();
    }

    public Prenotation getPrenotationById2(int prenotationId) {
        return prenotationRepository.findById(prenotationId).orElse(null);
    }
}


