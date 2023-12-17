package com.inter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Preparation {

	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Varun");
		map.put(2, "Naresh");
		map.put(3, "Murali");
		map.put(4, "Jagadeesh");
		map.put(5, "Naveen");
		map.put(6, "Rajesh");
		System.out.println(map.clone());
		System.out.println(map);
		Set<Map.Entry<Integer, String>> s= map.entrySet();
		Iterator<Map.Entry<Integer, String>> s1=s.iterator();
		while(s1.hasNext()) {
			Map.Entry<Integer, String> m= s1.next();
			System.out.println(m);
		}
		
//		Queue<String> q= new LinkedList<String>();
//		q.add("Apple");
//		q.add("Banana");
//		q.add("Grape");
//		q.add("Apricot");
//		q.add("Lemon");
//		q.offer("Jack fruit");
//		 Iterator itr= q.iterator();
//		 while(itr.hasNext()) {
//			 System.out.println(itr.next());
//		 }
		
		
		//String element=q.element();
		//System.out.println(element);
		//System.out.println(q);
		//System.out.println(q);
		//String head= q.poll();
//	      String ele=q.peek();
//		  System.out.println(ele);
		//System.out.println(head);
		//System.out.println(q);
//		String word= "hvfbbjh sbksbvjhd sbhbjhhfh";
//		int count;
//		char string[]=word.toCharArray();
//		for(int i=0;i<string.length;i++) {
//			count=1;
//			for(int j=i+1;j<string.length;j++) {
//				if(string[i]==string[j]&&string[i]!=' ') {
//					count++;
//					string[j]='0';
//					//System.out.println(string[i]);
//				}
//			}
//			if(count>1 && string[i]!='0')
//				System.out.println(string[i]);
//		}
		
//		int[] list={4,1,2,3,5,5,1};
//		for(int i=0;i<list.length;i++) {
//			for(int j=i+1;j<list.length;j++) {
//				if(list[i]==list[j]) {
//					System.out.println(list[i]);
//				}
//			}
//			
//		}
	}

}
