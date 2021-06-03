package com.cg.day13.threads;

public class MyThread implements Runnable {

	String name;
	Thread t;
	
	public MyThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread"+t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(300);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}