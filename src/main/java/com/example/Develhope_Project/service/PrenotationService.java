package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.repository.PrenotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    private List<Prenotation> userList = new ArrayList<>();
    public List<Prenotation> putPrenotationUser(Prenotation prenotation) {
        userList.add(prenotation);
        return userList;
    }
}


