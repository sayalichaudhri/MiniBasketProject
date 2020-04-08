package com.etsyframework.Keywords;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {

	public static void openBrowser(String browserName) {

		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    Constants.driver = new ChromeDriver();
			Constants.driver.manage().window().maximize();
			break;

		case "Firefox":
			System.setProperty("webdriver.Firefox.driver","E:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			Constants.driver = new FirefoxDriver();
			Constants.driver.manage().window().maximize();
			break;
		/*
		 * case "htmlUnit": System.setProperty("webdriver.chrome.driver",
		 * "D:\\All Driver.exe files\\chromedriver_win32\\chromedriver.exe");
		 * constants.driver = new HtmlUnitDriver(); break;
		 */
		default:
			System.out.println("invalid browser name" + browserName);
		}

	}

	public static void openUrl(String url) {
		Constants.driver.get(url);
	}

	public static WebElement getWebElement(String locator, String value) {
		WebElement element = null;
		switch (locator) {
		case "XPATH":
			element = Constants.driver.findElement(By.xpath(value));

			break;

		case "CSS":
			element = Constants.driver.findElement(By.cssSelector(value));

			break;

		case "ID":
			element = Constants.driver.findElement(By.id(value));

			break;

		case "CLASS-NAME":
			element = Constants.driver.findElement(By.className(value));

			break;
		case "LINKTEXT":
			element = Constants.driver.findElement(By.linkText(value));

			break;

		default:
			System.err.println("Invalid locator " + locator + " .Expeted as CSS , ID ,LINKTEXT,CLASS-NAME,XPATH");
			break;
		}
		return element;
	}

	public static void enterText(String locator, String value, String textToenter) {
		getWebElement(locator, value).sendKeys(textToenter);

	}

	public static void clickOnElememnt(String locator, String value) {

		getWebElement(locator, value).click();
	}

	public static void selectDropDown(String locator, String value, String selectText) {
		WebElement element = getWebElement(locator, value);
		Constants.select = new Select(element);
		Constants.select.selectByVisibleText(selectText);

	}
	
	public static void handleAlertWithAccept() {
		Constants.driver.switchTo().alert().accept();

	}
	
	public static void handleAlertWithDismiss() {
		Constants.driver.switchTo().alert().dismiss();

	}
	
	public static String getAlertText() {
		String text=Constants.driver.switchTo().alert().getText();
		System.out.println("Alert text is"+text);
		return text;
	}

	public static void getScreenShot() {
		
		try {
			Constants.robo = new Robot();
		} catch (AWTException e1) {
			
		}
	    Rectangle rect=new Rectangle();
	    rect.setFrame(0, 0, 700, 500);
	    BufferedImage img=Constants.robo.createScreenCapture(rect);
	    try {
			ImageIO.write(img, "png", new File("NewImage.png"));
		
	    } catch (IOException e) {
			System.out.println("Could not save image");
		}
	  }
	public static void getFullPageScreenShot() {
		AShot ashot=new AShot();
	    Screenshot sc=ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Constants.driver);
	    try {
			ImageIO.write(sc.getImage(),"jpg", new File("UsingScreenshot.jpg"));
		} catch (IOException e) {
			System.out.println("Could not save image");
		}

	}
	public static boolean isAlertPresent() {
		try {
			Constants.driver.switchTo().alert().accept();
			
			return true;

		} catch (Exception e) {

			return false;
		}

	}

	public static void applyImplicitWait() {
		Constants.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	public static void applyExplicitWait(WebElement element) {

		Constants.wait.withTimeout(1000, TimeUnit.SECONDS);
		Constants.wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		Constants.wait.pollingEvery(200, TimeUnit.SECONDS);
		Constants.wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void applySleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	

	public static void switchToWindow() {
		String parentwindow = Constants.driver.getWindowHandle();
		Set<String> allkeys = Constants.driver.getWindowHandles();
		for (String child : allkeys) {
			while (!parentwindow.equals(child)) {
				Constants.driver.switchTo().window(child);
			}
		}

	}
	

	public static String getTitle(String title) {
		Constants.driver.getTitle();
		return title;
	}

	public static void navigateBack() {
		Constants.driver.navigate().back();
	}

	public static void navigateForword() {
		Constants.driver.navigate().forward();
	}

	public static void refreshPage() {
		Constants.driver.navigate().refresh();
	}

	public static void navigateToUrl(String url) {

		Constants.driver.navigate().to(url);
	}

	public static void windowMaximize() {
		Constants.driver.manage().window().maximize();

	}

	public static void mouesHover(WebElement element) {
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(element).perform();
	}
	
	public static void doubleClick() {
		Constants.action = new Actions(Constants.driver);
		Constants.action.doubleClick().perform();

	}
	
	public static void rightClick() {
		Constants.action = new Actions(Constants.driver);
		Constants.action.contextClick().perform();

	}
	
	public static void scrollByDown() {
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	public static void handlePopUp() {
		
		Constants.options = new ChromeOptions();
		Constants.options.addArguments("--disable-notifications");
	}
	
	public static void jewellerypage() {
		try
	    {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("E:\\JavaProgram\\EtsyFramework\\Input\\Jewelleryitem.json"));
		JSONObject uj=(JSONObject)obj;
		JSONArray unit = (JSONArray)uj.get("Bags & Purses");
		//System.out.println(unit+"\n");
		 for(int i=0;i<unit.size();i++) 
		 {
			 System.out.println(unit.get(i));
		 }
		 Thread.sleep(3000);
	     //Assert.assertTrue(Keyword.verifyTextPresent("Browser"));
	     System.out.println("Assert true");
	   }
	   catch (Exception e)
	   {
	   e.printStackTrace();	
	   }
	   }

	public static void uploadFile() {
		

	}
	

	public static void closeBrowser() {
		Constants.driver.quit();
	}
}
