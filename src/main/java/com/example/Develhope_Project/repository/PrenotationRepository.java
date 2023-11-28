package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PrenotationRepository extends JpaRepository<Prenotation, Integer> {
}
