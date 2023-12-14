package com.inter;

import java.util.ArrayList;

public class Search_element_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> array= new ArrayList<>();
		array.add("Andhra");
		array.add("Mumbai");
		array.add("Kolkata");
		array.add("Tamilnadu");
		if(!array.contains("Andhr")) {
			System.out.println("Not found");
			
		}else {
			System.out.println("The above list contains what you are looking");
		}

	}

}
