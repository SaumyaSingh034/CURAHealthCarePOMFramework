package com.healthCare.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.healthCare.pages.BasePage;

public class BaseUtility extends BasePage{
	
	public BaseUtility(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	public static String FILE_PATH = "D:\\Selenium\\FrameworkPractice\\CURAHelathCareProject\\"
			+ "src\\main\\java\\com\\healthCare\\config\\config.Properties";
	public static long IMPLICIT_WAIT = 90;
	public static long PAGE_LOAD_TIME = 20;
	public static String EXPECTED_LOGINPAGE_TITLE = "CURA Healthcare Service";
	public static String EXPECTED_TEXT = "Make Appointment";
	public static String FACILITY_TEXT = "Hongkong CURA Healthcare Center";
	public static String READMISSION = "Yes";
	public static String HEALTHCARE_PROGRAME = "Medicaid";
	public static String COMMENTS_TEXT = "HI I am Saumya, Doing Dummy Testing";
	
public static void takeScreenshotAtEndOfTest() {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	
	

}
