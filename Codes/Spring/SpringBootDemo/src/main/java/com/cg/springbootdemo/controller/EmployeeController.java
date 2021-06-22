package com.cg.springbootdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springbootdemo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	static ArrayList<Employee> empList = new ArrayList<Employee>();
	static Employee emp1 = new Employee(100, "Daniel");
	static Employee emp2 = new Employee(101, "Anirban");
	static Employee e = new Employee();

	@RequestMapping("/showemployee")
	public ArrayList<Employee> showEmp() {
		empList.add(emp1);
		empList.add(emp2);
		return empList;
	}
	
	@RequestMapping("/showempbyid/{id}")
	public Employee showEmpById(@PathVariable("id") int id) {
		
		for (int i=0;i<empList.size();i++) {
			if (empList.get(i).getEid() == id) {
				e = empList.get(i);
				System.out.println(e.getName());
				return e;
			}
		}
		return e;
	}
}