package com.xyz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
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
        driver.close();

	}

}
