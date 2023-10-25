package com.pb.MovieTicketBooking.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class idAlreadyExist extends RuntimeException{

    public  idAlreadyExist(String message){
        super(message);
    }
    
}
