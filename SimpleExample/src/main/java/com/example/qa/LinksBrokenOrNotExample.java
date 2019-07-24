package com.example.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksBrokenOrNotExample {

	WebDriver driver = null;

	@BeforeTest
	public void openBrowser() {

		WebDriverManager.chromedriver().version("2.40").setup();
		// System.setProperty("webdriver.chrome.driver","D:\\Dinesh\\Selenium_Resources\\Selenium_Chrome_Driver_on_24-04-2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void checksLinks() throws InterruptedException {

		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation\n");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int linkcount = elements.size();
		System.out.println("No of links are : " + linkcount);
		Thread.sleep(3000);
		for (WebElement ele : elements) {
			/*String url = ele.getAttribute("href");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("Url is Empty or not configured");
				continue;
			}*/
			Thread.sleep(3000);
			ele.click();
			String title = driver.getTitle();
			if (title.contains("404")) {
				System.out.println("Url link is broken");
			}
			Thread.sleep(3000);
			driver.navigate().back();
		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
