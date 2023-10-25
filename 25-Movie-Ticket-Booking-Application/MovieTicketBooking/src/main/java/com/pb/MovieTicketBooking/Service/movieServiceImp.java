package com.pb.MovieTicketBooking.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pb.MovieTicketBooking.Exceptions.idAlreadyExist;
import com.pb.MovieTicketBooking.Exceptions.idNotFound;
import com.pb.MovieTicketBooking.Model.movie;

@Service
public class movieServiceImp implements movieService{

    List<movie> movieList;

    public movieServiceImp(){
        movieList = new ArrayList<>();
        movieList.add(new movie(1,"The Shawshank Redemption","Frank Darabont",9,"English",
            Arrays.asList("Frank Darabont","Stephen King"),
            Arrays.asList("Tim Robbins","Morgan Freeman"),
            Arrays.asList("Drama","Crime")
        ));
    }

    @Override
    public List<movie> getMovies() {
        return movieList;
    }

    @Override
    public movie getMovieById(Integer id) {

        Optional<movie> optionalMovie= movieList.stream().filter(movie -> movie.getId()==id).findFirst();
        if(optionalMovie.isPresent()){
            return optionalMovie.get();
        }
        else{
            throw new idNotFound("id not found");
        }

    }

    @Override
    public String addMovie(movie movie) {   

        Optional<movie> optionalMovie= movieList.stream().filter(mov -> mov.getId()==movie.getId()).findFirst();
        if(optionalMovie.isPresent()){
            throw new idAlreadyExist("id already exist");
        }
        else{
            movieList.add(movie);
            return "movie added successfully";
        }
        
    }

    @Override
    public String updateMovie(movie movie, Integer id) {

        Optional<movie> optionalMovie= movieList.stream().filter(mov -> mov.getId()==id).findFirst();
        if(optionalMovie.isPresent()){
            movieList.remove(optionalMovie.get());
            movieList.add(movie);
            return "movie updated successfully";
        }
        else{
            throw new idNotFound("id not found");
        }
        
    }

    @Override
    public String deleteMovie(Integer id) {

        Optional<movie> optionalMovie= movieList.stream().filter(mov -> mov.getId()==id).findFirst();
        if(optionalMovie.isPresent()){
            movieList.remove(optionalMovie.get());
            return "movie deleted successfully";
        }
        else{
            throw new idNotFound("id not found");
        }
       
    }
    
}
