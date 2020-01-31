package com.xyz.day1;

public class BasicMaths {
	
	public static void main(String[] args) {
		
		int num1=18;
		int num2=6;
		//int sum,sub,mply,div;
		
		//sum = num1 + num2;
		//sub = num1 - num2;
		//mply = num1 * num2;
		//div  = num1/num2;
		
		System.out.println("Results are as below");
		System.out.println("Addition "+addNum(num1,num2));
		System.out.println("Subtraction "+subNum(num1,num2));
		System.out.println("Multiplication "+mplyNum(num1,num2));
		System.out.println("Division "+divNum(num1,num2));
		
		
		
	}
		public static int addNum(int num1,int num2){
		
			int sum = num1 + num2;
			return sum;
		
	}
		public static int subNum(int num1,int num2){
			
			int sum = num1 - num2;
			return sum;
		
	}	public static int mplyNum(int num1,int num2){
			
			int sum = num1 * num2;
			return sum;
		
	}
		public static int divNum(int num1,int num2){
			
			int rem = num1 / num2;
			return rem;
		
	}

}
