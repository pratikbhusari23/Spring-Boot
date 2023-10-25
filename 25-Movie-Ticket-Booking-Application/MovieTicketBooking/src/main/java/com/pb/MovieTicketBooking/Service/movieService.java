package com.pb.MovieTicketBooking.Service;

import com.pb.MovieTicketBooking.Model.movie;

import java.util.List;

public interface movieService {
    
    List<movie> getMovies();
    movie getMovieById(Integer id);
    String addMovie(movie movie);
    String updateMovie(movie movie , Integer id);
    String deleteMovie(Integer id);

}