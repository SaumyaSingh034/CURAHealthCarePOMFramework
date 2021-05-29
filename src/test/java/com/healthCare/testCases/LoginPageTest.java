package com.healthCare.testCases;

import org.testng.annotations.Test;

import com.healthCare.pages.LandingPage;
import com.healthCare.pages.LoginPage;
import com.healthCare.utilities.BaseUtility;

import junit.framework.Assert;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void validateLoginPageTitle()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
		String ACTUAL_LOGINPAGE_TITLE = page.getInstance(LoginPage.class).validateLoginPage();
		Assert.assertEquals(BaseUtility.EXPECTED_LOGINPAGE_TITLE, ACTUAL_LOGINPAGE_TITLE);
	}
	
	@Test(priority=2)
	public void logintoApplication()
	{
		page.getInstance(LandingPage.class).clickOntoggleBtn_Login();
		page.getInstance(LoginPage.class).loginToApplication(prop.getProperty("username"), prop.getProperty("password"));
	}

}
