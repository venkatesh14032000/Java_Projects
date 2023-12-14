package com.inter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AllEvenornot {

	public static void main(String[] args) {
		
//		  List<String> words= Arrays.asList("Apple","Banana","Grapes","Bones");
//		  Optional<String> result=words.stream().filter(name->name.startsWith("B")).findFirst();
//		  System.out.println(result);
 		  List<Integer> numbers=  Arrays.asList(1,2,3,4,5);
 		  boolean result=numbers.stream().allMatch(i->i%2==0);
		  if(result==true) {
		  System.out.println("All the numbers are even"); }
		  else {
		  System.out.println("All the numbers are not even"); }
		 	
		  }

}
