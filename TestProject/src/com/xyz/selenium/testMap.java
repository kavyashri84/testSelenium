package com.xyz.selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class testMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer, String> myMap = new HashMap<Integer, String>();//unordered
		//LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();//ordered
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();//sort on keys
		myMap.put(101, "Tejas");
		myMap.put(701, "sid");
		myMap.put(301, "kavya");
		myMap.put(801, "dhruv");
		myMap.put(501, "sumit");
		myMap.put(601, "satvik");
		myMap.remove(501);
		
		System.out.println(myMap);
		//System.out.println(myMap.get(101));
		
		Set<Integer> keys =  myMap.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key="+key+" value="+myMap.get(key));
			
		}
		
	}

}
