package com.fisglobal.users.model;

import java.sql.Date;

import javax.persistence.Id;

public class FlightsDto {

	int flightId;
	int airlineId;
	String airlinename;
	String fromLocation;
	String toLocation;
	Date departureTime;
	Date arrivalTime;
	String duration;
	int seats;
	public FlightsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightsDto(int flightId, int airlineId, String airlinename, String fromLocation, String toLocation,
			Date departureTime, Date arrivalTime, String duration, int seats) {
		super();
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.airlinename = airlinename;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.seats = seats;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
