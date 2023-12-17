package com.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayListToAnother {
	public static int num() {
		return 45;
	}

	public static void main(String[] args) {
		CopyArrayListToAnother ca= new CopyArrayListToAnother();
		System.out.println(ca.num());
		ArrayList<String> array= new ArrayList<>();
		
		array.add("Andhra");
		array.add("Mumbai");
		array.add("Kolkata");
		array.add("Tamilnadu");
		
		ArrayList<String> ar= new ArrayList<>();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		
		Collections.copy(array,ar);
		System.out.println(ar);
		System.out.println(array);
		
		

	}

}
