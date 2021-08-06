package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

}