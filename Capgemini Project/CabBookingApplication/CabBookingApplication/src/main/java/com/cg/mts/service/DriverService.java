package com.cg.mts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Driver;
import com.cg.mts.exception.DriverNotFoundException;
import com.cg.mts.repository.IDriverRepository;

@Service
public class DriverService implements IDriverService{

	@Autowired
	private IDriverRepository iDriverRepository;
	
	@Override
	public Driver insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		return iDriverRepository.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver,long id) {
		// TODO Auto-generated method stub
		Driver dvr = null;
		dvr = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
		dvr.setUsername(driver.getUsername());
		dvr.setEmail(driver.getEmail());
		dvr.setPassword(driver.getPassword());
		dvr.setLicenseNo(driver.getLicenseNo());
		dvr.setRating(driver.getRating());
		dvr.setCab(driver.getCab());
		return iDriverRepository.save(dvr);
	}

	@Override
	public ResponseEntity<Driver> deleteDriver(long id) {
		// TODO Auto-generated method stub
		Driver dvr1 = null;
		dvr1 = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
		this.iDriverRepository.delete(dvr1);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Driver> viewBestDrivers() {
		// TODO Auto-generated method stub
		List<Driver> findAllDriver = iDriverRepository.findAll();
		List<Driver> driverList = new ArrayList<Driver>();
		for(int i=0; i<findAllDriver.size(); i++) {
			if(findAllDriver.get(i).getRating() >= 4.5) {
				driverList.add(findAllDriver.get(i));
			}
		}
		return driverList;
	}

	@Override
	public Driver viewDriver(long id) {
		// TODO Auto-generated method stub
		Driver dvr = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
		return dvr;
	}

}
