package com.fisglobal.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.users.dao.UserDao;
import com.fisglobal.users.fegin.FlightsProxy;
import com.fisglobal.users.model.FlightsDto;
import com.fisglobal.users.model.User;

@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserDao dao;
	
	@Autowired
	FlightsProxy proxy;

	@Override
	public User getUser(String userid,String pass) {
		// TODO Auto-generated method stub
		return dao.validateUser(userid, pass);
	}

	@Override
	public User registerUser(User u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public List<FlightsDto> getAllFlights() {
		// TODO Auto-generated method stub
		return proxy.getFlights();
	}

	@Override
	public List<FlightsDto> queryFlights(String from,String to) {
		// TODO Auto-generated method stub
		return proxy.find(from, to);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		dao.deleteById(userId);
		return "Record Deleted Successfully";
	}

}
