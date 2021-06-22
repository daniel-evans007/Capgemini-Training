package com.cg.springbootdemo.model;


public class Employee {

	private int eid;
	private String name;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
}
