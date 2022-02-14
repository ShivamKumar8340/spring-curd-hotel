package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;

import java.util.List;

public interface HotelService {

    Hotel save(Hotel hotel);

    Hotel update(Hotel hotel,Long id);

    List<Hotel> findAll();

    Hotel findbyId(Long id);

    void delete(Long id);
    List<Hotel> saveAll(List<Hotel> hotels);
}
