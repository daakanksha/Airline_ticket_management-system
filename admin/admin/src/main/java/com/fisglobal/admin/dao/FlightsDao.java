package com.fisglobal.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fisglobal.admin.model.Flights;
import com.fisglobal.admin.model.UsersDto;


@Repository
@Transactional
public interface FlightsDao extends JpaRepository<Flights,Integer>{

	@Query("Select f from Flights f where f.flightId=?1 or f.fromLocation=?2 or f.toLocation=?3")
	public List<Flights> queryFlights(int id,String from,String to);
	
}
