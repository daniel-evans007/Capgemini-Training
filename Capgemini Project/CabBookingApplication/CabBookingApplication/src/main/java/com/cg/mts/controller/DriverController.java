package com.cg.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Driver;
import com.cg.mts.service.DriverService;

@RestController
@RequestMapping("/api/driver")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@PostMapping("/inesertdriver")
	public Driver insertDriver(@RequestBody Driver driver) {
		// TODO Auto-generated method stub
		return driverService.insertDriver(driver);
	}
	
	@PutMapping("/updatedriver/{id}")
	public Driver updateDriver(@RequestBody Driver driver,@PathVariable("id")long id) {
		// TODO Auto-generated method stub
		return driverService.updateDriver(driver,id);
	}
	
	@DeleteMapping("/deletedriver/{id}")
	public ResponseEntity<Driver> deleteDriver(@PathVariable("id")long id) {
		// TODO Auto-generated method stub
		return driverService.deleteDriver(id);
	}
}
