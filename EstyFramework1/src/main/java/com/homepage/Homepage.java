package com.homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.keyword.Constants;
import com.keyword.Keyword;

public class Homepage {
	
		@FindBy(xpath="//span[@id='catnav-primary-link-10855']")
		private WebElement jewallary;
		
		@FindBy(xpath="//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div")
		private WebElement accessories;
		
		@FindBy(xpath="//span[@id='side-nav-category-link-10865']")
		private WebElement bag;
		
		@FindBy(xpath="//a[@href='/in-en/c/bags-and-purses/handbags?ref=catnav-10855']")
		private WebElement handbag;
		
		@FindBy(xpath="//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[2]/li[3]/div/div/a/div[2]/h3")
		private WebElement purse;
		
		@FindBy(xpath="/html/body/div[6]/div/div[1]/div/div[3]/div[2]/div[2]/div[1]/div/ul/li[2]")
		private WebElement morecolour;
		
		@FindBy(xpath="//button[@class='wt-btn wt-btn--filled wt-width-full']")
		private WebElement addtocart;
		//Homepage Jewellery And Accessories
		public void Homepage_jewaller() 
		{
		Actions action=new Actions(Constants.driver);
		action.moveToElement(jewallary);
		try {
			Thread.sleep(3000);
			} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		action.perform();
		bag.click();
		}
		
		//Homepage Jewellery And Accessories--Bag
		public void Homepage_Jewellery_bag_click()
		{
			bag.click();
		}

		//Homepage Jewellery And Accessories--Bag--Handbag
		public void Homepage_bag()
		{
			handbag.click();
		}
		
		//Homepage Jewellery And Accessories--Bag--Handbag(Purse)
		public void Homepage_purse_click()
		{
			Keyword.scrollByDown();
			purse.click();
		}
		public void Homepage_purse_more_colour() 
		{
			Keyword.scrollByDown();
			morecolour.click();
		}
		/*public void Homepage_purse_Add_to_Cart() 
		{
			JavascriptExecutor js=(JavascriptExecutor) Constants.driver;
			js.executeScript("window.scrollBy(0,300)");
		    addtocart.click();
			
		}*/
}
