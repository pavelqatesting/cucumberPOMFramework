package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// By Locator

	// Email address
	private By emailId = By.id("email");
	// Password
	private By password = By.id("passwd");
	// Log in button
	private By logIn = By.id("SubmitLogin");
	// Forgot password link
	private By forgotPassword = By.linkText("Forgot your password?");

	// Constractor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Page action
	public String getPagetitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExist()
	{
		return driver.findElement(forgotPassword).isDisplayed();
	}
	
	public void enterUsername(String userName)
	{
		driver.findElement(emailId).sendKeys(userName);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void logIn()
	{
		driver.findElement(logIn).click();
	}
	
	
	

}
