package com.inter;

class Mythread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getId()+" Value "+i);
		}
	}
}

public class ThreadsJava {

	public static void main(String[] args) {
		Mythread m1= new Mythread();
		Mythread m2= new Mythread();
		
		m1.start();
		m2.start();

	}

}
