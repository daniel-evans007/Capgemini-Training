package com.cg.day15.executor;

import java.util.List;

public class MultipleRunnables implements Runnable {

	private final List<Runnable> runnables;
	
	public MultipleRunnables(List<Runnable> runnables) {
		this.runnables = runnables;
	}

	@Override
	public void run() {
		for (Runnable runnable : runnables) {
			new Thread(runnable).start();
		}
	}
}