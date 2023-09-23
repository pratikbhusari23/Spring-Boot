package com.example.TuneIn;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class MySong implements Song {

    private String name;

    public String getSongName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
