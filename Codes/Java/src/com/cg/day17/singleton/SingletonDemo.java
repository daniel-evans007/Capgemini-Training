package com.cg.day17.singleton;

public class SingletonDemo {

	private static SingletonDemo singletonclassinstance = null;
	public String str;
	
	private SingletonDemo() {
		str = "this is a string from the singleton class";
	}
	
	public static SingletonDemo getInstance() {
		if (singletonclassinstance == null) {
			singletonclassinstance = new SingletonDemo();
		}
		return singletonclassinstance;
	}
}