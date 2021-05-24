package com.cg.day9.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//adding Student objects in to hash set
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of Student");
			System.out.println("Enter Student ID");
			int id = sc.nextInt();
			System.out.println("Enter Student Name");
			String name = sc.next();
			stdList.add(new Student(id,name));
		}
			
			
		Iterator<Student> stuItr = stdList.iterator();
		
		System.out.println("Student ArrayList values using Iterator");
		
		while(stuItr.hasNext()) {
			Student st = stuItr.next();
			System.out.println(st.getSname() + " \t\t\t " + st.getSid());
			System.out.println();
		}
			
		Iterator<Student> stuItr2 = stdList.iterator();
		System.out.println("Enter the Student ID to remove");
		int id = sc.nextInt();

		while(stuItr2.hasNext()) {
			Student st = stuItr2.next();
			if(st.getSid() == id) {
				stuItr2.remove();
			}
		}
			
		System.out.println("Enter the Student id to update");
		int uid = sc.nextInt();
		
		System.out.println("arraylist values using for loop");
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getSid()==uid) {
				stdList.get(i).setSname("Ramji");
			}
		}
						
		Iterator<Student> newstuItr = stdList.iterator();
		
		System.out.println("Student ArrayList values  using Iterator");
		
		while(newstuItr.hasNext()) {
			Student st = newstuItr.next();
			System.out.println(st.getSname() + " \t\t\t " + st.getSid());
			System.out.println();
		}
		
		sc.close();
	}
}