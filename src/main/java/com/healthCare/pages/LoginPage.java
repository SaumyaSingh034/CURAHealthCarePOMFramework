package com.healthCare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	By userName = By.id("txt-username");
	By passWord = By.id("txt-password");
	By loginBtn = By.id("btn-login");
	
	//Enter Login credentials-----------------
	
	public void loginToApplication(String userid, String pwd)
	{
		doSendKey(userName, userid);
		doSendKey(passWord, pwd);
		doClickOnElement(loginBtn);
	}
	public String validateLoginPage()
	{
		return driver.getTitle();
	}

}
