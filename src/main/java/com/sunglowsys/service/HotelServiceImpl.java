package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel, Long id) {
        Hotel hotel1=hotelRepository.getById(id);
        hotel1.setCode(hotel.getCode());
        return hotelRepository.save(hotel1);
    }

    @Override
    public List<Hotel> findAll() {

        return hotelRepository.findAll();
    }

    @Override
    public Hotel findbyId(Long id) {
        Optional<Hotel> optional=hotelRepository.findById(id);
        Hotel hotel=null;
        if(optional.isPresent()){
            hotel=optional.get();
        }
        else {
            throw new RuntimeException("hotel  not found for idn:"+id);

        }
        return hotel;
    }

    @Override
    public void delete(Long id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public List<Hotel> saveAll(List<Hotel> hotels) {
        return hotelRepository.saveAll(hotels);
    }
}
