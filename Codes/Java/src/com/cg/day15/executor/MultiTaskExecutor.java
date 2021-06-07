package com.cg.day15.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
		
		RejectedExecutionHandler rejectionHandler = new RejectedExecutionHandler() {
			
			@Override
			public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
				System.out.println(r.toString()+" : I've been rejected :(");
			}
		};
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue);
		executor.prestartAllCoreThreads();
		
		//creating threads and storing them in List
		List<Runnable> taskGroup = new ArrayList<Runnable>();
		taskGroup.add(new RunnableOne());
		taskGroup.add(new RunnableTwo());
		
		//calling Multiple Runnables to instantiate all threads using a single thread
		worksQueue.add(new MultipleRunnables(taskGroup));
	}
}
