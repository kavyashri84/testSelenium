package com.xyz.selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class testHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set<Integer> myset = new HashSet<Integer>();//unordered list 
		//Set<Integer> myset = new LinkedHashSet<Integer>();//ordered list
		Set<Integer> myset = new TreeSet<Integer>();//sorted list
		
		myset.add(401);
		myset.add(201);
		myset.add(301);
		myset.add(201);
		myset.add(101);
		myset.add(101);
		System.out.println(myset.size());
		for (Iterator iterator = myset.iterator(); iterator.hasNext();) {
			Integer mynum = (Integer) iterator.next();
			System.out.println(mynum);
		}
		
		
	}

}
