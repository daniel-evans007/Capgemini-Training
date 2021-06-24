package com.cg.ordermanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.ordermanagementsystem.entity.Order;
import com.cg.ordermanagementsystem.exception.OrderNotFoundException;
import com.cg.ordermanagementsystem.repository.OrderRepository;

@Service
public class OrderService implements IOrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order getOrderById(long orderId) {
		return this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
	}

	@Override
	public Order saveOrder(Order order) {
		return this.orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order, long orderId) {
		Order existingOrder = this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
		existingOrder.setOrderStatus(order.getOrderStatus());
		existingOrder.setOrderType(order.getOrderType());
		existingOrder.setOrdervalue(order.getOrdervalue());
		return this.orderRepository.save(existingOrder);
	}

	@Override
	public ResponseEntity<Order> deleteOrder(long orderId) {
		Order existingOrder = this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
		this.orderRepository.delete(existingOrder);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Order> findByOrderType(String ordType) {
		return this.orderRepository.findByOrderType(ordType);
	}
	
	@Override
	public List<Order> findByOrderStatus(String ordStatus){
		return this.orderRepository.findByOrderStatus(ordStatus);
	}
}