package com.xyz.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testCredentials {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("C:\\Users\\Kavyashri Kulkarni\\Documents\\loginCredentials.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);
		XSSFCell a,b,c;
		for(int i = 0; i <= xs.getLastRowNum();i++)
		{
			int col =0;
			a= xs.getRow(i).getCell(col);
			b = xs.getRow(i).getCell(col+1);
			c = xs.getRow(i).getCell(col+2);
			if(a!=null)
			{
			System.out.print(a);
			System.out.print(" ");
			}
			
			if(b!=null)
			{
			System.out.print(b);
			System.out.print(" ");
			
			}

			if(c!=null)
			{
			System.out.print(c);
			System.out.print(" ");
			
			}
			System.out.println();
		}
		
	}
	

}
