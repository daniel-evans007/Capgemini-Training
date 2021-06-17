package com.cg.hibernateonetoone;

import java.util.Scanner;

import com.cg.hibernateonetoone.dao.InstructorDao;
import com.cg.hibernateonetoone.entity.Instructor;
import com.cg.hibernateonetoone.entity.InstructorDetail;

public class App {
    public static void main( String[] args ) {
        
    	Instructor instructor = new Instructor("Anirban", "Goswami", "anirban@gmail.com");
    	InstructorDetail instructorDetail = new InstructorDetail("youtube.com/danny", "Tech");
    	instructor.setInstructorDetail(instructorDetail);
    	InstructorDao instructorDao = new InstructorDao();
    	instructorDao.saveInstructor(instructor);
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String choice = "yes";
    	
    	while (choice.equalsIgnoreCase("yes")) {
    		System.out.println();
    		System.out.println("insert: insert data");
    		System.out.println("update: update data");
    		System.out.println("delete: delete data");
    		System.out.println("get   : get instructor by id");
    		System.out.println("getall: get all the instructors' data");
    		System.out.println("exit  : to exit the program");
    		
    		System.out.print("\nEnter your choice: ");
    		String option = sc.nextLine();
    		
    		switch (option) {
    		case "insert":
    			System.out.print("\nEnter Instructor First Name: ");
    			String fName = sc.nextLine();
    			System.out.print("Enter Instructor Last Name: ");
    			String lName = sc.nextLine();
    			System.out.print("Enter Instructor Email: ");
    			String email = sc.nextLine();
    			instructor = new Instructor(fName, lName, email);
    			System.out.println("\nEnter Instructor details: ");
    			System.out.print("Enter the channel url: ");
    			String channel = sc.nextLine();
    			System.out.print("Enter the Hobby: ");
    			String hobby = sc.nextLine();
    			instructorDetail = new InstructorDetail(channel, hobby);
    			instructor.setInstructorDetail(instructorDetail);
    			instructorDao.saveInstructor(instructor);
    			break;
    		case "update":
    			instructor = new Instructor("Danny", "Evans", "daniel@gmail.com");
    			instructorDao.updateInstructor(instructor);
    			break;
    		case "delete":
    			System.out.print("\nEnter the Instructor ID: ");
    			int id = Integer.parseInt(sc.nextLine());
    			instructorDao.deleteInstructor(id);
    			break;
    		case "get":
    			System.out.print("\nEnter the Instructor ID: ");
    			int gid = Integer.parseInt(sc.nextLine());
    			Instructor ins = instructorDao.getInstructor(gid);
    			System.out.println(ins.getEmail()+"\t\t"
    		        	+ins.getFirstName()+"\t\t"+ins.getLastName());
    			break;
    		case "getall":
    			instructorDao.getAllInstructors();
    			break;
    		case "exit":
    			System.out.println("Exiting program successfully");
    			System.exit(0);
    		default:
    			System.out.println("Invalid choice");
    		}
    		
    		System.out.println("Do you want to continue? yes or no");
    		System.out.print("Response: ");
    		choice = sc.nextLine();
    		
    		if (!choice.equalsIgnoreCase("yes")) {
    			System.out.println("Exiting program successfully");
    			System.exit(0);
    		}
    	}
    	sc.close();
    }
}