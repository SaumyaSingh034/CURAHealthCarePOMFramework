package com.healthCare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeAppointmentPage extends BasePage {

	public MakeAppointmentPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
	By makeAppointment =By.xpath("//div[@class='col-sm-12 text-center']/h2");
	By facility = By.cssSelector("#combo_facility");
	By readmissionCheckBox= By.cssSelector("#chk_hospotal_readmission");
	By healthCareProgram = By.xpath("//*[text()='Healthcare Program']");
	By medicare = By.cssSelector("#radio_program_medicare");
	By medicaid = By.cssSelector("#radio_program_medicaid");
	By none = By.cssSelector("#radio_program_none");
	By calendar = By.xpath("//span[@class='glyphicon glyphicon-calendar']");
	By date = By.xpath("//table[@class='table-condensed']/tbody/tr[6]/td[6]");
	By comment = By.cssSelector("#txt_comment");
	By bookAppointmentBtn= By.cssSelector("#btn-book-appointment");
	
	public void clickOnHealthCareProgram(String healthCare_text)
	{
		if(healthCare_text.contains("Medicare"))
		{
			doClickOnElement(medicare);
		}
		else if(healthCare_text.contains("Medicaid"))
		{
			doClickOnElement(medicaid);
		}
		else
		{
			doClickOnElement(none);
		}
	}
	
	public void bookAppointmentBtn()
	{
		doClickOnElement(bookAppointmentBtn);
	}
	
	public void enterComment(String comment_Text)
	{
		doClickOnElement(comment);
		doSendKey(comment, comment_Text);;
	}
	public void chosseDate()
	{
		doClickOnElement(calendar);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		doClickOnElement(date);
	}
	public String validateTitle()
	{
		return driver.getTitle();
	}
	public String getTextOFHeader()
	{
		return getTextOfElement(makeAppointment);
	}
	
	public void selectFacility(String facility_text)
	{
		Select sec = new Select(driver.findElement(facility));
		sec.selectByVisibleText(facility_text);
	}
	
	public void checkReadamissionCheckBox(String readadmission_Checkbox)
	{
		if(readadmission_Checkbox.contains("Yes"))
		{
			driver.findElement(readmissionCheckBox).click();
		}
		else if(readadmission_Checkbox.contains("No"))
		{
			
		}
		else {
			System.out.println("Oops you have selected any option");
		}
	}

}
