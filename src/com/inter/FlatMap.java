package com.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
//		ArrayList<String> fruit = new ArrayList<>();
//        fruit.add("Apple");
//        fruit.add("mango");
//        fruit.add("pineapple");
//        fruit.add("kiwi");
//        System.out.println("List of fruit-" + fruit);
//        List<Integer>total=fruit.stream().map(x->x.length()).collect(Collectors.toList());
//        System.out.println(total);
		List<List<Integer>> numbers= new ArrayList<>();
		numbers.add(Arrays.asList(1,2));
		numbers.add(Arrays.asList(3,4));
		numbers.add(Arrays.asList(5,6));
		numbers.add(Arrays.asList(7,8));
		numbers.add(Arrays.asList(9,10));
		System.out.println("List of List: "+numbers);
		List<Integer>total=numbers.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println("Using flat map: "+total);
	
		}

}
