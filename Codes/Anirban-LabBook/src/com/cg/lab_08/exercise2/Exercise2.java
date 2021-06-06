package com.cg.lab_08.exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2  implements Runnable{

	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		System.out.print("Present time : ");
		while(true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("Time after 10 seconds : ");
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Exercise2 threadTimer = new Exercise2();
		Thread thread = new Thread(threadTimer);
		thread.start();
	}
}