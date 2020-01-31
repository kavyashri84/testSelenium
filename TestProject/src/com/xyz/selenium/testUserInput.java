package com.xyz.selenium;

import java.util.Scanner;

public class testUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		int num = sc.nextInt();
		int i = 1;
		
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
	}

}
