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

import com.cg.mts.entities.Cab;
import com.cg.mts.service.ICabService;

@RestController
@RequestMapping("/api/cab")
public class CabController {

	@Autowired
	private ICabService iCabService;
	
	@PostMapping("/insertcab")
	public Cab insertCab(@RequestBody Cab cab) {
		return iCabService.insertCab(cab);
	}
	
	@PutMapping("/updatecab/{id}")
	public Cab updateCab(@RequestBody Cab cab, @PathVariable("id") int id) {
		return iCabService.updateCab(cab, id);
	}
	
	@DeleteMapping("/deletecab/{id}")
	public ResponseEntity<Cab> deleteCab(@RequestBody Cab cab, @PathVariable("id") int id){
		return iCabService.deleteCab(cab, id);
	}
}
