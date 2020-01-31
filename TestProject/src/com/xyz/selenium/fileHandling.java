package com.xyz.selenium;

import java.io.File;

public class fileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try
	{
	File f = new File("C:\\Users\\Kavyashri Kulkarni\\Documents\\practice.txt");
	boolean status = f.createNewFile();
	System.out.println("status "+status);
		
	}
	catch(Exception e)
	{
		System.out.println("file handling");
		e.printStackTrace();
	}
	}

}
