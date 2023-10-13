package com.example.TuneIn;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class MyPlaylist implements Playlist {

    private Song song;
    private Integer count;
    private List<Song> playlistSongs;

    public MyPlaylist(){
        this.count = 0;
        this.playlistSongs = new ArrayList<>();
    }

    public void addSong(Song song){
        this.playlistSongs.add(song);
        this.count++;
    }

    public List<Song> getPlaylistSongs(){
        return this.playlistSongs;
    }

    public Integer getCount(){
        return this.count;
    }

}