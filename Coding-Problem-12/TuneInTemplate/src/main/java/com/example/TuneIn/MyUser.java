package com.example.TuneIn;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */
@Component("myUser")
public class MyUser implements User {

    private String name;
    private Integer age;

    @Autowired
    Playlist playlist;
    
    public void setUserDetail(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    
    public Playlist getPlaylist(){
        return playlist;
    }

    public void setPlaylist(Playlist playlist){
        this.playlist = playlist;
    }

}
