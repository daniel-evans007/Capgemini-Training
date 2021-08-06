package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Driver;

@Repository
public interface IDriverRepository extends JpaRepository<Driver, Long>{

}