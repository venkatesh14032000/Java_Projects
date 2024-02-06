package com.inter;

public class SeperateAlphaNumeric {
	public static void main(String[] args) {
		String alphanum="ab0cd234@#$%";
		
		StringBuffer num= new StringBuffer();
		StringBuffer alpha = new StringBuffer();
		StringBuffer spl = new StringBuffer();
		
		for(int i=0; i<alphanum.length();i++) {
			if(Character.isAlphabetic(alphanum.charAt(i))) {
				alpha.append(alphanum.charAt(i));
			}
			else if(Character.isDigit(alphanum.charAt(i))) {
				num.append(alphanum.charAt(i));
			}
			else {
				spl.append(alphanum.charAt(i));
			}
			
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(spl);
		
	}
//	public static void Alphanumeric(String str) {
//		StringBuffer num= new StringBuffer();
//		StringBuffer alpha= new StringBuffer();
//		StringBuffer spl= new StringBuffer();
//		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isDigit(str.charAt(i))) {
//				num.append(str.charAt(i));
//			}
//			else if(Character.isAlphabetic(str.charAt(i))) {
//				alpha.append(str.charAt(i));
//			}
//			else {
//				spl.append(str.charAt(i));
//			}
//		}
//		System.out.println("The numbers in alpha numeric is: "+num);
//		System.out.println("The alphabets in alpha numeric is: "+alpha);
//		System.out.println("The special characr in alpha numeric is: "+spl);
//	}
//
//	public static void main(String[] args) {
//		String str="bhbhbhsdb436vdsv678dv@@#$";
//		Alphanumeric(str);
//
//	}

}
