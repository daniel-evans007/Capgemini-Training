package com.cg.ordermanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.ordermanagementsystem.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("select o from order o where o.orderType like %?1")
	public List<Order> findByOrderType(String ordType);
	
	public List<Order> findByOrderStatus (String ordStatus);
}