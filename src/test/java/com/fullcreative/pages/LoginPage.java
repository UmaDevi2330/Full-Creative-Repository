package com.fullcreative.pages;

import org.openqa.selenium.WebElement;

import com.fullcreative.initializer.Initializer;

public class LoginPage extends Initializer{
	
	public static void enteremailid(String data) {

		WebElement emailid = getElementById("LOGINPAGE_TYPE_EMAILID_ID");
		if (emailid.isEnabled()) {
			emailid.sendKeys(data);
		}
	}

	public static void clickcontinuebutton() {
		WebElement clickcontinue = getElementById("LOGINPAGE_CLICK_CONTINUE_ID");
		if (clickcontinue.isEnabled()) {
			clickcontinue.click();
		  }
		}
				
	public static void enterpassword(String data) {
		WebElement password = getElementByClass("LOGINPAGE_TYPE_PASSWORD_CLASSNAME");
		if (password.isEnabled()) {
			password.sendKeys(data);
			}
		}
			
	public static void clicklogin() {
		WebElement clicklogin = getElementByClass("LOGINPAGE_TYPE_LOGIN_CLASSNAME");
		if (clicklogin.isEnabled()) {
			clicklogin.click();
		}
				
	}
}
