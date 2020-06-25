package com.etsyframewok.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyCrossBT{
	

	@Parameters("BrowserName")
	@Test
	public void tc01(String browsername)
	{
		
		CrossBTesting.openBrowser(browsername);
	
		
	}
	
	@Test
	public void tc02()
	{
		CrossBTesting.LaunchUrl("https://www.etsy.com/");
	
		
	}
	@Test
	public void tc03()
	{
		
		CrossBTesting.closeBrowser();
	
		
	}
	
	
	
}
