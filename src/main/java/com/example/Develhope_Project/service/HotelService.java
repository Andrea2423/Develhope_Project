package com.example.Develhope_Project.service;


import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.models.User;
import com.example.Develhope_Project.repository.HotelRepository;
import com.example.Develhope_Project.repository.OwnerRepository;
import com.example.Develhope_Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    OwnerRepository ownerRepository;


    public Hotel insertHotel(int ownerID, Hotel hotel) throws Exception{

        if (ownerRepository.findById(ownerID).isPresent()){
            Owner owner = ownerRepository.findById(ownerID).orElse(null);

            owner.getHotels().add(hotel);
            ownerRepository.save(owner);

            hotel.setOwner(owner);
        } else {
            throw new Exception(String.format("Owner with ID %s not found", ownerID));
        }

        return hotelRepository.save(hotel);
    }


    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }


    public Optional<Hotel> getHotelById(int id) throws Exception {

        if (hotelRepository.findById(id).isPresent()) {
            return hotelRepository.findById(id);
        } else {
            throw new Exception(String.format("Hotel with ID %s not found", id));
        }
    }


    public List<Hotel> viewAllHotelByOwner(int ownerID) throws Exception{

        if (ownerRepository.findById(ownerID).isPresent()){
            Owner owner = ownerRepository.findById(ownerID).orElse(null);
            List<Hotel> hotels;
            hotels = owner.getHotels();

            return hotels;
        } else {
            throw new Exception(String.format("Owner with ID %s not exist", ownerID));
        }
    }


    public Hotel updateHotel(int id, Hotel updateHotel) throws Exception{

        if (hotelRepository.findById(id).isPresent()){

            Hotel hotel = hotelRepository.findById(id).get();

            if (Objects.nonNull(updateHotel.getHotelName())){
                hotel.setHotelName(updateHotel.getHotelName());
            }

            if (updateHotel.getHotelFloors() != 0){
                hotel.setHotelFloors(updateHotel.getHotelFloors());
            }

            if (Objects.nonNull(updateHotel.getHotelAddress())){
                hotel.setHotelAddress(updateHotel.getHotelAddress());
            }

            if (Objects.nonNull(updateHotel.getHotelInfo())){
                hotel.setHotelInfo(updateHotel.getHotelInfo());
            }

            if (Objects.nonNull(updateHotel.getHotelServices())){
                hotel.setHotelServices(updateHotel.getHotelServices());
            }

            return hotelRepository.save(hotel);
        } else {
            throw new Exception(String.format("Hotel with ID %s not found", id));
        }
    }

    public void deleteHotel(int id){

        try {
            hotelRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
