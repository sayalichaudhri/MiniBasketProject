package com.etsyframewok.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.AddToCartProduct;

public class Add_To_Cart_Test extends Base {
	
	@Test
	public void add_To_Cart_Product() throws InterruptedException {
		
		AddToCartProduct page=PageFactory.initElements(Constants.driver, AddToCartProduct.class);
		page.click_On_Clothing();
		Keyword.applySleep();
		page.click_On_Womens();
		Keyword.applySleep();
		page.click_On_Jacket_Cloth();
		Keyword.applySleep();
		page.select_Women_Coat();
		
	//	Keyword.applyExplicitWait(page.selectcolor);
	
		
		Keyword.applySleep();
		Keyword.scrollByDown();
		page.select_Womencoat_Color();
		
		
	//	Keyword.selectDropDownListitem(page.selectcolor);
		Keyword.applySleep();
		//page.select_Womencoat_Size();
		Keyword.scrollByDown();
		Keyword.applySleep();
		//page.click_On_Addtocartbutton();
		
		
		

	}
	

}
