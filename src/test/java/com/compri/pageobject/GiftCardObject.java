package com.compri.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardObject {

WebDriver driver;
	public GiftCardObject(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "//i[@class='fa fa-gift']") WebElement giftCardLink;
	@FindBy(xpath = "//*[@id=\"quantity\"]/../span") WebElement addQuantity;
	@FindBy(xpath = "//*[@name='add']/span") WebElement addToCart;
	@FindBy(xpath = "(//*[@class='cart__detail-info'])[2]/span/span") WebElement priceOfCart;
	
	public void addGiftCard(int i) {
		giftCardLink.click();
		for (int j = 1; j < i; j++) {
			addQuantity.click();
		}
		addToCart.click();
	}
	
	public String TotalPriceOfCart() {
		return priceOfCart.getText();
	}
	
}
