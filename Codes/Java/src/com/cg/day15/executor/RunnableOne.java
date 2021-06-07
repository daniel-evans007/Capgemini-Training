package com.cg.day15.executor;

public class RunnableOne implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Executing task one");
			try {
				Thread.sleep(1000);
			}
			catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
}