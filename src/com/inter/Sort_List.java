package com.inter;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_List {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("zxc");
		al.add("Ganesh");
		al.add("Venkat");
		al.add("Arunachal");
		al.add("Bharat");
		
		Collections.sort(al);
		System.out.println(al);
	}

}
