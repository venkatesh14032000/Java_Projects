package com.inter;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
	

	public static void main(String[] args) {
		int[] elements= {1,2,3,4,5,6};//623456
		IntStream.range(0, elements.length/2).forEach(i->{
			int temp= elements[i];
			elements[i]=elements[elements.length-i-1];
			elements[elements.length-i-1]=temp;	
		});
		System.out.println(Arrays.toString(elements));
		
	}

}
