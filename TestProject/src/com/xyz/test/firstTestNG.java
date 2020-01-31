package com.xyz.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class firstTestNG {
	WebDriver driver;
  
  @Test (priority = 2)
  public void f1() {
	 // System.out.println("f1");
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Kavyashri Kulkarni\\Documents\\FIRSTTEJAS.RTF");
		driver.findElement(By.id("terms")).click();
  }

  @Test  (priority = 1)
  public void formfilling() {
	  System.out.println("f2");
		
      String baseUrl = "http://demo.guru99.com/test/newtours/";
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";

      // launch Fire fox and direct it to the Base URL
      driver.get(baseUrl);
    //  driver.manage().window().fullscreen();
      driver.manage().window().maximize();
    //  driver.findElement(By.linkText("REGISTER")).click();
      
      WebElement myEle = driver.findElement(By.linkText("REGISTER"));
      myEle.click();
      
     // driver.findElement(By.name("firstName")).sendKeys("Siddharth");
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Siddharth");
     // driver.findElement(By.name("lastName")).sendKeys("Kulkarni");
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Kulkarni");
      driver.findElement(By.name("phone")).sendKeys("8789890");
      
      driver.findElement(By.name("submit")).click();

  }
  
  @Test  (dependsOnMethods = { "f1", "formfilling"})
  public void f3() {
	  System.out.println("f3");
  }
  
  @BeforeTest
  public void beforeTest() {
	 // System.out.println("before test");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavyashri Kulkarni\\TESTING\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	
  }

  @AfterTest
  public void afterTest() {
//	  System.out.println("after test");
      driver.close();

  }

}
