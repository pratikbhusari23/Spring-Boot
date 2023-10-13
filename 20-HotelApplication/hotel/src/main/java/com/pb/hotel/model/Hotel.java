package com.pb.hotel.model;

public class Hotel {
    
    private String id;
    private String name;
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
