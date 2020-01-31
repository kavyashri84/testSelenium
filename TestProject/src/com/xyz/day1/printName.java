package com.xyz.day1;

public class printName {

	 public static void main(String[] args) {
		String firstName = "Kavyashri";
		String lastName = "kavyashri";
		String test = "I Live in Mumabai";
		System.out.println(firstName+" "+lastName);
		
		
		
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println("length "+firstName.length());
		System.out.println("Using charAt "+firstName.charAt(5));
		System.out.println("Uppercase "+firstName.toUpperCase()+" "+lastName.toUpperCase());
		System.out.println("Lowercase "+firstName.toLowerCase()+" "+lastName.toLowerCase());
		System.out.println("trim "+firstName.trim());
		System.out.println("equals "+firstName.equals(lastName));
		System.out.println(firstName.equalsIgnoreCase(lastName));
		System.out.println(firstName.substring(3));
		System.out.println(firstName.substring(3,3));
		System.out.println("Replace "+firstName.replace("K", "Bh"));
		
		String  [] myValues = test.split("i");
		
		System.out.println("Array "+myValues.length);
		System.out.println(myValues[2]);
	 }
}
