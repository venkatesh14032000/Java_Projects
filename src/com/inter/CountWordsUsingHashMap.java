package com.inter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {
		//Using java 8
		String sen="The The The hungry hungry cheetha went out side for food to her cubs";
		List<String> list= Arrays.asList(sen.split(" "));
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		//Using java forloop.
//		String sentence= "The The The hungry hungry cheetha went out side for food to her cubs";
//		String[] str= sentence.split(" ");
//		
//		HashMap<String, Integer> map= new HashMap<String, Integer>();
//		for(int i=0;i<str.length;i++) {
//			//System.out.println(str[i]);
//			if(map.containsKey(str[i])) {
//				int count= map.get(str[i]);
//				map.put(str[i], count+1);
//			}
//			else {
//				map.put(str[i], 1);
//			}
//			
//			
//		}
//		System.out.println(map);
//		
//		

	}

}
