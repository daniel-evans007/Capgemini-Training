package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import com.cg.mts.entities.AbstractUser;

@NoRepositoryBean
public interface IAbstractUserRepository extends JpaRepository<AbstractUser, Long>{

}
