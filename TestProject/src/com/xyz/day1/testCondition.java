package com.xyz.day1;

public class testCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 80 ;
		
		if(marks>=75) {
			System.out.println("Distinction");
		}
		else if(marks>=60 && marks<75){
			System.out.println("firstclass");
		}
		else if(marks>=45 && marks <60) {
			System.out.println("second class");
		}
		else {
			System.out.println("Fail");
		
}	
		
	}

}
