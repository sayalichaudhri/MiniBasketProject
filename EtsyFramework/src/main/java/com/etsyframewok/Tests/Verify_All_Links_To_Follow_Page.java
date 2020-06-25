package com.etsyframewok.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.HomePage;

public class Verify_All_Links_To_Follow_Page extends Base {
	
	
	@Test
	public void verify_Follow_Links() throws InterruptedException {
			HomePage page=PageFactory.initElements(Constants.driver, HomePage.class);
			Keyword.applySleep();
			page.follow_Links();

		}

}
