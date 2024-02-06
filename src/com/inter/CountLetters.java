package com.inter;

import java.util.HashMap;

public class CountLetters {
	public static void main(String[] args) {
		String str="Hello all welcome to the party";
		HashMap<Character, Integer> map= new HashMap<>();
		str= str.toLowerCase();
		for(int i=0; i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		System.out.println("Letter Count: ");
		for(char c: map.keySet()) {
			System.out.print(c+" : "+map.get(c)+" ");
		}
	}

}
