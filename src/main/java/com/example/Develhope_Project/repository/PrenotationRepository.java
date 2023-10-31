package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.Prenotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrenotationRepository extends JpaRepository<Prenotation, Integer> {

}
