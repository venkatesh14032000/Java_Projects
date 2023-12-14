package com.inter;

public class Remove_Space {

	public static void main(String[] args) {
		String var="   vegha nbhbfh    hbfhb     bd     ";
		StringBuilder str= new StringBuilder();
		char[] chars= var.toCharArray();
		for(char c: chars) {
			if(Character.isWhitespace(c))
				str.append(c);
			
		}
		System.out.println(str);

	}

}
