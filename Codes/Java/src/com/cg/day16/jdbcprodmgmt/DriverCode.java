package com.cg.day16.jdbcprodmgmt;

import java.sql.SQLException;
import java.util.Scanner;

public class DriverCode {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ProductManagement pms = new ProductManagement();
		Scanner sc = new Scanner(System.in);
		pms.dbConnection();
 
		String cont = "yes";
		while (cont.equalsIgnoreCase("yes")) {
			System.out.println("insert : to insert product");
			System.out.println("update : to update product");
			System.out.println("delete : to delete product");
			System.out.println("getproduct : to a get single product");
			System.out.println("getallproducts : to a single get all products");
			
			System.out.print("\nEnter the choice : ");
			String transaction = sc.nextLine();
			
			switch (transaction) {
			case "insert":
				pms.insertIntoProductByPS();
				break;
			case "update":
				pms.updateProductUsingId();
				break;
			case "delete":
				pms.deleteProductUsingId();
				break;
			case "getproduct":
				pms.getProductUsingId();
				break;
			case "getallproducts":
				pms.getAllProducts();
				break;
			default:
				System.out.println("Invalid choice...");
				break;
			}
			System.out.println();
			System.out.println("do you want continue? yes or no");
			System.out.print("Response: ");
			cont = sc.nextLine();
			
			if (!cont.equalsIgnoreCase("yes")) {
				System.out.println("Exiting program successfully...");
				System.exit(0);
			}
			System.out.println();
		}
	}
}