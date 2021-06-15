package com.cg.day17.singleton;

public class Main {

	public static void main(String[] args) {
		SingletonDemo st = SingletonDemo.getInstance();
		SingletonDemo st1 = SingletonDemo.getInstance();
		SingletonDemo st2 = SingletonDemo.getInstance();
		
		st.str=(st.str).toUpperCase();
		System.out.println("String values using ste="+st.str);
		System.out.println("String values using ste1="+st1.str);
		System.out.println("String values using ste2="+st2.str);
	}
}