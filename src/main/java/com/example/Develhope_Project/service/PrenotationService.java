package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.models.Prenotation;
import com.example.Develhope_Project.models.Room;
import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.HotelRepository;
import com.example.Develhope_Project.repository.PrenotationRepository;
import com.example.Develhope_Project.repository.RoomRepository;
import com.example.Develhope_Project.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PrenotationService {

    @Autowired
    PrenotationRepository prenotationRepository;

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    UserRepository userRepository;


    @Transactional
    public Prenotation createPrenotation(int userID, int roomID, Prenotation prenotation) throws Exception{

        if (roomRepository.findById(roomID).isPresent()){

            Room room = roomRepository.findById(roomID).orElse(null);
            room.getPrenotations().add(prenotation);
            roomRepository.save(room);

            Hotel hotel = room.getHotel();
            hotel.getPrenotations().add(prenotation);
            hotelRepository.save(hotel);

            User user = userRepository.findById(userID).orElse(null);
            user.getPrenotations().add(prenotation);
            userRepository.save(user);

            prenotation.setHotel(hotel);
            prenotation.setRooms(room);
            prenotation.setNumberOfPeopleBooked(room.getGuests());
            prenotation.setPrice(room.getCost());
            prenotation.setUser(user);

        } else {
            throw new Exception(String.format("Room with ID %s not found", roomID));
        }

        return prenotationRepository.save(prenotation);
    }


    public List<Prenotation> viewPrenotation() {
        return prenotationRepository.findAll();
    }


    public List<Prenotation> viewPrenotationByRoom(int roomID) throws Exception{

        if (roomRepository.findById(roomID).isPresent()){

            Room room = roomRepository.findById(roomID).orElse(null);

            List<Prenotation> prenotations = room.getPrenotations();

            return prenotations;
        } else {
            throw new Exception(String.format("Room with ID %s not found", roomID));
        }
    }


    public List<Prenotation> viewPrenotationByHotel(int hotelID) throws Exception{

        if (hotelRepository.findById(hotelID).isPresent()){

            Hotel hotel = hotelRepository.findById(hotelID).orElse(null);

            List<Prenotation> prenotations = hotel.getPrenotations();

            return prenotations;
        } else {
            throw new Exception(String.format("Hotel with ID %s not found", hotelID));
        }
    }


    public Optional<Prenotation> getPrenotationById(int id) throws Exception{

        if (prenotationRepository.findById(id).isPresent()){
            return prenotationRepository.findById(id);
        } else {
            throw new Exception(String.format("Prenotation with ID %s not found", id));
        }
    }


    public Prenotation updatePrenotation(int id, Prenotation newPrenotation) throws Exception{

        if (prenotationRepository.findById(id).isPresent()){

            Prenotation prenotation = prenotationRepository.findById(id).get();

            if (Objects.nonNull(newPrenotation.getClientName())){
                prenotation.setClientName(newPrenotation.getClientName());
            }

            if (Objects.nonNull(newPrenotation.getToStart())){
                prenotation.setToStart(newPrenotation.getToStart());
            }

            if (Objects.nonNull(newPrenotation.getTheEnd())){
                prenotation.setTheEnd(newPrenotation.getTheEnd());
            }

            return prenotationRepository.save(prenotation);
        } else {
            throw new Exception(String.format("Prenotation with ID %s not found", id));
        }
    }


    public void deletePrenotation(int id){

        try {
            prenotationRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}


