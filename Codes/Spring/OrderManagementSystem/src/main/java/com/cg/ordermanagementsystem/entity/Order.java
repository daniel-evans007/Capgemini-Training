package com.cg.ordermanagementsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_Sequence")
    @SequenceGenerator(name = "order_Sequence", sequenceName = "ORDER_SEQ")
	private long id;
	
	@Column(name = "ordertype")
	private String orderType;
	
	@Column(name = "ordervalue")
	private double ordervalue;
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@Column(name = "orderstatus")
	private String orderStatus;

	public Order() {
		super();
	}

	public Order(String orderType, double ordervalue, Date orderDate, String orderStatus) {
		super();
		this.orderType = orderType;
		this.ordervalue = ordervalue;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getOrdervalue() {
		return ordervalue;
	}

	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}	
}