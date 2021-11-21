package com.compri.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceFilterPage {

	WebDriver driver;

	public PriceFilterPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(css = "[data-dropdown-rel='all-of-it']")
	WebElement allProductLink;
	@FindBy(id = "sortBy")
	WebElement filterBtn;
	@FindBy(css = "[value='price-descending']")
	WebElement lowToHigh;
	@FindBy(css = "[value='price-ascending']")
	WebElement HighToLow;

	String price = "(//*[@class='money'])[";

	public void ClickOnAllProduct() {
		allProductLink.click();
	}

	public void FilterSort() {
		filterBtn.click();
		for (int i = 0; i < 5; i++)
			filterBtn.sendKeys(Keys.ARROW_DOWN);
		filterBtn.sendKeys(Keys.RETURN);
	}

	public void HighToLow() {
		filterBtn.click();
		for (int i = 0; i < 6; i++)
			filterBtn.sendKeys(Keys.ARROW_DOWN);
		filterBtn.sendKeys(Keys.RETURN);
	}

	public String getPriceOfProduct(int i) {
		String pp = driver.findElement(By.xpath(price + i + "]")).getText();
		return pp;
	}
}
