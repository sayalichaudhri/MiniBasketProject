package com.etsyframewok.Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;

public class VerifyTitle extends Base {

	@Parameters("BrowserName")
	@Test
	public void Tc_01(String browsername)
	{
		
		Assert.assertTrue(Constants.driver.getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
	    System.out.println("Title of the website "+Constants.driver.getTitle());
	}

}
