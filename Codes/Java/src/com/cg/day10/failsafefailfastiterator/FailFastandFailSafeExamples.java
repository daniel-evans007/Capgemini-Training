package com.cg.day10.failsafefailfastiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastandFailSafeExamples {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Rama");
		names.add("Rama1");
		names.add("Ramaji");
		names.add("Ram");
		names.add("Raamaa");
		
		try {
			System.out.println("Names in the ArrayList: ");
			Iterator<String> itr = names.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("Adding an element in between the iteration: ");
				names.add("Krishna");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block gets executed.");
		}
		
		//usingCopyOnWriteArrayList to avoid
		CopyOnWriteArrayList<String> names1 = new CopyOnWriteArrayList<String>();
		
		names1.add("Rama");
		names1.add("Rama1");
		names1.add("Ramaji");
		names1.add("Ram");
		names1.add("Raamaa");
		
		try {
			System.out.println("Names1 in the ArrayList: ");
			Iterator<String> itr = names1.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("Adding an element in between the iteration: ");
				names.add("Krishna");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block gets executed.");
		}
	}
}