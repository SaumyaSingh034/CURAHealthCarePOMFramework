package com.healthCare.testCases;

import org.testng.annotations.Test;

import com.healthCare.pages.LandingPage;
import com.healthCare.pages.LoginPage;
import com.healthCare.pages.MakeAppointmentPage;
import com.healthCare.utilities.BaseUtility;

import junit.framework.Assert;

public class MakeAppointmentPageTest extends BaseTest{
	
	@Test(priority=0)
	public void getTitleOfPage()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
		String ACTUAL_TITLE = page.getInstance(MakeAppointmentPage.class).validateTitle();
		System.out.println(ACTUAL_TITLE);
		Assert.assertEquals(BaseUtility.EXPECTED_LOGINPAGE_TITLE, ACTUAL_TITLE);
	}
	
	@Test(priority=1)
	public void validateHeaderOfHomePage()
	{	page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
			page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
		String ACTUAL_TEXT = page.getInstance(MakeAppointmentPage.class).getTextOFHeader();
		Assert.assertEquals(BaseUtility.EXPECTED_TEXT, ACTUAL_TEXT);
		
	}
	
	@Test(priority=2)
	public void selectFacilityFromDropDown()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
		page.getInstance(MakeAppointmentPage.class).selectFacility(BaseUtility.FACILITY_TEXT);
		page.getInstance(MakeAppointmentPage.class).checkReadamissionCheckBox(BaseUtility.READMISSION);
		page.getInstance(MakeAppointmentPage.class).clickOnHealthCareProgram(BaseUtility.HEALTHCARE_PROGRAME);
		page.getInstance(MakeAppointmentPage.class).chosseDate();
		page.getInstance(MakeAppointmentPage.class).enterComment(BaseUtility.COMMENTS_TEXT);
		page.getInstance(MakeAppointmentPage.class).bookAppointmentBtn();
	}
//	@Test(priority=3)
//	public void checkReadmissionBox()
//	{
//		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
//		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
//		page.getInstance(MakeAppointmentPage.class).checkReadamissionCheckBox(BaseUtility.READMISSION);
//		page.getInstance(MakeAppointmentPage.class).enterComment(BaseUtility.COMMENTS_TEXT);
//	}
//	@Test(priority=4)
//	public void selectHealthCareProgram()
//	{
//		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
//		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
//		page.getInstance(MakeAppointmentPage.class).clickOnHealthCareProgram(BaseUtility.HEALTHCARE_PROGRAME);
//	}
//	@Test(priority=5)
//	public void selectVisitDate()
//	{
//		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
//		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
//		page.getInstance(MakeAppointmentPage.class).chosseDate();
//	}
//	@Test(priority=6)
//	public void enterCommentSection()
//	{
//		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
//		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
//		page.getInstance(MakeAppointmentPage.class).enterComment(BaseUtility.COMMENTS_TEXT);
//	}
//	
//	@Test(priority=7)
//	public void clickOnBookAppointmentBtn()
//	{
//		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
//		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
//		page.getInstance(MakeAppointmentPage.class).bookAppointmentBtn();
//	}

}
