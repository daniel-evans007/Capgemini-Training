package com.cg.day9_collections.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();//Generics
		
		hs.add(123);
		hs.add(124);
		hs.add(124);
		hs.add(null);
		hs.add(125);
		hs.add(129);
		hs.add(145);
		System.out.println(hs);
		//accessing hash set elements/objects in sequence
		Iterator<Integer> itr = hs.iterator();
		System.out.println("HashSet values using Iterator");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}
		
		HashSet<String> flowerList = new HashSet<String>(8,0.60f);
		//capacity = 8
		//load factor  = 0.6 means if hash set is filled by 60% then the size of hash set will be doubled
		flowerList.add("Rose");
		flowerList.add("Jasmine");
		flowerList.add("Marigold");
		
		
		//adding Student objects in to hash set
		HashSet<Student> stdList = new HashSet<Student>();
		Student  std;
		Scanner sc= new Scanner(System.in);
			
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of Student");
			System.out.println("Enter the Student id");
			int id = sc.nextInt();
			System.out.println("Enter the Student Name");
			String name = sc.next();
			stdList.add(new Student(id,name));
		}

		//displaying the student details
		Iterator<Student> stuItr = stdList.iterator();
		System.out.println("Student HashSet values using Iterator");
		while(stuItr.hasNext()) {
			Student st = stuItr.next();
			System.out.println(st.getSname() + " \t\t\t " + st.getSid());
			System.out.println();
		}

		//removing the student
		System.out.println("Enter the Student id to remove");
		int id = sc.nextInt();
		while(stuItr.hasNext()) {
			Student st = stuItr.next();
			if(st.getSid()==id) {
				stuItr.remove();
			}
		}
		
		sc.close();
	} 
}