package com.cg.eis.pl;

import com.cg.eis.service.EmployeeInsuranceSystem;

public class EmployeeDriverCode {

	public static void main(String[] args) {
		
		EmployeeInsuranceSystem empInSys = new EmployeeInsuranceSystem();
		
		empInSys.getEmployeeDetails();
		
		empInSys.getInsuranceScheme();
		
		empInSys.displayEmployeeDetails();
	}
}