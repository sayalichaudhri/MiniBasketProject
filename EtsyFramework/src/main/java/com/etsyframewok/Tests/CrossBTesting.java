package com.etsyframewok.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.etsyframework.Keywords.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBTesting {

	

	@BeforeMethod
	public static void openBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();

		}
		System.out.println("Before method");
	}

	public static void LaunchUrl(String urlname) {
		Constants.driver.get(urlname);
		// driver.manage().window().maximize();

	}

	public static void closeBrowser() {
		Constants.driver.close();
	}

}
