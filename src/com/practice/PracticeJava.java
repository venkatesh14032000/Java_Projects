package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeJava {

	public static void main(String[] args) {
		
		
//		String name="Venkatesh how are you man";
//		char[] words= name.toCharArray();
//		StringBuffer sb= new StringBuffer();
//		for(int i=words.length-1;i>=0;i--) {
//			sb.append(words[i]);
//		}
//		System.out.println(sb);
		
		//Given number is a prime number or not
		int x=6;
		boolean flag=false;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(x+" Is a prime number");
		}
		else
			System.out.println(x+" is not a prime number");
		
		
		//Print the common elements in the given lists.
//		int[] ar1= {4,5,2,6,1};
//		int[] ar2= {8,5,4,9,3,1,2};
//		List<Integer> list=Arrays.stream(ar1).filter(x->Arrays.stream(ar2).anyMatch(i->i==x)).boxed().collect(Collectors.toList());
//		System.out.println(list);
		
		//Find the first word which starts with letter V
//		List<String> word= Arrays.asList("Venkat","Rajesh","Murali","Lokesh","Varun");
//		Optional<String> name=word.stream().filter(x->x.startsWith("V")).findFirst();
//		System.out.println(name);
		
		//given list is even or not
//		int[] num= {5,8,4,7,9,3,2,6};
//		boolean result=Arrays.stream(num).allMatch(i->i%2==0);
//		if(result==true) {
//			System.out.println("All are even numbers...!");
//		}
//		else {
//			System.out.println("All numbers are not even...!");
//		}
		
		//Word count in the given list
//		List<String> list= Arrays.asList("Apple","Banana","Grapes","Orange","Apple","Apple");
//		long c=list.stream().filter(x->x.equals("Apple")).count();
//		System.out.println(c);
		
		//Adding all even numbers
//		int[] arr= {5,8,4,9,3,1,5,5,2,66,55};
//		int total=Arrays.stream(arr).filter(x->x%2==0).sum();
//		System.out.println(total);
	}

}
