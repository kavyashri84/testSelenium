package com.xyz.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavyashri Kulkarni\\TESTING\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/login.php");
	
		FileInputStream fs = new FileInputStream("C:\\Users\\Kavyashri Kulkarni\\Documents\\loginCredentials.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);
		XSSFCell a,b,c;
		for(int i = 1; i <= xs.getLastRowNum();i++)
		{
			int col =0;
			a= xs.getRow(i).getCell(col);
			b = xs.getRow(i).getCell(col+1);
			c = xs.getRow(i).getCell(col+2);
			
		driver.findElement(By.name("userName")).sendKeys(b.toString());
		driver.findElement(By.name("password")).sendKeys(c.toString());
		driver.findElement(By.name("submit")).click();
		
		
		/*	if(a!=null)
			{
			System.out.println(a);
			}
			
			if(b!=null)
			{
			System.out.println(b);
			}*/
		}
		driver.close();
	}

}
