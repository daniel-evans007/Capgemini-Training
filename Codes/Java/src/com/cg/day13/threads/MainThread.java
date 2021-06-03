package com.cg.day13.threads;

public class MainThread {

	public static void main(String[] args) {
		new MyThread("Thread one");
		new MyThread("Thread two");
		new MyThread("Thread three");
		new MyThread("Thread four");
		new MyThread("Thread five");
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread is exiting");
	}
}