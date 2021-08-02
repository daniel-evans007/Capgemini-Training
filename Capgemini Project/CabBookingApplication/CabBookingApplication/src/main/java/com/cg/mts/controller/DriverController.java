package com.cg.mts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Driver;
import com.cg.mts.service.IDriverService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/driver")
@Api(value="Driver Operations")
@Validated
public class DriverController {

	@Autowired
	private IDriverService driverService;
	
	@ApiOperation(value = "Driver Login")
	@PostMapping("/login")
	public String driverLogin(@ApiParam(value = "Driver login", required = true) @RequestBody Driver driver) {
		
		return driverService.LoginDriver(driver);
	}
	
	@ApiOperation(value = "Insert a Driver")
	@PostMapping("/inesertdriver")
	public String insertDriver(@ApiParam(value = "Storing Drivers in the database", required = true) @RequestBody Driver driver) {
		// TODO Auto-generated method stub
		return driverService.insertDriver(driver);
	}
	
	@ApiOperation(value = "Update Driver Details")
	@PutMapping("/updatedriver/{id}")
	public Driver updateDriver(@ApiParam(value = "Update Driver object", required = true) @Valid @RequestBody Driver driver,@ApiParam(value = "Driver ID to update Driver details", required = true) @PathVariable("id")long id) {
		// TODO Auto-generated method stub
		return driverService.updateDriver(driver,id);
	}
	
	@ApiOperation(value = "Remove a Driver from the Database")
	@DeleteMapping("/deletedriver/{id}")
	public ResponseEntity<Driver> deleteDriver(@ApiParam(value = "Driver ID from which Driver object will be removed from the Database", required = true) @PathVariable("id")long id) {
		// TODO Auto-generated method stub
		return driverService.deleteDriver(id);
	}
	
	@ApiOperation(value = "Get Drivers By ID")
	@GetMapping("/viewdriver/{id}")
	public Driver viewDriver(@ApiParam(value = "Drivers ID by which Driver details will be retrieved", required = true) @PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return driverService.viewDriver(id);
	}
	
	@ApiOperation(value = "Get the Best Drivers")
	@GetMapping("/viewbestdriver")
	public List<Driver> viewBestDrivers() {
		// TODO Auto-generated method stub
		return driverService.viewBestDrivers();
	}
}