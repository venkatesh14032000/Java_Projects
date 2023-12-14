package com.inter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsinArray {
	
	public static void main(String[] args) {
		int[] a1= {4,5,9,2,3,7};
		int[] a2= {5,8,1,6,2,3};
		List<Integer> list=Arrays.stream(a1).filter(number->Arrays.stream(a2).anyMatch(anumber->anumber==number)).boxed().collect(Collectors.toList());
		
	System.out.println(list);
			

	}

}
