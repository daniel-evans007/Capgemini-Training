package com.cg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo2 {

	public static void main(String[] args) {
		
		//values as Stream
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		intStream.forEachOrdered(val -> System.out.print(val));
		System.out.println();
		
		//Array as Stream
		Stream<Integer> arrayStream = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		arrayStream.forEachOrdered(val -> System.out.print(val));
		System.out.println();
		
		//ArrayList as Stream
		List<Integer> values = new ArrayList<Integer>();
		
		for (int i=0;i<50;i+=2) {
			values.add(i);
		}
		//convert the list to stream
		Stream<Integer> arrayListToStream = values.stream();
		arrayListToStream.forEachOrdered(val -> System.out.print(val));
		System.out.println();
		System.out.println();

		//generate values and iterate
		System.out.println("List of random numbers...");
		Stream<Integer> generatedList = Stream.generate(() -> (new Random().nextInt(100)));
		generatedList.limit(20).forEach(System.out::print);
		
		System.out.println("Collecting even numbers from the above generated list");
		List<Integer> values1 = new ArrayList<Integer>();
		
		for (int i=0;i<50;i++) {
			values1.add(i);
		}
		
		Stream<Integer> generatedList1 = values1.stream();
		List<Integer> evenNumList = generatedList1.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumList);
		
		
		System.out.println("Collecting odd numbers from the above generated list");
		List<Integer> values2 = new ArrayList<Integer>();
		
		for (int i=0;i<50;i++) {
			values2.add(i);
		}
		
		Stream<Integer> generatedList2 = values2.stream();
		Integer[] oddNumList = generatedList2.filter(i -> i%2 != 0).toArray(Integer[]:: new);
		for (Integer i : oddNumList) {
			System.out.println(i);
		}
	}
}