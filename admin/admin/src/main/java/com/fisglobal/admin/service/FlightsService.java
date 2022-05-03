package com.fisglobal.admin.service;

import java.util.List;

import com.fisglobal.admin.model.Flights;
import com.fisglobal.admin.model.UsersDto;

public interface FlightsService {
	public List<Flights> allFlights();
	
	public List<Flights> queryFlights(int flightId,String from,String to);
	
	public Flights addFlight(Flights f);
	
	public String deleteFlight(int id);
}
