package com.util.qa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Utilities {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver = null;
	public static String PATH_TO_PACKAGE = System.getProperty("user.dir");

	@BeforeSuite
	public void setup() {

	htmlReporter = new ExtentHtmlReporter("extentreport1.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
//	test = extent.saveTest(MethodName);
//	test.assignAuthor("Dinesh");
	

	}
	
	@BeforeTest
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver","D:\\Dinesh\\Selenium_Resources\\Selenium_Chrome_Driver_on_24-04-2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public static void capture(String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = PATH_TO_PACKAGE + "\\Reports\\" + "\\" + screenShotName + ".png";	
	    System.out.println(dest);
		File destination = new File(dest);
		System.out.println(source);
		FileUtils.copyFile(source, destination);
		test.addScreenCaptureFromPath(dest);
	
	}
	
}
