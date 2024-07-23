package com.web.app.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void loginWithValidCredentials() {

		driver.get("https://opensource-demo.orangehrmlive.com");

		String username = "Admin";
		String password = "admin123";

		// Login
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

	}
}
