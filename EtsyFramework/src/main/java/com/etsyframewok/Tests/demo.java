package com.etsyframewok.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;

public class demo extends Base {
	
	@Test
	public void Tc01() throws InterruptedException {
		
		Keyword.openUrl("https://www.msn.com/en-in");
		Keyword.applySleep();
		Constants.driver.findElement(By.xpath("//a[@class='dismiss']")).click();
		Keyword.scrollByDown();
		Keyword.scrollByDown();
		Keyword.scrollByDown();
		Keyword.applySleep();
		Keyword.applySleep();
		Constants.driver.findElement(By.xpath("//li[@id='twcount']//iframe")).click();
		System.out.println("clicked");
	}
}
