package com.xyz.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(1);
		numbers.add(10);
		//System.out.println(numbers.get(1));
		System.out.println(numbers.size());
		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer mynum = (Integer) iterator.next();
			System.out.println(mynum);
		}
		
		numbers.remove(1);
		System.out.println(numbers.size());
		
		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer mynum = (Integer) iterator.next();
			System.out.println(mynum);
		}
		
		System.out.println(numbers.get(1));
		
	}

}
