package com.xyz.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	/*
			FileOutputStream fs = new FileOutputStream("C:\\Users\\Kavyashri Kulkarni\\Documents\\practice.txt");
			String text = "I live in Mumbai";
			byte b[] = text.getBytes();
			fs.write(b);
			fs.close();
		*/
	FileInputStream fs = new FileInputStream("C:\\Users\\Kavyashri Kulkarni\\Documents\\practice.txt");
	int i = 0;
	while((i = fs.read()) != -1)
	{
		System.out.print((char)i);
		
	}
	fs.close();
	}

}
