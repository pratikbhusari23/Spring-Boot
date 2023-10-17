package com.pb.hotel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;

import com.pb.hotel.exceptions.hotelnotfoundexception;
import com.pb.hotel.model.Hotel;

@Service
public class HotelService {
    
    List<Hotel> hotelList=new ArrayList<>();
    Map<String,Hotel> hotelMap = new HashMap<>();

    public void createHotel(Hotel hotel){
        hotelList.add(hotel);
        hotelMap.put(hotel.getId(), hotel);
    }

    public Hotel getHotelById(String id){

        if(ObjectUtils.isEmpty(hotelMap.get(id))){
            throw new hotelnotfoundexception("Hotel Not Found for id :"+id);
        }
        return hotelMap.get(id);
    }

    public List<Hotel> getAllHotels() {

        return hotelList;
    }

    public void deleteHotelById(String id) {

        Hotel hotel = getHotelById(id);
        hotelList.remove(hotel);
        hotelMap.remove(id);
    }

    public void update(Hotel updatedHotel) {
        // Get the Previous Data
        // remove old data from list
        // add the updated data

        Hotel existingHotel = getHotelById(updatedHotel.getId());
        hotelList.remove(existingHotel);
        hotelList.add(updatedHotel);
        // Update the previous data with the new data
        // Update the map with new data

        hotelMap.put(updatedHotel.getId(), updatedHotel);

    }

}
