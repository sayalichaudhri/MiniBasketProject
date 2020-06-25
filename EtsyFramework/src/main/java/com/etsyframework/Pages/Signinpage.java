package com.etsyframework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage 
{

@FindBy(xpath="//div[@class='wt-flex-shrink-xs-0']")	
private WebElement clicksignin;

@FindBy(xpath="//*[@id='join_neu_email_field']")
private WebElement emailorphone;

@FindBy(xpath="//*[@id='join_neu_password_field']")
private WebElement passwordTb;

@FindBy(xpath="//button[@name='submit_attempt']")
private WebElement loginclick;


public void clicksignin() 
{
	clicksignin.click();
}

public void enteremailorphone(String value) 
{
	emailorphone.sendKeys(value);
}
public void clearemailorphoneTb() 
{
	emailorphone.clear();
}
public void enterpasswordTb(String value) 
{
	passwordTb.sendKeys(value);
}
public void clearpassword() 
{
passwordTb.clear();
}

public void Login()
{
loginclick.click();
}

}
