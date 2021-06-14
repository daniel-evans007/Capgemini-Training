package com.cg.day16.jdbcprodmgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductManagement {

	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public Connection dbConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		return con;
	}
	
	public void createTableProduct() throws SQLException {
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
	
	public void insertIntoProduct() throws SQLException {
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
	
	public void insertIntoProductByPS() throws SQLException {
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
		pstmt.close();
	}
	
	public static void readProductDetails() throws SQLException {
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
	
	public void getAllProducts() throws SQLException {
		stmt =  con.createStatement();
		rs = stmt.executeQuery("select * from danny_dbms.products");
		System.out.println("PID\tPNAME\tPRICE");
		
		while (rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		stmt.close();
		rs.close();
	}
	
	public void getProductUsingId() throws SQLException {
		String display = "select * from danny_dbms.products where pid = ?";
		
		System.out.print("Enter the Product ID: ");
		int pid = Integer.parseInt(sc.nextLine());
		pstmt.setInt(1, pid);
		rs = pstmt.executeQuery(display);
		
		System.out.println();
		System.out.println("PID\tPNAME\tPRICE");
		
		while (rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		pstmt.close();
		rs.close();
	}
	
	public void updateProductUsingId() throws SQLException {
		String updateProduct = "update danny_dbms.products set pid = ?,pname=? where price = ?";
		pstmt = con.prepareStatement(updateProduct);
		System.out.print("Enter the Product ID: ");
		int pid = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Product Name: ");
		String pname = sc.nextLine();
		System.out.print("Enter the Product Price: ");
		float price = Float.parseFloat(sc.nextLine());
			
		pstmt.setInt(1, pid);
		pstmt.setString(2, pname);
		pstmt.setFloat(3, price);
			
		int i = pstmt.executeUpdate();
			
		if(i != 0) {
			System.out.println("Data updated successfully");
		}
		else {
			System.out.println("Data not updated successfully");
		}
		pstmt.close();
	}
	
	public void deleteProductUsingId() throws SQLException {
		String delete = "delete from product where pid = ?";
		pstmt = con.prepareStatement(delete);
		System.out.print("Enter the Product ID: ");
		int pid = Integer.parseInt(sc.nextLine());
		pstmt.setInt(1, pid);
		int i = pstmt.executeUpdate();
		
		if (i == 1) {
			System.out.println("Product has been deleted successfully");
		}
		else {
			System.out.println("Product hasn't been deleted");
		}
		pstmt.close();
		rs.close();
	}
}