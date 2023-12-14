package com.inter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class Remove_duplicate {

	public static void main(String[] args) {
		int[] a= {1,1,2,5,5,4,66,9,5,9,7,7,7,7,66};
		Set<Integer> setter= new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			setter.add(a[i]);
		}
		System.out.println(setter);
	}

}
