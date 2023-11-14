package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    @Modifying
    @Query("UPDATE User u SET u.name = :name, " +
            "u.surname = :surname, " +
            "u.dateOfBirth = :dateOfBirth, " +
            "u.email = :email, " +
            "u.telephoneNumber = :telephoneNumber, " +
            "u.paymentMethod = :paymentMethod " +
            "WHERE u.id = :id")
    void updateUser(@Param("id") int id,
                    @Param("name") String name,
                    @Param("surname") String surname,
                    @Param("email") String email,
                    @Param("dateOfBirth")LocalDate dateOfBirth,
                    @Param("telephoneNumber") String telephoneNumber,
                    @Param("paymentMethod") String paymentMethod);
}
