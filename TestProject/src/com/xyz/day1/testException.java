package com.xyz.day1;

public class testException {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 0;
		int div;
		
		//div = num1/num2;
		//System.out.println(div);
		try
		{
			//div = num1/num2;
			int array[] = {1,2,3};
			System.out.println(array[4]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic");
		}
		catch(NullPointerException e)
		{
			System.out.println("Inside null pointer");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array");
		}
		catch(Exception e)
		{
			System.out.println("Generic");
		
		}
		finally {
			System.out.println("working");
		}
	}
}
 