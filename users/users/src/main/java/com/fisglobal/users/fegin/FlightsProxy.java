package com.fisglobal.users.fegin;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fisglobal.users.model.FlightsDto;

@FeignClient(name="ADMIN-SERVICE")
public interface FlightsProxy {
	
	@GetMapping("flights/queryflight/{from}/{to}")
	public List<FlightsDto> find(@PathVariable("from") String from,@PathVariable("to") String to);
	
	@GetMapping("flights/all")
	public List<FlightsDto> getFlights();

}
