package com.cg.day14.anonynmous;

public class RunnableUsingAnonymousClass {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Imlementation of runnable funcitonal interface using runnable class");
				System.out.println("Run method in anonymous class");
			}
		}).start();
	}
}
