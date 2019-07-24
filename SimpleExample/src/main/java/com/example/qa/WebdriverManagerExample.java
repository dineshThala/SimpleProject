package com.example.qa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.util.qa.Utilities;

public class WebdriverManagerExample extends Utilities{

	

	/*@BeforeSuite
	public void setup() {

	htmlReporter = new ExtentHtmlReporter("extentreport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver","D:\\Dinesh\\Selenium_Resources\\Selenium_Chrome_Driver_on_24-04-2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}*/


/*	@Test
	public void openBrowser() {

		// WebDriverManager.chromedriver().version("2.40").setup();
		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.chrome.driver","D:\\Dinesh\\Selenium_Resources\\Selenium_Chrome_Driver_on_24-04-2018\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

	}*/
	
	@BeforeSuite
	public void SetUpTestData() {
		setup();
	}
	
	@Test
	public void validateSearchbox7() throws InterruptedException, IOException {

		test = extent.createTest("Google Search seven","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		capture("g");
		test.pass("Entered in searchbox");
	
		
	}

	@AfterSuite
	public void tearDown() {
		test.log(Status.INFO, "Testcase completed");
		driver.quit();
		extent.flush();
	}

	
}
