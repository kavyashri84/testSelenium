package com.xyz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class testActions {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.get("https://techcanvass.com");
		driver.manage().window().maximize();
		
		Actions myAction = new Actions(driver);
		WebElement slc = driver.findElement(By.linkText("Self-learning Courses"));
		Thread.sleep(2000);
		myAction.moveToElement(slc).build().perform();
		Thread.sleep(2000);
		WebElement at = driver.findElement(By.linkText("Automation Testing"));
		Thread.sleep(2000);
		myAction.moveToElement(at).build().perform();
		WebElement sel = driver.findElement(By.linkText("Selenium Self Learning"));
		sel.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
