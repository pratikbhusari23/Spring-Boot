package railway.com.example.RailwayAndMeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import railway.com.example.RailwayAndMeal.Entity.Ticket;


public class RailwayService {
	
	public List<Ticket> list = new ArrayList<>();
	public Map<Long,Ticket> ticketMap = new HashMap<>();
	
	/** This function adds a ticket to a list and associates it with a PNR in a ticket map 
	    for efficient retrieval. **/
	public void addTicket(Ticket ticket) {
			
	}
	
	/** This function returns a list of all tickets stored in the class. **/
	public List<Ticket> getAllTickets() {		
		return null;
	}
	
	/** This method retrieves a ticket based on its unique PNR from ticketmap. **/ 
	public Ticket getTicketByPnr(long pnr) {
		return null;
	}
		
}