package com.pb.hotel.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Hotel {
    
    private String id;
    
    @Size(min=3)
    private String name;

    @Min(1)
    @Max(10)
    private Long rating;
    private String city;


    public Hotel(String id, String name, long rating, String city) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", rating='" + getRating() + "'" +
            ", city='" + getCity() + "'" +
            "}";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRating() {
        return this.rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    

}
