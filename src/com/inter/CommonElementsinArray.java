package com.inter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsinArray {
	
	public static void main(String[] args) {

		List<String> str= Arrays.asList("venky","Raj","Kumar","Teja","Harsha");
		List<String> str1=Arrays.asList("Venky","Jagadeesh","Girish","teja","Murali");
		
		str.replaceAll(String::toLowerCase);
		str1.replaceAll(String::toLowerCase);

		List<String>list=str.stream().filter(x->str1.stream().anyMatch(y->y.equals(x))).collect(Collectors.toList());
		System.out.println(list);

	}

}

//List<String> l1=str.stream().map(String::toLowerCase).collect(Collectors.toList());
//List<String> l2=str1.stream().map(String::toLowerCase).collect(Collectors.toList());
//int[] a1= {4,5,9,2,3,7};
//int[] a2= {5,8,1,6,2,3};

//List<Integer> list=Arrays.stream(str).filter(number->Arrays.stream(str).anyMatch(anumber->anumber==number)).boxed().collect(Collectors.toList());

//System.out.println(list);
