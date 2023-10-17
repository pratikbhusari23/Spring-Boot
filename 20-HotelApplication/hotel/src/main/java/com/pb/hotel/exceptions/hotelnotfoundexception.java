package com.pb.hotel.exceptions;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class hotelnotfoundexception extends RuntimeException{
    
    public hotelnotfoundexception(String message){
        super(message);
    }
}
 