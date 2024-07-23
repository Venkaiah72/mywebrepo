package com.web.app.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfo extends BaseTest {
	private WebDriver driver;
	private LoginTest loginTest;

	@BeforeMethod
	public void setup() {

		// Initialize LoginTest instance
		loginTest = new LoginTest();
	}

	@Test
	public void checkingMyPersonalInfo() {
		String pageTitle = driver.getTitle();

		driver.findElement(By.xpath("//a[@class='oxd-brand']")).click();

		Assert.assertEquals(pageTitle, "PIM", "Page title is not as expected");

	}

	@AfterMethod
	public void teardown() {
		// Close browser
		if (driver != null) {
			driver.quit();
		}

	}
}
