package com.cg.day13.threads;

public class Sync implements Runnable {
	
	int token = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(token+" alloted to "+name);
			token++;
		}
	}
	
	public static void main(String[] args) {
		
		Sync sync = new Sync();
		
		Thread t1 = new Thread(sync);
		Thread t2 = new Thread(sync);
		Thread t3 = new Thread(sync);
		Thread t4 = new Thread(sync);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}