package com.fisglobal.admin.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fisglobal.admin.model.UsersDto;

@FeignClient(name="USER-SERVICE")
public interface UsersProxy {

	@GetMapping("users/all")
	public List<UsersDto> allUsers(); 
	
	@DeleteMapping("users/delete/{userid}")
	public String delect(@PathVariable("userid") String id);
	
	@GetMapping("users/validate/{userid}/{pass}")
	public UsersDto validateUser(@PathVariable("userid") String id,@PathVariable("pass") String pass);
	
}
