package com.xyz.day1;

public class AreaShapes {

public static void main(String[] args) {
		
		int length = 10;
		int breadth = 5;
		int side = 4;
		int radius = 6;
		int areaR,areaS,areaC;
		
		areaR = length*breadth;
		areaS = side*side;
		areaC = ((22/7)*radius*radius);
		
		System.out.println("Area of Rectangle "+areaR);
		System.out.println("Area of Square "+areaS);
		System.out.println("Area of Circle "+areaC);
	}

}
