package com.cg.mts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Driver;
import com.cg.mts.exception.DriverNotFoundException;
import com.cg.mts.exception.UserNotLoginException;
import com.cg.mts.repository.IDriverRepository;

@Service
public class DriverService implements IDriverService{

	@Autowired
	private IDriverRepository iDriverRepository;
	static int flag=0;
	
	@Override
	public String insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		int check = 0;
		String stringdriver = "";
		List<Driver> findAllDriver = iDriverRepository.findAll();
		for(int i=0; i<findAllDriver.size(); i++) {
			if(findAllDriver.get(i).getEmail().equals(driver.getEmail())) {
				check = 1;
				stringdriver = findAllDriver.get(i).getEmail();
				break;
			}
		}
		
		if(check == 0) {
			this.iDriverRepository.save(driver);
			return driver.getUsername()+"'s account is created.";
		}else {
			return driver.getEmail()+" already exists.";
		}
		
	}

	public String LoginDriver(Driver driver) {
		List<Driver> ad = iDriverRepository.findAll();
		String result=null;
		for(int i=0; i<ad.size(); i++) {
			if(ad.get(i).getUsername().equals(driver.getUsername()) && ad.get(i).getPassword().equals(driver.getPassword())) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			result = driver.getUsername()+" is logged in";
		}else {
			result = "Username or Password is wrong.";
		}
		return result;
	}
	
	@Override
	public Driver updateDriver(Driver driver,long id) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Driver dvr = null;
			dvr = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
			dvr.setUsername(driver.getUsername());
			dvr.setEmail(driver.getEmail());
			dvr.setPassword(driver.getPassword());
			dvr.setLicenseNo(driver.getLicenseNo());
			dvr.setRating(driver.getRating());
			dvr.setCab(driver.getCab());
			return iDriverRepository.save(dvr);
		}else {
			throw new UserNotLoginException();
		}
	}

	@Override
	public ResponseEntity<Driver> deleteDriver(long id) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Driver dvr1 = null;
			dvr1 = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
			this.iDriverRepository.delete(dvr1);
			return ResponseEntity.ok().build();
		}else {
			throw new UserNotLoginException();
		}
	}

	@Override
	public List<Driver> viewBestDrivers() {
		// TODO Auto-generated method stub
		if(flag == 1) {
			List<Driver> findAllDriver = iDriverRepository.findAll();
			List<Driver> driverList = new ArrayList<Driver>();
			for(int i=0; i<findAllDriver.size(); i++) {
				if(findAllDriver.get(i).getRating() >= 4.5) {
					driverList.add(findAllDriver.get(i));
				}
			}
			return driverList;
		}else {
			throw new UserNotLoginException();
		}
	}

	@Override
	public Driver viewDriver(long id) {
		// TODO Auto-generated method stub
		if(flag == 1) {
			Driver dvr = iDriverRepository.findById(id).orElseThrow(()-> new DriverNotFoundException("Driver not found"));
			return dvr;
		}else {
			throw new UserNotLoginException();
		}
	}

}
