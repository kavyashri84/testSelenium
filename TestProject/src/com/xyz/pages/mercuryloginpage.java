package com.xyz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mercuryloginpage {
	
//	By nameParam = By.name("userName");
	@FindBy(name="userName")
	WebElement nameParam;
	
	@FindBy(name = "password")
	WebElement passParam;
	
	@FindBy(name = "submit")
	WebElement buttonParam;
	
	
	//By passParam = By.name("password");
	//By buttonParam = By.name("submit");
	
	//public void setUserName(WebDriver driver, String text) {
		public void setUserName(String text) {

		//driver.findElement(By.name("userName")).sendKeys(text);
		//driver.findElement(nameParam).sendKeys(text);
		nameParam.sendKeys(text);
	}
	
//	public void setPassword(WebDriver driver, String text) {
		public void setPassword(String text) {
		//driver.findElement(By.name("password")).sendKeys(text);
	//	driver.findElement(passParam).sendKeys(text);
			passParam.sendKeys(text);
	}

	
		
		//public void setbtnClick(WebDriver driver) {
			public void setbtnClick() {
		//driver.findElement(By.name("submit")).click();
		//driver.findElement(buttonParam).click();
				buttonParam.click();
	}

}
