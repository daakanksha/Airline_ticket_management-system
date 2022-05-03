package com.fisglobal.admin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class UsersDto {
	
	@Id
	String userId;
	String pass;
	String name;
	String role;
	public UsersDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersDto(String userId, String pass, String name, String role) {
		super();
		this.userId = userId;
		this.pass = pass;
		this.name = name;
		this.role = role;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
