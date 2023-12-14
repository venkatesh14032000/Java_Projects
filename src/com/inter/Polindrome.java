package com.inter;

public class Polindrome {

	public static void main(String[] args) {
		String polyndrome="mama";
		String rev = "";
		int len= polyndrome.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+polyndrome.charAt(i);
			
		}
		if(polyndrome.equals(rev)) {
			System.out.println(rev+" is a polyndrome");
			
		}else {
		System.out.println(rev+" is not a Polyndrome");}
		// TODO Auto-generated method stub

	}

}
