package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelResourse {
     @Autowired
    private HotelService hotelService;



    @PostMapping("/hotels")
    public Hotel create(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }


    @PutMapping("/hotels/{id}")
    public Hotel update(@RequestBody Hotel hotel,@PathVariable("id") Long id) {
        return hotelService.update(hotel,id);
    }


    @GetMapping("/hotels")
    public List<Hotel> getAll() {
        List<Hotel> hotels=hotelService.findAll();
        return hotels;
    }


    @GetMapping("hotels/{id}")
    public Hotel getById(@PathVariable("id") Long id) {

        return hotelService.findbyId(id);
    }



    @DeleteMapping("/hotels/{id}")
    public void delete(@PathVariable("id") Long id) {
        hotelService.delete(id);
    }


    @PutMapping("/hotels")
    public List<Hotel> saveAll(@RequestBody List<Hotel> hotels) {
        return hotelService.saveAll(hotels);
    }
}
