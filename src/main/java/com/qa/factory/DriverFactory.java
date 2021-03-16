package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tDriver = new ThreadLocal<WebDriver>();
	
	/*
	 * This methods is used to initialize the ThreadLocal driver on the basis of given browser
	 * @param browser
	 * @return WebDriver 9This will return the tDriver)
	 */
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser value is "+browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tDriver.set(new FirefoxDriver());
		}
		
		else if(browser.equals("safari"))
		{
			tDriver.set(new SafariDriver());
		}
		
		else if(browser.equals("IE"))
		{
			tDriver.set(new InternetExplorerDriver());
		}
		else
		{
			System.out.println("Please passed the current browser "+browser);
		}
		
		//getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		
		return getDriver();
	}
	
	/*
	 * This methods is used to get driver with Threadlocal 
	 * @Return WebDriver
	 */
	public static synchronized WebDriver getDriver()
	{
		return tDriver.get();
	}

}
