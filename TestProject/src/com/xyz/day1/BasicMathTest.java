package com.xyz.day1;

public class BasicMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=18;
		int num2=6;
		BasicMathlogic bmlogic = new BasicMathlogic();
		System.out.println(bmlogic.addNum(num1, num2));
		System.out.println(bmlogic.subNum(num1, num2));
		System.out.println(bmlogic.mplyNum(num1, num2));
		System.out.println(bmlogic.divNum(num1, num2));
	}

}
