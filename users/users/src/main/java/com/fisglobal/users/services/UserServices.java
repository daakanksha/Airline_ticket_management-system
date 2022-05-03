package com.fisglobal.users.services;

import java.util.List;

import com.fisglobal.users.model.FlightsDto;
import com.fisglobal.users.model.User;

public interface UserServices {
	public List<User> findAllUsers();
	public User getUser(String userId,String pass);
	public User registerUser(User u);
	public String deleteUser(String userId);
	public List<FlightsDto> getAllFlights();
	public List<FlightsDto> queryFlights(String from,String to);
}
