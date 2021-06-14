package com.cg.day16.jdbcprodmgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ProductManagement {

	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public Connection dbConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		return con;
	}
	
	public void createTableProduct() throws Exception {
		stmt = con.createStatement();
		String createTable = "create table "
				+ "danny_dbms.products(pid number, pname varchar2(20), price number(10, 2))";
		int i = stmt.executeUpdate(createTable);
		
		if (i == 0) {
			System.out.println("\nTable created successfully");
		}
		else {
			System.out.println("\nTable not Created successfully");
		}
		
		stmt.close();
	}
	
	public void insertIntoProduct() throws Exception {
		stmt = con.createStatement();
		String insert = "insert into danny_dbms.products values(126, 'Mouse', 500.0)";
		int i = stmt.executeUpdate(insert);
		
		if (i == 1) {
			System.out.println("\nData has been inserted successfully");
		}
		else {
			System.out.println("\nData could not be inserted");
		}
		
		stmt.close();
	}
	
	public void insertIntoProductByPS() throws Exception {
		stmt = con.createStatement();
		String insert = "insert into danny_dbms.products values(?, ?, ?)";
		pstmt = con.prepareStatement(insert);
		readProductDetails();
		int i = pstmt.executeUpdate();
		
		if (i == 1) {
			System.out.println("\nData has been inserted successfully");
		}
		else {
			System.out.println("\nData could not be inserted");
		}
		
		stmt.close();
		sc.close();
	}
	
	public static void readProductDetails() throws Exception {
		System.out.println("\nEnter the product Details...\n");
		System.out.print("Enter the product ID: ");
		int pid = Integer.parseInt(sc.nextLine());
		pstmt.setInt(1, pid);
		System.out.print("Enter the product Name: ");
		String pname = sc.nextLine();
		pstmt.setString(2, pname);
		System.out.print("Enter the product Price: ");
		float price = Float.parseFloat(sc.nextLine());
		pstmt.setFloat(3, price);
	}
	
	public void getAllProduct() {
		
	}
	
	public void getProductUsingId() {
		
	}
	
	public void updateProductUsingId() {
		
	}
	
	public void deleteProductUsingId() {
		
	}
}