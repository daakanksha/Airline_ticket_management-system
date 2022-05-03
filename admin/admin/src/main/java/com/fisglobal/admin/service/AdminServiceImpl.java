package com.fisglobal.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.admin.feign.UsersProxy;
import com.fisglobal.admin.model.UsersDto;

@Service
public class AdminServiceImpl implements AdminServices{

	@Autowired
	UsersProxy proxy; 
	
	@Override
	public UsersDto getUser(String userId, String pass) {
		// TODO Auto-generated method stub
		return proxy.validateUser(userId, pass);
	}

	@Override
	public List<UsersDto> getAllUsers() {
		// TODO Auto-generated method stub
		return proxy.allUsers();
	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		return proxy.delect(id);
	}
	
}
