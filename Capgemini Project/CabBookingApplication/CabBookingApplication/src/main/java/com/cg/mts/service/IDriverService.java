package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Driver;

@Service
public interface IDriverService {
	public Driver insertDriver(Driver driver);
	public Driver updateDriver(Driver driver,long id);
	public ResponseEntity<Driver> deleteDriver(long driverId);
	public List<Driver>viewBestDrivers();
	public Driver viewDriver(long driverId);
}