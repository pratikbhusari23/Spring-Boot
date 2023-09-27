package com.example.TuneIn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */
@Component("mySong")
@Scope("prototype")
public class MySong implements Song {

    private String name;

    public String getSongName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
