package com.fisglobal.users.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.users.model.FlightsDto;
import com.fisglobal.users.model.User;
import com.fisglobal.users.services.UserServices;

@RestController
@RequestMapping("users")
@CrossOrigin("http://localhost:4200")
public class UserControler {

	@Autowired
	UserServices service;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> allUsers() {
		return new ResponseEntity(service.findAllUsers(),HttpStatus.OK);
	} 
	
	@DeleteMapping("delete/{userid}")
	public String delect(@PathVariable("userid") String id) {
		return service.deleteUser(id);
	}
	
	@GetMapping("validate/{userid}/{pass}")
	public ResponseEntity<User> validateUser(@PathVariable("userid") String id,@PathVariable("pass") String pass){
		return new ResponseEntity(service.getUser(id, pass),HttpStatus.OK);
	}
	
	@PostMapping("register")
	public User addRestaurant(@RequestBody User u){
		
		return service.registerUser(u);
	}
	
	@GetMapping("flights")
	public ResponseEntity<List<FlightsDto>> allFlights() {
		return new ResponseEntity(service.getAllFlights(),HttpStatus.OK);
	}
	
	@GetMapping("queryflights/{from}/{to}")
	public ResponseEntity<User> findFlights(@PathVariable("from") String from,@PathVariable("to") String to){
		return new ResponseEntity(service.queryFlights(from, to),HttpStatus.OK);
	}
}
