package com.etsyframework.Testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.etsy.Homepage.Homepage;
import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Loginpage.Signinpage;

public class TestRegression {
	@Test
	public void Tc_01()
	{
		Keyword.openBrowser("Chrome");
		Keyword.openUrl("https://www.etsy.com");
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		Signinpage sign=PageFactory.initElements(Constants.driver,Signinpage.class);
		//sign.clicksignin();
		//sign.enteremailorphone("chaudhari.ujjvala@gmail.com");
		//sign.enterpasswordTb("Abc@123");
		//sign.Login();
		Assert.assertTrue(Constants.driver.getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
	    System.out.println(" "+Constants.driver.getTitle());
	}
	
	@AfterTest
	public void Tc_02() 
	{
		Homepage home=PageFactory.initElements(Constants.driver,Homepage.class);
		home.Homepage_jewaller();
		System.out.println("mouse move on jewellery");
		Keyword.jewellerypage();
		home.Homepage_Jewellery_bag_click();
		System.out.println("Click On Bag(Submenu dispay)");
		home.Homepage_bag();
		System.out.println("Click On Bag(Submenu dispay--Select Handbag)");
		home.Homepage_purse_click();	
		System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select purse and Open purse)");
	    home.Homepage_purse_more_colour();
		System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select purse and go to Cart)");
	    System.out.println("Purse Add to Cart");
	}
}
