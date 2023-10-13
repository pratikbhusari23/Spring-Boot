package com.pb.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.hotel.model.Hotel;
import com.pb.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    
    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public void createHotel(@RequestBody Hotel hotel){

        hotelService.createHotel(hotel);

    }

    @GetMapping("/id/{id}")
    public Hotel getHotelById(@PathVariable String id){
         
        return hotelService.getHotelById(id);
    }

    @GetMapping("/getAll")
    public List<Hotel> getAllHotels(){
        
        return hotelService.getAllHotels();
    }
}
