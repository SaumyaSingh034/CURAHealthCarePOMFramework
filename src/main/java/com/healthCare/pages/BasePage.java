package com.healthCare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Pages{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
	//Crearting generic methods
	
	public void doClickOnElement(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void doSendKey(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	public String getTextOfElement(By locator)
	{
		return driver.findElement(locator).getText();
	}
	public void validateLocator(By locator)
	{
		driver.findElement(locator).isDisplayed();
	}
	

}
