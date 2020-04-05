package com.etsyframewok.Tests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.etsyframework.Keywords.Constants;
import com.etsyframework.Pages.HomePage;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class VerifyLogo extends Base {
	
	@Test
	public void etsyVerifyLogo() throws IOException {
		
		HomePage page=PageFactory.initElements(Constants.driver,HomePage.class);
		BufferedImage expectedImage = null;
		 
		 
		 //write image for check logo
			Screenshot logoImageScreenshot1 = new AShot().takeScreenshot(Constants.driver,page.etsylogo);
	        File f = new File("C:\\Users\\Admin\\EtsyFramework\\Images\\imagesEtsylogo.png");
	  ImageIO.write(logoImageScreenshot1.getImage(),"png",f);
	       // File f = new File("D:\\eclipse programs\\CompareImage\\imagesOrangeHRMlogo.png");
	if(f.exists())
	{
	System.out.println("Image File Captured");
	}
	else
	{
	System.out.println("Image File NOT exist");
	}
	     
	//Read image
		try {
			 expectedImage= ImageIO.read(new File("C:\\Users\\Admin\\EtsyFramework\\Images\\imagesEtsylogo.png"));
		} catch (IOException e) {
			System.out.println("image is not found");
		}
		 Screenshot logoImageScreenshot2 = new AShot().takeScreenshot(Constants.driver, page.etsylogo);
	        BufferedImage actualImage = logoImageScreenshot2.getImage();
	               
	        ImageDiff diff = new ImageDiffer().makeDiff(actualImage, expectedImage);
	        if(diff.hasDiff()==true)
	        {
	         System.out.println("Images are Not Same");
	        }
	        else {
	         System.out.println("Images are Same");
	        }
    
	}


	}


