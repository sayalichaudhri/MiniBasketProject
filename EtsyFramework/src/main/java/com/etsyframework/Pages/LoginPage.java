package com.etsyframework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath="//div[@class='wt-flex-shrink-xs-0']/child::nav/descendant::li/child::button")
	private WebElement signin;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	private WebElement register;
	
	@FindBy(xpath="//input[@id='join_neu_email_field']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='join_neu_first_name_field']") 
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='join_neu_password_field']") 
	public WebElement password;
	
	@FindBy(xpath="//button[@name='submit_attempt']") 
	private WebElement registerbutton;
	
	@FindBy(xpath="//div[@class='mb-xs-2']//button[1]") 
	private WebElement connectwithgoogle;
	
	public void click_On_Sign_In() {
		signin.click();

	}
	
	public void register() {
		register.click();

	}
	
	public void enter_To_Email(String email1) {
		email.sendKeys(email1);

	}
	public void enter_To_Fname(String fname) {
		firstname.sendKeys(fname);

	}
	
	public void enter_To_Password(String pass) {
		password.sendKeys(pass);

	}

	public void click_On_Register() {
		registerbutton.click();

	}

}
