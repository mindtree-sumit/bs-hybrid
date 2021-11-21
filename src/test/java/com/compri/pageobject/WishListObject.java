package com.compri.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListObject{
	
	WebDriver driver;
	
	public WishListObject(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//*[@data-dropdown-rel='top-50']") WebElement top50;
	@FindBy(xpath="(//*[@class='grid-product__title'])") WebElement prlink1;
	@FindBy(xpath="(//*[@class='grid-product__title'])[2]") WebElement prlink2;
	@FindBy(className = "swym-wishlist-cta") WebElement Wishlisting;
	@FindBy(xpath = "//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[2]/span") WebElement WishLink;
	By wishListItems =  By.xpath( "//span[@class='swym-old']") ;
	
	public void TopProduct() {
		top50.click();
	}
	
	public void ClickonProduct1() {
		prlink1.click();
	}
	
	public void ClickonProduct2() {
		prlink2.click();
	}
	
	public void ClickOnWishList() {
		WishLink.click();
	}
	
	public void WishlishProduct() {
		try {
			Thread.sleep(5000);
			Wishlisting.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void Backward() {
		driver.navigate().back();
	}

	public int NumWishListItems() {
		return driver.findElements(wishListItems).size();
	}

}
