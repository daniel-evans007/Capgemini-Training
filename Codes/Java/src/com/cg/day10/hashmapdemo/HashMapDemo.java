package com.cg.day10.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> languages = new HashMap<String, Integer>();
		
		languages.put("Java", 1);
		languages.put("JavaScript", 6);
		languages.put("Python", 3);
		languages.put("C++", 11);
		
		System.out.println("HashMap Values = "+languages);
		
		int value = languages.get("Java");
		System.out.println("Value in the HashMap with key Java"+value);
		
		//set of keys from HashMap
		Set<String> languagesKeySet = languages.keySet();
		System.out.println("Key Values of above Hash Map = "+languagesKeySet);
		
		//set of values from HashMap
		Collection<Integer> languagesValueSet = languages.values();
		System.out.println("Values of the above HashMap: "+languagesValueSet);
		
		//Key, Value from HashMap using entrySet() method
		Set<Entry<String, Integer>> languagesKeyValueSet = languages.entrySet();
		System.out.println("Key, Value pairs of the above HashMap: "+languagesKeyValueSet);
		
		//replace a HashMap value
		languages.replace("Java", 11);
		System.out.println("Key, Value pairs of the above HashMap: "+languagesKeyValueSet);

		//Iterate through a HashMap
		
		System.out.println("Keys = ");
		
		for (String key: languages.keySet()) {
			System.out.print(key);
			System.out.println(", ");
		}
		
		System.out.println("Values using Set = ");
		
		for (Integer val: languagesValueSet) {
			System.out.print(val);
			System.out.println(", ");
		}
		
		System.out.println("Keys, Value pairs from EntrySet = ");
		
		for (Entry<String, Integer> values: languagesKeyValueSet) {
			System.out.print(values);
			System.out.println(", ");
		}
		
		//converting HashMap to TreeMap to sort values
		Map<String, Integer> languagesSorted = new TreeMap<String, Integer>();
		languagesSorted.putAll(languages);
		
		System.out.println(languagesSorted);
	}
}