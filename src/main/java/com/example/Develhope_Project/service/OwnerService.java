package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;


    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }


    public Optional<Owner> getOwnersById(int id) throws Exception{

        if (ownerRepository.findById(id).isPresent()){
            return ownerRepository.findById(id);
        } else {
            throw new Exception(String.format("Owner with ID %s not found", id));
        }
    }

    public Owner addOwners(Owner owner) throws Exception{

        try {
            return ownerRepository.save(owner);
        } catch (Exception e){
            throw new Exception(String.format("Owner with email %s already exist", owner.getEmail()));
        }

    }


    public Owner updateOwners(int id, Owner newOwner) throws Exception{

        if (ownerRepository.findById(id).isPresent()){

            Owner owner = ownerRepository.findById(id).get();

            if (Objects.nonNull(newOwner.getName())){
                owner.setName(newOwner.getName());
            }

            if (Objects.nonNull(newOwner.getAddress())){
                owner.setAddress(newOwner.getAddress());
            }

            if (Objects.nonNull(newOwner.getPhoneNumber())){
                owner.setPhoneNumber(newOwner.getPhoneNumber());
            }

            return ownerRepository.save(owner);
        } else {
            throw new Exception(String.format("Owner with ID %s not found", id));
        }
    }


    public void deleteOwners(int id){

        try {
            ownerRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
