package com.example.qa;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.util.qa.Utilities;


public class ExtentReportExample extends Utilities{

	
	@BeforeSuite
	public void SetUpTestData() {
		setup();
	}
	
	
	

	@Test(priority=0)
	public void b_validateSearchbox1() throws InterruptedException {

		test = extent.createTest("Google Search one","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.pass("Entered in searchbox");
		

	}

	@Test(priority=1)
	public void c_validateSearchbox2() throws InterruptedException {

		test = extent.createTest("Google Search two","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.pass("Entered in searchbox");
		

	}
	
	@Test(priority=0)
	public void bc_validateSearchbox3() throws InterruptedException {

		test = extent.createTest("Google Search three","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.fail("Entered in searchbox");
		

	}
	
	@Test
	public void a_validateSearchbox4() throws InterruptedException {

		test = extent.createTest("Google Search four","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.pass("Entered in searchbox");
	

	}
	
	@Test(priority=1)
	public void ab_validateSearchbox5() throws InterruptedException {

		test = extent.createTest("Google Search five","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.addScreenCaptureFromBase64String("g");
		test.fail("Entered in searchbox");
		
	
		
	}
	
	@Test
	public void b_validateSearchbox6() throws InterruptedException {

		test = extent.createTest("Google Search six","this is validate for google search function");
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		test.pass("Entered in searchbox");
	
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		test.log(Status.INFO, "Testcase completed");
		driver.quit();
		extent.flush();
	}

	
	
}
