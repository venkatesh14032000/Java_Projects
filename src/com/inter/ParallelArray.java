package com.inter;

import java.util.Arrays;

public class ParallelArray {

	public static void main(String[] args) {
		int[] numbers= {8,5,4,7,6,9,1,2,3};
		System.out.print("Unsorted Array: ");
		Arrays.stream(numbers).forEach(x->System.out.print(x+" "));
		System.out.println();
		System.out.print("Sorted Array: ");
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(x->System.out.print(x+" "));
	}

}
