package com.inter;


interface mref{
	void listen();
	
}
public class MethodReference {
	public static void run() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		mref m= MethodReference::run;
		m.listen();

	}

}
