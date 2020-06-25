package com.etsyframework.Keywords;



import java.awt.Robot;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Constants {
	
	public static WebDriver driver; 
	public static FileInputStream fin;
	public static Properties prop;
	public static Actions action;
	public static Select select;
	public static FluentWait wait;
	public static Robot robo;
	public static ChromeOptions options;
	public static Logger logger;
}
