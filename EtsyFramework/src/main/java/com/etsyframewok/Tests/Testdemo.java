package com.etsyframewok.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;

public class Testdemo extends Base {
	
		@Test
		public void Tc01() throws InterruptedException {
			
			Keyword.openUrl("https://www.etsy.com/in-en/listing/267427790/woman-green-coat-green-spring-coat?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=&ref=sr_gallery-1-20&frs=1&cns=1&col=1");
			Keyword.applySleep();
			Constants.driver.findElement(By.xpath("//select[@id='inventory-variation-select-0']")).click();
			Keyword.applySleep();
			Select select = new Select(Constants.driver.findElement(By.xpath("//select[@id='inventory-variation-select-0']")));

			List<WebElement> optionsList = select.getOptions();
			int sizelist=optionsList.size();
			for (int i = 0; i < sizelist; i++) {
				 String value= select.getOptions().get(i).getText();
				 
				 System.out.println(value);
				 if(i>=3)
				 {
					 select.selectByIndex(i);
				 }
				
		
			}
			
			/*for (WebElement option : optionsList) {
			             String value= option.getText();
			              System.out.println(optionsList);
			              
			              select.selectByIndex(option);
			}
			*/
			
			//String defaultItem = ((WebElement) option).getText();
//			System.out.println(defaultItem );
			//Keyword.selectDropDown("XPATH", "//select[@id='inventory-variation-select-0']","Medium Brown (US$ 20.39)");
		//	Constants.driver.findElement(By.xpath("//select[@id='inventory-variation-select-0']"));
		
			Keyword.applySleep();
			Keyword.scrollByDown();
			Keyword.applySleep();
			Constants.driver.findElement(By.xpath("//div[contains(text(),'Add to basket')]")).click();
			
			System.out.println("click");
		}

}
