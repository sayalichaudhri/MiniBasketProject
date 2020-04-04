package com.esty.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstyHomePage {
	
	public static void EstyPage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\All Driver.exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.etsy.com/in-en/");
		//driver.findElement)

	}
}
