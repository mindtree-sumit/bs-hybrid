package com.compri.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinCodeObject {
	
	WebDriver driver;

	public PinCodeObject(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(id = "PostalCode") WebElement postCodeBox;
	@FindBy(xpath = "//*[@id=\"cod-cheker\"]/button") WebElement checkPinBtn;

	public void PinCheck(String pin) {
		postCodeBox.sendKeys(pin);
		checkPinBtn.click();
	}

}
