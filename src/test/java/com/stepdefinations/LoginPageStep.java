package com.stepdefinations;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import Apphooks.ApplicationHooks1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LoginPageStep {
	
	private WebDriver driver;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
		.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		String pagetile = loginPage.getPagetitle();	
		System.out.println("Login page title is "+pagetile);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		String actual = loginPage.getPagetitle();	
		Assert.assertTrue(actual.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.logIn();
	}

}
