package com.pb.MovieTicketBooking.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.List;




public class movie {
    
    //@NotNull
    @Min(1)
    private Integer id ;

    //@NotNull
    @Size(min = 3, max = 20 , message = "movieName cannot be of Size less than 3 and more than 20")
    private String movieName;

    ////@NotNull(message = "movieDirector cannot be null")
    private String movieDirector;


    //@NotNull(message = "movierating cannot be null")
    @Min(value=1)
    private long movierating;

    //@NotNull(message = "movielanguage cannot be null")
    private String movielanguage;

    private List<String> writers;
    private List<String> actors;
    private List<String> genre;



    public movie(Integer id,String movieName, String movieDirector, long movierating, String movielanguage, List<String> writers, List<String> actors, List<String> genre) {
        super();
        this.id=id;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movierating = movierating;
        this.movielanguage = movielanguage;
        this.writers = writers;
        this.actors = actors;
        this.genre = genre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return this.movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }
    

    public String getName() {
        return this.movieName;
    }

    public void setName(String name) {
        this.movieName = name;
    }

    public String getDirector() {
        return this.movieDirector;
    }

    public void setDirector(String movieDirector) {
        this.movieDirector=movieDirector;
    }

    public long getMovierating() {
        return this.movierating;
    }

    public void setMovierating(long movierating) {
        this.movierating = movierating;
    }

    public String getMovielanguage() {
        return this.movielanguage;
    }

    public void setMovielanguage(String movielanguage) {
        this.movielanguage = movielanguage;
    }

    public List<String> getWriters() {
        return this.writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getActors() {
        return this.actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getGenre() {
        return this.genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

}
