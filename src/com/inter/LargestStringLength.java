package com.inter;

import java.util.Arrays;

public class LargestStringLength {
	public static void main(String[] args) {
		String[] data= {"Apple","Banana","Apricot","Grape"};
		int max=Arrays.stream(data).mapToInt(string->string.length()).max().orElse(0);
		System.out.println(max);

	}

}
