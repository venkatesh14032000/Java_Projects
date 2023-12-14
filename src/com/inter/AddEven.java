package com.inter;

import java.util.Arrays;
import java.util.List;

public class AddEven {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Apple","Banana","Apple","Grapes","Apple","Apple","Banana");
		long num=words.stream().filter(word->word.equals("Apple")).count();
		System.out.println("Total occurance is: "+num);
//		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
//		int num=Arrays.stream(numbers).filter(n->n%2==0).sum();
//		System.out.println("Sum of even numbers in an given arrayu is :"+num);
//	
	}

}
