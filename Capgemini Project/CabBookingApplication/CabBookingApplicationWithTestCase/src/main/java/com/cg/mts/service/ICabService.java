package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Cab;
@Service
public interface ICabService {
	public Cab insertCab(Cab cab);
	public Cab updateCab(Cab cab,int id);
	public ResponseEntity<String> deleteCab(int id);
	public List<Cab> viewCabsOfType(String carType);
	public int countCabsOfType(String carType);
}