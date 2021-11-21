package com.compri.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	WebDriver driver;
	public SignInPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//*[contains(text(),'sign in')]") WebElement signInLink;
	@FindBy(id = "CustomerEmail") WebElement emailBox;
	@FindBy(id = "CustomerPassword") WebElement pwBox;
	
	public void SignInToStore(String email, String pw) {
		signInLink.click();
		emailBox.sendKeys(email);
		pwBox.sendKeys(pw, Keys.RETURN);
	}
}
