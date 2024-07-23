package com.web.app.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
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

		driver.findElement(By.xpath("//*[text()='Admin']")).click();

		Assert.assertEquals(pageTitle, "Admin UserManagement", "Page title is not as expected");

	}

	@AfterMethod
	public void teardown() {
		// Close browser
		if (driver != null) {
			driver.quit();
		}

	}
}
