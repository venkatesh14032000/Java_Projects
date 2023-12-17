package com.inter;

import java.util.Arrays;

public class SecondSmallest {
	

	public static void main(String[] args) {
		int[] e= {15,8,6,3,3,4,4,7};
		int secondsmall= Arrays.stream(e).distinct().
				sorted().skip(1).findFirst()
				.orElseThrow(()->new IllegalArgumentException("Array does not contain second smallest element"));
		System.out.println(secondsmall);
		
		

	}

}
