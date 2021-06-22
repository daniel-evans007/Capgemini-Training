package com.cg.springbootdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootdemo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/showempbyid/{id}")
	public Employee showEmpById(@PathVariable("id") int id) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(100, "Daniel");
		Employee emp2 = new Employee(101, "Anirban");
		Employee e = new Employee();
		
		empList.add(emp1);
		empList.add(emp2);
		
		for (Employee emp : empList) {
			if (emp.getEid() == id) {
				e = emp;
			}
		}
		return e;
	}
}