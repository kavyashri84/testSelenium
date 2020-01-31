package com.xyz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyz.pages.mercuryloginpage;

public class MercuryTestNGTest {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  

		driver.get("http://demo.guru99.com/test/newtours/login.php");
		
	//	mercuryloginpage mPage = new mercuryloginpage();
		mercuryloginpage mPage = PageFactory.initElements(driver, mercuryloginpage.class);

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
			mPage.setUserName(b.toString());
			//mPage.setUserName(driver, b.toString());
			mPage.setPassword(c.toString());
			mPage.setbtnClick();
		}
		//driver.findElement(By.name("userName")).sendKeys("ffff");
		//driver.findElement(By.name("password")).sendKeys("gffffhgd");
		//driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavyashri Kulkarni\\TESTING\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
		driver.close();

  }

}
