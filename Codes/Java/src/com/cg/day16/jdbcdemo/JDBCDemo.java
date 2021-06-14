package com.cg.day16.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		//Register the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establish the connection
		System.out.println("Connecting to database...\n");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		
		//Create the statement
		Statement stmt = con.createStatement();
		
		//Execute the SQL Statement or Query
		ResultSet rs = stmt.executeQuery("select * from danny_dbms.department");
		
		System.out.println("DID\tDNAME");
		while (rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		
		//Closing the connection
		System.out.println("\nClosing the connection");
		con.close();
	}
}