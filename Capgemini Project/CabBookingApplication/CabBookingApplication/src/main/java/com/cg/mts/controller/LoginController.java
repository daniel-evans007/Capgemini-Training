package com.cg.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admin;
import com.cg.mts.entities.Customer;
import com.cg.mts.entities.Driver;
import com.cg.mts.service.LoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/login")
@Api(value="Login Operations")
@Validated
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@ApiOperation(value = "Admin Login")
	@PostMapping("/admin")
	public String adminLogin(@ApiParam(value = "Admin Login") @RequestBody Admin admin) {
		return loginService.LoginAdmin(admin);
	}
	
	@ApiOperation(value = "Customer Login")
	@PostMapping("/customer")
	public String userLogin(@ApiParam(value = "Customer Login") @RequestBody Customer customer) {
		return loginService.LoginUser(customer);
	}
	
	@ApiOperation(value = "Driver Login")
	@PostMapping("/driver")
	public String driverLogin(@ApiParam(value = "Driver Login") @RequestBody Driver driver) {
		return loginService.LoginDriver(driver);
	}
}
