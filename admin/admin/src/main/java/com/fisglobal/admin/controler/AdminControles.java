package com.fisglobal.admin.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.admin.model.UsersDto;
import com.fisglobal.admin.service.AdminServices;

@RestController
@RequestMapping("admin")
@CrossOrigin("http://localhost:4200")
public class AdminControles {
	
	@Autowired
	AdminServices service;
	
	
	@GetMapping("/users")
	public ResponseEntity<List<UsersDto>> getAllUsers() {
		return new ResponseEntity(service.getAllUsers(),HttpStatus.OK); 
	}
	
	@DeleteMapping("delete/{userid}")
	public String delect(@PathVariable("userid") String id) {
		return service.deleteUser(id);
	}

}
