package com.cg.lab_six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise1 {

	@SuppressWarnings("rawtypes")
	public static List getValues(HashMap<String, Integer> hashmap) {
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put("table", 10);
		hashmap.put("chair", 20);
		hashmap.put("laptop", 5);
		hashmap.put("computer", 4);
		hashmap.put("keyboard", 8);
		hashmap.put("touchpad", 1);
		hashmap.put("keycaps", 11);
		hashmap.put("switches", 12);
		hashmap.put("monitor", 13);
		hashmap.put("UPS", 18);
		
		System.out.println(getValues(hashmap));
		
		sc.close();
	}
}