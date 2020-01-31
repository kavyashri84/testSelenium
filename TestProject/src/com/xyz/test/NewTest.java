package com.xyz.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

  @Test (priority = 2)
  public void testhover() throws InterruptedException {
	    
		driver.get("https://techcanvass.com");
		driver.manage().window().maximize();
		
		Actions myAction = new Actions(driver);
		WebElement slc = driver.findElement(By.linkText("Self-learning Courses"));
		Thread.sleep(2000);
		myAction.moveToElement(slc).build().perform();
		Thread.sleep(3000);
		WebElement at = driver.findElement(By.linkText("Automation Testing"));
		Thread.sleep(2000);
		myAction.moveToElement(at).build().perform();
		WebElement sel = driver.findElement(By.linkText("Selenium Self Learning"));
		sel.click();
		Thread.sleep(2000);
		
		
		
		
		

  }
  
  @Test (priority = 1)
  public void testvalidate() {
	  	driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	  	driver.manage().window().maximize();
		driver.findElement(By.className("validate[required]")).sendKeys("Siddharth");

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
