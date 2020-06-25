package com.etsyframewok.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.etsyframework.FileUtilities.DataDrivenTesting1;
import com.etsyframework.Keywords.Constants;
import com.etsyframework.Keywords.Keyword;
import com.etsyframework.Pages.LoginPage;

public class LoginPageTest extends Base {

	@Test(dataProvider = "LoginData", dataProviderClass= DataDrivenTesting1.class)
	public void login_Page_Test(String email1 ,String fname,String pass) throws InterruptedException {


		LoginPage page = PageFactory.initElements(Constants.driver, LoginPage.class);

		page.click_On_Sign_In();
		Constants.logger.info("Sign in button clicked");
		Keyword.applySleep();
		page.register();
		Keyword.applySleep();
		page.enter_To_Email(email1);
		Constants.logger.info("your email is entered" + email1);
		Keyword.applySleep();

		page.enter_To_Fname(fname);
		Constants.logger.info("your first name " + fname);
		Keyword.applySleep();
		page.enter_To_Password(pass);
		Constants.logger.info("your passwored is entered " + pass);
		page.click_On_Register();

		Constants.logger.info("Sign in successfull");

	}

}
