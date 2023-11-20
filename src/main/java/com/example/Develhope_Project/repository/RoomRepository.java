package com.example.Develhope_Project.repository;

import com.example.Develhope_Project.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
    @Modifying
    @Query("UPDATE Room r SET r.roomNumber = :roomNumber, " +
            "r.roomType = :roomType, " +
            "r.guests = :guests, " +
            "r.cost = :cost, " +
            "r.available = :available, " +
            "r.clean = :clean " +
            "WHERE r.id = :id")
    void updateRoom(@Param("id") int id,
                    @Param("roomNumber") int roomNumber,
                    @Param("roomType") String roomType,
                    @Param("guests") int guests,
                    @Param("cost") double cost,
                    @Param("available") boolean available,
                    @Param("clean") boolean clean);

}
