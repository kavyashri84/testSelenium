package com.xyz.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.xyz.pages.mercuryloginpage;

public class mercurylogintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavyashri Kulkarni\\TESTING\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/login.php");
		
		//mercuryloginpage mPage = new mercuryloginpage();
		mercuryloginpage mPage = PageFactory.initElements(driver, mercuryloginpage.class);
	//	mPage.setUserName(driver, "ffff");
		mPage.setUserName( "ffff");

	//	mPage.setPassword(driver, "mumbai");
		//mPage.setbtnClick(driver);
		//driver.findElement(By.name("userName")).sendKeys("ffff");
		//driver.findElement(By.name("password")).sendKeys("gffffhgd");
		//driver.findElement(By.name("submit")).click();
		driver.close();

	}

}
