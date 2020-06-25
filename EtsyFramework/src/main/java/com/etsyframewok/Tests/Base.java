package com.etsyframewok.Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends Keyword {
	
	/*
	@BeforeMethod
	public static void OpenBrowser(String browserName)
	{
	
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();

		}
	}*/

	@BeforeMethod
	public void launchBrowser() {
		
		
		Constants.logger = Logger.getLogger("Selling product");
		PropertyConfigurator.configure("C:\\Users\\Admin\\eclipse-workspace\\EtsyFramework\\src\\main\\resources\\log4j2.properties");
		
		Keyword.openBrowser("Chrome");
		Constants.logger.info("Browser is open");
		Keyword.openUrl("https://www.etsy.com/");
		Keyword.windowMaximize();

	}

	/*@AfterMethod
	public void quitBrowser() {
		Keyword.closeBrowser();
	}*/
}