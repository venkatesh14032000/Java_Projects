package com.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_List {

	public static void main(String[] args) {
		int[] list= {5,8,6,4,7,2,3,9,1,0};
		Arrays.stream(list).sorted().forEach(System.out::print);
		
		//Arrays.stream(list).sorted().forEach(System.out::print);
		
//		ArrayList<String> al= new ArrayList<String>();
//		al.add("zxc");
//		al.add("Ganesh");
//		al.add("Venkat");
//		al.add("Arunachal");
//		al.add("Bharat");
		
//		Collections.sort(al);
//		System.out.println(al);
	}

}
