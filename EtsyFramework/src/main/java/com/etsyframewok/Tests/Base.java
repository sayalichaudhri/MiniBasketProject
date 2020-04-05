package com.etsyframewok.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.etsyframework.Keywords.Keyword;


public class Base extends Keyword {

	@BeforeMethod
	public void launchBrowser() {
		
		Keyword.openBrowser("Chrome");
		Keyword.openUrl("https://www.etsy.com/");
		Keyword.windowMaximize();

	}

	@AfterMethod
	public void quitBrowser() {
		Keyword.closeBrowser();
	}
}