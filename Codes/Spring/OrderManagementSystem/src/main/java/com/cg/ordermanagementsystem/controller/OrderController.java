package com.cg.ordermanagementsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ordermanagementsystem.entity.Order;
import com.cg.ordermanagementsystem.service.IOrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;

	@GetMapping("/getorders")
	public List<Order> getAllOrders(){
		return this.orderService.getAllOrders();
	}
	
	@GetMapping("/getordersbytype/{ordType}")
	public List<Order> getOrdersByType(@PathVariable("ordType") String ordType){
		return this.orderService.findByOrderType(ordType);
	}
	
	@GetMapping("/getorderbyid/{ordid}")
	public Order getOrderById(@PathVariable("ordid")long ordId){
		return this.orderService.getOrderById(ordId);
	}
	
	@PostMapping("/addorder")
	public Order saveOrder(@RequestBody Order order) {
		return this.orderService.saveOrder(order);
	}
	
	@PutMapping("/updateOrder/{ordid}")
	public Order updateOrder(@RequestBody Order order,@PathVariable("ordid")long orderId) {
		return this.orderService.updateOrder(order, orderId);		
	}
	
	@DeleteMapping("/deleteOrder/{ordid}")
	public ResponseEntity<Order> deleteOrder(@PathVariable("ordid")long orderId){
		return this.orderService.deleteOrder(orderId);
	}
	
	@GetMapping("/getorderbystatus/{ordstatus}")
	public List<Order> getOrderByStatus(@PathVariable("ordstatus")String ordStatus){
		return this.orderService.findByOrderStatus(ordStatus);
	}
}