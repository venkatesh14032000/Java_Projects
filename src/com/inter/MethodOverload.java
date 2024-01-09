package com.inter;

class TCS {
public static void chennai(String address) {
		
	}
public static void chennai(String address,int Pin) {
		System.out.println("Address "+address+" "+"Pin "+Pin);
	}
public static void chennai(String location, int pin, String Head) {
	
}
public static void chennai(int size, String place, int Height) {
	
}
}
public class MethodOverload {

	public static void main(String[] args) {
		TCS tcs = new TCS();
		tcs.chennai("Siruseri");
        tcs.chennai("Hyderabad", 524268);
	}

}
