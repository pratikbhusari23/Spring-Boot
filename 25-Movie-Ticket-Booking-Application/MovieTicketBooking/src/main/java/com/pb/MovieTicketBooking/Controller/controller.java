package com.pb.MovieTicketBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.MovieTicketBooking.Exceptions.idAlreadyExist;
import com.pb.MovieTicketBooking.Model.movie;
import com.pb.MovieTicketBooking.Service.movieService;


import java.util.List;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class controller {
    
    @Autowired
    private movieService movieService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Movie Ticket Booking System";
    }

    @GetMapping("/movies")
    public List<movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/movie/{id}")
    public movie getMovieById( @PathVariable  Integer id){
        return movieService.getMovieById(id);
    }

    @PostMapping("/movie")
    public String addMovie(@Valid @RequestBody movie movie , BindingResult result){

        if(result.hasErrors()){
            throw new idAlreadyExist("id already exist");
        }
        return movieService.addMovie(movie);
    }

    @PutMapping("/movie/{id}")
    public String updateMovie(@Valid @RequestBody movie movie , @PathVariable Integer id){
        return movieService.updateMovie(movie, id);
    }

    @DeleteMapping("/movie/{id}")
    public String deleteMovie(@Valid @PathVariable Integer id){
        return movieService.deleteMovie(id);
    }



}
