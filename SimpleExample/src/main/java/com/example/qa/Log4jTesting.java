package com.example.qa;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Log4jTesting {
	WebDriver driver;
	static Logger log = Logger.getLogger(Log4jTesting.class);

	@Test
	public void openBrowser() {
		log.info("Launch the browser");
		System.setProperty("webdriver.chrome.driver","D:\\Dinesh\\Selenium_Resources\\Selenium_Chrome_Driver_on_24-04-2018\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Open the url in browser");
		driver.get("https://www.google.com/");

	}
}
