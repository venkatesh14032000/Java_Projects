package com.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		List<Integer> l= new ArrayList<Integer>();
		int a= ll.size();
		for(int i=ll.size()-1;i>=0;i--) {
			l.add(ll.get(i));
		}
		System.out.println(l);
	}

}
