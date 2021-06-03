package com.cg.day13.threads;

public class WithOutSynchronization implements Runnable {
	
	int tickets = 3;
	static int i=1,j=2,k=3,l=4;
	
	public synchronized void bookTicket(String name,int wantedTickets) {
		if(wantedTickets <= tickets) {
			System.out.println("no.of ticketes wanted = " +wantedTickets + " booked to " + name);
			tickets -=wantedTickets;
		}else {
			System.out.println("HouseFull");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if(name.equals("t1")) {
			bookTicket(name, i);
		}
		else if(name.equals("t2")) {
			bookTicket(name,j);
		}
		else if(name.equals("t3")) {
			bookTicket(name,k);
		}
		else if(name.equals("t4")) {
			bookTicket(name,l);
		}
	}

	public static void main(String...a) {
		WithOutSynchronization wos = new WithOutSynchronization();
		Thread t1 = new Thread(wos);
		Thread t2 = new Thread(wos);
		Thread t3 = new Thread(wos);
		Thread t4 = new Thread(wos);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}