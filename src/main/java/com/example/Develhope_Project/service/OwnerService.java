package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository=ownerRepository;
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnersById(int id) {
        Optional<Owner> owner = this.ownerRepository.findById(id);
        if (owner.isPresent()) {
            return owner.get();
        } else {
            return null;
        }
    }

    public void addOwners(Owner owner){
    ownerRepository.save(owner);
    }

    public void updateOwners(int id, Owner owner){
        ownerRepository.save(owner);
    }

    public void deleteOwners(int id){
        ownerRepository.deleteById(id);
    }
}
