package com.healthCare.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.healthCare.pages.Pages;
import com.healthCare.utilities.BaseUtility;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Properties prop;
	public String browserName;
	public Pages page;
	
	public BaseTest()
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(BaseUtility.FILE_PATH);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void invokeBrowser()
	{
		browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\FrameworkPractice\\CURAHelathCareProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			

		} else if (browserName.equalsIgnoreCase("ie")) {

			driver = new InternetExplorerDriver();
			System.setProperty("webdriver.ie.driver",
					"D:\\Selenium\\FrameworkPractice\\CURAHelathCareProject\\drivers\\IEServer.exe");

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium\\FrameworkPractice\\CURAHelathCareProject\\drivers\\geckodriver.exe");

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
			System.setProperty("webdriver.edge.driver",
					"D:\\Selenium\\FrameworkPractice\\CURAHelathCareProject\\drivers\\edgedriver.exe");

		} else {
			System.out.println("Please Check Your Browser. You have enter wrong browser......");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(BaseUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(BaseUtility.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		page = new Pages(driver, wait);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
