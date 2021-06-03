package com.cg.day13.threads;

public class UserThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		UserThread thread = new UserThread();
		UserThread thread1 = new UserThread();
		thread.start();
		thread1.start();
		Thread.sleep(300);
	}
	
	public void run() {
		System.out.println("Thread is running");
		
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}