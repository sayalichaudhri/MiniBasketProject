package com.etsyframework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.etsyframework.Keywords.Keyword;

public class AddToCartProduct {
	

		@FindBy(xpath="//span[@id='catnav-primary-link-10923']") 
		private WebElement clothing;
	
		@FindBy(id="side-nav-category-link-10924") 
		private WebElement women;
		
		@FindBy(id="catnav-l4-10930") 
		private WebElement jacketandcloth;
		
		/*@FindBy(xpath="//li[42]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]") //h2[contains(text(),'Woman green coat')]
		private WebElement womencoat;*/
		
		@FindBy(xpath="//h2[contains(text(),'Woman green coat')]") 
		private WebElement womencoat;
		
		@FindBy(css="select>:first-child ")
		//@FindBy(xpath="//div[@class='wt-select 0-selector-container']/child::select") 
		public WebElement selectcolor;
		
		@FindBy(xpath="//select[@id='inventory-variation-select-1']") 
		private WebElement selectsize;
		
		
		@FindBy(xpath="//form[@class='add-to-cart-form']/child::button") 
		private WebElement addtocartbutton;
		
		public void click_On_Clothing() 
		{
		   // clothing.click();
		    Keyword.mouseHover(clothing);
		}
		
		public void click_On_Womens() 
		{
			 Keyword.mouseHover(women);
			 women.click();
			
		}
		
		public void click_On_Jacket_Cloth() 
		{
			Keyword.mouseHover(jacketandcloth);
		    jacketandcloth.click();
			
		}
		
		public void select_Women_Coat() 
		{
		    womencoat.click();
			
		}
	
		public void select_Womencoat_Color() 
		{
			//Keyword.mouseHover(selectcolor);
		    selectcolor.click();
			
		}
		public void select_Womencoat_Size() 
		{
			//Keyword.mouseHover(selectsize);
		    selectsize.click();
			
		}
		
		public void click_On_Addtocartbutton() 
		{
			 addtocartbutton.click();
			
		}
		

}
