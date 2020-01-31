package com.xyz.day1;

public class CalculateInterest {
	public static void main(String[] args) {
		int principal = 1250;
		int time = 3;
		int rate = 10;
		int Amount;
		int SimpleInterest;
		int CompoundInterest;
		
		SimpleInterest = ((principal*time*rate)/100);
		Amount = principal*((1+rate/100)*(1+rate/100)*(1+rate/100));
		
		CompoundInterest = Amount - SimpleInterest;
		
		System.out.println("Simple Interest is "+SimpleInterest);
		System.out.println("Amount "+Amount);
		System.out.println("Compound Interest is "+CompoundInterest);
		
	}

	
}
