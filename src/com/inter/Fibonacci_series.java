package com.inter;

public class Fibonacci_series {
	public static void main(String[] args) {
		int count=10;
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i=1;i<=count;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
			
		}
		
	}

}
