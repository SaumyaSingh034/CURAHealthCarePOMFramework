package com.healthCare.testCases;

import org.testng.annotations.Test;

import com.healthCare.pages.LandingPage;
import com.healthCare.utilities.BaseUtility;

import junit.framework.Assert;

public class LandingPageTest extends BaseTest{
	
	
	
	@Test(priority=-1)
	public void validateTitleofPage()
	{
		String ACTUAL_LOGINPAGE_TITLE = page.getInstance(LandingPage.class).getTitleOfPage();
		System.out.println(ACTUAL_LOGINPAGE_TITLE);
		Assert.assertEquals(BaseUtility.EXPECTED_LOGINPAGE_TITLE, ACTUAL_LOGINPAGE_TITLE);
	}
	
	@Test(priority=0)
	public void validateLoginPageFully()
	{
		page.getInstance(LandingPage.class).validateLandingPage();
		System.out.println("***************All Validated successully******************");
	}
	
	@Test(priority=1)
	public void clickOnToggleBtn_Home()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Home();
	}
	
	@Test(priority=2)
	public void clickOnToggleBtn_Login()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
	}
	
	@Test(priority=3)
	public void clickOnMakeAppontment()
	{
		page.getInstance(LandingPage.class).clickOnMakeAppointment();
	}

}
