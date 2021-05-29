package com.healthCare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
	By makeAppointment = By.id("btn-make-appointment");
	By menuToggleBTn = By.cssSelector("#menu-toggle");
	By homeLink = By.xpath("//*[text()='Home']");
	By LoginLink = By.xpath("//*[text()='Login']");
	By contactMail = By.xpath("//*[text()='info@katalon.com']");
	By facebookLink = By.xpath("//i[@class='fa fa-facebook fa-fw fa-3x']");
	By twitterLink = By.xpath("//i[@class='fa fa-twitter fa-fw fa-3x']");
	By dribbleLink = By.xpath("//i[@class='fa fa-dribbble fa-fw fa-3x']");
	
	//Action methods
	
	public String getTitleOfPage()
	{
		return driver.getTitle();
	}
	
	public void validateLandingPage()
	{
		validateLocator(makeAppointment);
		validateLocator(menuToggleBTn);
		validateLocator(contactMail);
		validateLocator(facebookLink);
		validateLocator(twitterLink);
		validateLocator(dribbleLink);

	}
	
	public void clickOntoggleBtn_Home()
	{
		doClickOnElement(menuToggleBTn);
		doClickOnElement(homeLink);
	}
	
	public void clickOntoggleBtn_Login()
	{
		doClickOnElement(menuToggleBTn);
		doClickOnElement(LoginLink);
	}
	public void clickOnMakeAppointment()
	{
		doClickOnElement(makeAppointment);
	}
}
