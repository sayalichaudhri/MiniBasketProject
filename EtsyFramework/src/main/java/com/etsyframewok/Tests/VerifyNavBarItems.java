package com.etsyframewok.Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Pages.HomePage;



public class VerifyNavBarItems extends Base {
	
	@Test
	public void verifyCategoryNavItems() {
		
		HomePage page=PageFactory.initElements(Constants.driver,HomePage.class);
		String[] expecteditems={"Jewellery & Accessories","Clothing & Shoes","Home & Living","Wedding & Party", "Toys & Entertainment","Art & Collectibles","Craft Supplies & Tools","Vintage"};
		
		List<WebElement> subnameitem=(List<WebElement>) page.homenavbar;
		ArrayList<String> actualitem=new ArrayList<String>();
		Iterator<WebElement> itr=subnameitem.iterator();
		while(itr.hasNext())
		{
			System.out.println(actualitem.add(itr.next().getText()));
		}
		
		for (String item : expecteditems) {
			System.out.println(item);
			Assert.assertTrue(actualitem.contains(item));
			System.out.println("All items are there");
		}
	}
	
	

}
