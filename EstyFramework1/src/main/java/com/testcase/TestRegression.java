package com.testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.homepage.Homepage;
import com.keyword.Constants;
import com.keyword.Keyword;
import com.loginpage.Signinpage;

public class TestRegression {

		@Test
		public void Tc_01()
		{
			Keyword.openBrowser("Chrome");
			Keyword.openUrl("https://www.etsy.com");
			Keyword.windowMaximize();
			Constants.driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
			Signinpage sign=PageFactory.initElements(Constants.driver,Signinpage.class);
			sign.clicksignin();
			sign.enteremailorphone("chaudhari.ujjvala@gmail.com");
			sign.enterpasswordTb("Abc@123");
			sign.Login();
			Assert.assertTrue(Constants.driver.getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
		    System.out.println("Assert Passed-- "+Constants.driver.getTitle());
		}
		
		@AfterTest
		public void Tc_02() 
		{
			Homepage home=PageFactory.initElements(Constants.driver,Homepage.class);
			home.Homepage_jewaller();
			System.out.println("Mouse move on jewellery");
			System.out.println("Bags & Purses(Sub Items)---");
			Keyword.Readjsonfile();
			home.Homepage_Jewellery_bag_click();
			System.out.println("Click On Bag");
			home.Homepage_bag();
			System.out.println("Click On Bag(Submenu dispay--Select Handbag)");
			home.Homepage_purse_click();	
			System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select purse and Open purse)");
			Assert.assertTrue(Constants.driver.getTitle().equals("Purse Inserts | Etsy IN"));
		    System.out.println("Assert Passed-- "+Constants.driver.getTitle());
			home.Homepage_purse_more_colour();
			System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select one purse and go to Cart)");
			
		}
}

