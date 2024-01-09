package com.inter;

class Counter{
	private int count=0;
	 // Synchronized method to increment the counter
	public synchronized void increment() {
		for( int i=0; i<5; i++) {
			count++;
			System.out.println(Thread.currentThread().getName()+" Count "+count);
		}
	}
}

class Multhread extends Thread{
	private Counter counter;
	// Constructor to initialize the Counter object

	public Multhread(Counter counter) {
		super();
		this.counter = counter;
	}
	public void run() {
		// Call the synchronized increment method
		counter.increment();
		
	}
}

public class MultiThread {

	public static void main(String[] args) {
		Counter c= new Counter();
		// Create two threads with the shared Counter object
		Multhread t1= new Multhread(c);
		Multhread t2= new Multhread(c);
		
		// Start both threads
		t1.start();
		t2.stop();

	}

}
