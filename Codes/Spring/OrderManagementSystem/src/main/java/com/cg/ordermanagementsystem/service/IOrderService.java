package com.cg.ordermanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.ordermanagementsystem.entity.Order;

@Service
public interface IOrderService {

	public List<Order> getAllOrders();
	public Order getOrderById(long orderId);
	public Order saveOrder(Order order);
	public Order updateOrder(Order order,long orderId);
	public ResponseEntity<Order> deleteOrder(long orderId);
	public List<Order> findByOrderType(String ordType);
	public List<Order> findByOrderStatus (String ordStatus);
}