package com.inter;

public class Reverse {

	public static void main(String[] args) {
		String str="venkateshnimmakanti";
		System.out.println(reverse(str));
	}
		public static String reverse(String in) {
			StringBuilder str1= new StringBuilder();
			char[] chars=in.toCharArray();
			for(int i=chars.length-1;i>=0;i--) {
				str1.append(chars[i]);
				
			}
			return str1.toString();
			
		}
		/*StringBuilder sb= new StringBuilder();
			sb.append(str);
		sb=sb.reverse();
		System.out.println(sb);*/

		//Write a Java Program to reverse a number without
		/*int num=12345;
		int reverse=0;
		
		while(num!=0){
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
			
		}
		System.out.println(reverse);*/
	}
