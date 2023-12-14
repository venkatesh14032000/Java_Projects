package com.inter;

import java.util.Arrays;
import java.util.List;

public class Find_vowel {

	public static void main(String[] args) {
//		String input="Over";
//		input=input.toLowerCase();
//		for(int i=0;i<input.length();i++) {
//			char c= input.charAt(i);
//			if(c=='a'||c=='e'|| c=='i'|| c=='o'|| c=='u') {
//				System.out.print(c+" ");
//			}
//		}
		String str="VenkateshEvidenallOver";
		str= str.toLowerCase();
		str.chars().mapToObj(c->(char) c).filter(c->"aeiou".contains(String.valueOf(c)))
		.forEach(System.out::print);
		

	}

}
