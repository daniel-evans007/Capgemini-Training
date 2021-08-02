package com.cg.mts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Cab;
import com.cg.mts.exception.CabNotFoundException;

@Repository
public interface ICabRepository extends JpaRepository<Cab, Integer>{
//	public Cab insertCab(Cab cab);
//	public Cab updateCab(Cab cab) throws CabNotFoundException;
//	public Cab deleteCab(Cab cab) throws CabNotFoundException;
//	public List<Cab> viewCabsOfType(String carType) throws CabNotFoundException;
//	public int countCabsOfType(String carType) throws CabNotFoundException;
}