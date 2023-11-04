package com.example.Develhope_Project.service;


import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository= hotelRepository;
    }


    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(int id){
        Optional<Hotel> hotels= this.hotelRepository.findById(id);
        if (hotels.isPresent()){
            return hotels.get();
        }else {
            return null;
        }
    }

    public void addHotel(Hotel hotel){
        hotelRepository.save(hotel);
    }

    public void updateHotel(int id, Hotel hotel){
        hotelRepository.save(hotel);
    }

    public void deleteHotel(int id){
        hotelRepository.deleteById(id);
    }

}
