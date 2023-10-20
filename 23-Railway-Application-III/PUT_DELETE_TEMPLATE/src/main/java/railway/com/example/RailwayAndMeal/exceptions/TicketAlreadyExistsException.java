package railway.com.example.RailwayAndMeal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//add proper annotation for this custom exception class
@ResponseStatus(HttpStatus.CONFLICT)
public class TicketAlreadyExistsException extends RuntimeException{

    //complete the code body for this constructor
    public TicketAlreadyExistsException(String message)
    {
        super(message);

    }
}
