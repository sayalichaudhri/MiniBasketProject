package com.etsyframewok.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.HomePage;
import com.etsyframework.Pages.Signinpage;

public class TestRegression extends Base {
	
	@Test(priority=0)
	public void Tc_01()
	{
		HomePage home =PageFactory.initElements(Constants.driver, HomePage.class) ;
		home.Homepage_jewaller();
		System.out.println("mouse move on jewellery");
		home.Homepage_Jewellery_bag_click();
		System.out.println("Click On Bag(Submenu dispay)");
		home.Homepage_bag();
		System.out.println("Click On Bag(Submenu dispay--Select Handbag)");
		home.Homepage_purse_click();	
		System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select purse and Open purse)");
	    home.Homepage_purse_more_colour();
		System.out.println("Click On Bag(Submenu dispay--Select Handbag--Select purse and go to Cart)");
		Keyword.scrollByDown();
		home.homepage_Purse_Add_To_Cart();
	    System.out.println("Purse Add to Cart");
	}
}
