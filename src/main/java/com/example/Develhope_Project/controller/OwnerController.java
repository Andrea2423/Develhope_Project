package com.example.Develhope_Project.controller;

import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.repository.OwnerRepository;
import com.example.Develhope_Project.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;


    @GetMapping
    public ResponseEntity getAllOwner(){

        try {
            return ResponseEntity.ok(ownerService.getAllOwners());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity getOwnerById(@PathVariable int id){

        try {
            return ResponseEntity.ok(ownerService.getOwnersById(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity addOwners (@RequestBody Owner owner){
        try {
            return ResponseEntity.ok(ownerService.addOwners(owner));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateOwners(@PathVariable int id, @RequestBody Owner owner){

        try {
            return ResponseEntity.ok(ownerService.updateOwners(id, owner));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public String deleteOwners(@PathVariable int id){
        ownerService.deleteOwners(id);

        return String.format("Owner with ID %s deleted", id);
    }
}
