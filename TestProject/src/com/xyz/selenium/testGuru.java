package com.xyz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Kavyashri Kulkarni\\Documents\\FIRSTTEJAS.RTF");
		driver.findElement(By.id("terms")).click();
	}

}
 