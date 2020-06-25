package com.etsyframewok.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.HomePage;

public class VerifySearchBox extends Base {
	
	@Test
	public void verify_Search_Box() throws InterruptedException {
		
		HomePage page=PageFactory.initElements(Constants.driver, HomePage.class);
		Keyword.applySleep();
		page.search_Box("j");
		Keyword.applySleep();
		page.search_Box_MouseHover();
		
		
	}

}
