package com.compri.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "//*[@data-dropdown-rel='shop-by-category']") WebElement ShopByCatLink;
	@FindBy(xpath = "(//a[contains(text(),'Socks')])[2]") WebElement SocksLink;
	@FindBy(className = "grid-product__title") WebElement fisrtProductLink;
	@FindBy(xpath = "//h1[@class='section-header--title h1']") WebElement headerTitle;
	public void ClickOnSocks() {
		action.moveToElement(ShopByCatLink).perform();
		action.moveToElement(SocksLink).click().perform();
	}
	
	public void ClickOnFirstProduct() {
		fisrtProductLink.click();
	}

	public String ShopTitleHeader() {
		return headerTitle.getText();
	}
	
}
