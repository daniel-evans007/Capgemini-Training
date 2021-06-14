package com.cg.day16.jdbcprodmgmt;

public class DriverCode {

	public static void main(String[] args) throws Exception {
		
		ProductManagement pms = new ProductManagement();
		pms.dbConnection();
		//pms.createTableProduct();
		//pms.insertIntoProduct();
		pms.insertIntoProductByPS();
	}
}