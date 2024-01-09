package com.inter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HahTableVsHashMap {

	public static void main(String[] args) {
		Hashtable<Integer, String>ht=new Hashtable<Integer, String>();
		ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        System.out.println("-------------Hash table--------------");
        for(Map.Entry m:ht.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("-------------Hash Map--------------");
        HashMap<Integer, String>hm=new HashMap<Integer, String>();
        hm.put(101," ajay");
        hm.put(101,"Vijay");
        hm.put(102,"Ravi");
        hm.put(103,"Rahul");
        for(Map.Entry m:hm.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}
