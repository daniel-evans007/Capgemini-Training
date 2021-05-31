package com.cg.day10.failsafefailfastiterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> names = new ConcurrentHashMap<Integer, String>();
		
		names.put(1, "Rama");
		names.put(2, "Rama1");
		names.put(3, "Ramaji");
		names.put(4, "Ram");
		names.put(5, "Raamaa");
		
		try {
			System.out.println("Names are: ");
			Iterator<String> itr = names.values().iterator();
			
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("putting an element: ");
				names.put(6, "Krishna");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		HashMap<Integer, String> names1 = new HashMap<Integer, String>();
		
		names1.put(1, "Rama");
		names1.put(2, "Rama1");
		names1.put(3, "Ramaji");
		names1.put(4, "Ram");
		names1.put(5, "Raamaa");
		
		try {
			System.out.println("Names1 are: ");
			Iterator<String> itr = names1.values().iterator();
			
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("putting an element: ");
				names1.put(6, "Krishna");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}