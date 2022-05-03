package com.fisglobal.admin.service;

import java.util.List;

import com.fisglobal.admin.model.UsersDto;

public interface AdminServices {
	
	public UsersDto getUser(String userId,String pass);
	public List<UsersDto>  getAllUsers();
	public String deleteUser(String id);

}
