package com.xyz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class testSelDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.findElement(By.className("validate[required]")).sendKeys("Siddharth");
		
		
		
		
		
		/*driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.id("txtName")).sendKeys("Test");
		driver.findElement(By.id("txtEmail")).sendKeys("abc@xyz.com");
		
		Select mySelect = new Select(driver.findElement(By.id("ddlSubject")));
		//mySelect.selectByVisibleText("Feedback");
		//mySelect.selectByIndex(1);
		mySelect.selectByValue("Feedback");*/
		
		
		
/*		driver.findElement(By.id("txtMessage")).sendKeys("ijis djosa");
		driver.findElement(By.name("btnSubmit")).click();
		
		driver.findElement(By.id("txtName")).clear();
		driver.findElement(By.name("btnSubmit")).click();*/
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.close();
	
	
	}
	

}
