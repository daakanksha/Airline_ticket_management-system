package com.fisglobal.admin.controler;

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

import com.fisglobal.admin.model.Flights;
import com.fisglobal.admin.model.UsersDto;
import com.fisglobal.admin.service.FlightsService;

@RestController
@RequestMapping("flights")
@CrossOrigin("http://localhost:4200")
public class FlightsControler {
	
	@Autowired
	FlightsService service;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Flights>> get() {
		return new ResponseEntity(service.allFlights(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Flights> addFlight(@RequestBody Flights f) {
		return new ResponseEntity(service.addFlight(f),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{flightId}")
	public ResponseEntity<String> addFlight(@PathVariable("flightId") int id) {
		return new ResponseEntity(service.deleteFlight(id),HttpStatus.OK);
	}
	
	@GetMapping("/queryflight/{flightId}/{from}/{to}")
	public ResponseEntity<List<Flights>> find(@PathVariable("flightId") int id,@PathVariable("from") String from,@PathVariable("to") String to) {
		return new ResponseEntity(service.queryFlights(id,from, to),HttpStatus.OK);
	}
	
	
}
