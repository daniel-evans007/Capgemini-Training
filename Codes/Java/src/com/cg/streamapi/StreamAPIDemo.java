package com.cg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static List<String> getPlaces() {
		
		List<String> countriesCities = new ArrayList<String>();

		countriesCities.add("India, Calcutta");
		countriesCities.add("USA, New York");
		countriesCities.add("France, Lyon");
		countriesCities.add("Belgium, Brussels");
		
		return countriesCities;
	}
	
	public static void main(String[] args) {
		
		List<String> area = getPlaces();
		
		System.out.println("Places from India");
		area.stream().filter((p) -> p.startsWith("India")).map((p) -> p.toUpperCase()).sorted().forEach((p) -> System.out.println(p));
	}
}