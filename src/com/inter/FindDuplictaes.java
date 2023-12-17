package com.inter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplictaes {
//Find duplicate elements in the given list
	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(1,4,4,2,3,3);
//      arr.stream().limit().skip(4).forEach(System.out::println); Use limit or Skip.
		
		Set<Integer> set= new HashSet<>();
		arr.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));

	}

}
