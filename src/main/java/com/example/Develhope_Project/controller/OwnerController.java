package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.repository.OwnerRepository;
import com.example.Develhope_Project.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 @RequestMapping
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public List<Owner> getAllOwner(){
        return ownerService.getAllOwners();
    }

    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable int id){
        return ownerService.getOwnersById(id);
    }

    @PostMapping
    public void addOwners (@RequestBody Owner owner){
        ownerService.addOwners(owner);
    }

    @PostMapping("/{id}")
    public void updateOwners(@PathVariable int id, @RequestBody Owner owner){
        ownerService.updateOwners(id,owner);
    }

    @DeleteMapping("/{id}")
    public void deleteOwners(@PathVariable int id){
        ownerService.deleteOwners(id);
    }
}
