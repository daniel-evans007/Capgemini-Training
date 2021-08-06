package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;


@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long>{

}