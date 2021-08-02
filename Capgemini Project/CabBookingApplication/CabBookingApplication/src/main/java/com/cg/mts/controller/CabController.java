package com.cg.mts.controller;

import java.util.List;

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

import com.cg.mts.entities.Cab;
import com.cg.mts.service.ICabService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/cab")
@Api(value="Cab Operations")
@Validated
public class CabController {

	@Autowired
	private ICabService iCabService;
	
	@ApiOperation(value = "Insert a cab details.")
	@PostMapping("/insertcab")
	public Cab insertCab(@ApiParam(value = "Storing Cabs in the database", required = true) @RequestBody Cab cab) {
		return iCabService.insertCab(cab);
	}
	@ApiOperation(value = "Update Cab Details")
	@PutMapping("/updatecab/{id}")
	public Cab updateCab(@ApiParam(value = "Update Cab Details", required = true) @RequestBody Cab cab, @PathVariable("id") int id) {
		return iCabService.updateCab(cab, id);
	}
	
	@ApiOperation(value = "Remove a Cab from the Database")
	@DeleteMapping("/deletecab/{id}")
	public ResponseEntity<Cab> deleteCab(@ApiParam(value = "Cab ID from which Cab object will be removed from the Database", required = true) @PathVariable("id") int id){
		return iCabService.deleteCab(id);
	}
	
	@ApiOperation(value = "Get cab By cab type")
	@GetMapping("/viewcabstype/{id}")
	public List<Cab> viewCabsOfType(@ApiParam(value = "Cab details will be retrieved", required = true) @PathVariable("id")String type) {
		// TODO Auto-generated method stub
		return iCabService.viewCabsOfType(type);
	}
	
	@ApiOperation(value = "Count Cabs By Type")
	@GetMapping("/countcabs/{type}")
	public int countCabsOfType(@ApiParam(value = "Cab Type by which Cabs will be counted", required = true) @PathVariable("type")String type) {
		// TODO Auto-generated method stub
		return iCabService.countCabsOfType(type);
	}
}