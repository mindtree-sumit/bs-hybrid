package com.compri.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.WishListObject;

public class WishList_TC extends BaseClass{
	
	private static Logger log = LogManager.getLogger(WishList_TC.class);
	
	@Test
	public void WishListCart() {
		WishListObject wl = PageFactory.initElements(driver, WishListObject.class);
		logger = report.createTest("Multiple Wishlist product");
		
		wl.TopProduct();
		logger.info("CLick the top products link");
		log.info("CLick the top products link");
		
		wl.ClickonProduct1();
		logger.info("Open the first product");
		log.info("Open the first product");
		
		wl.WishlishProduct();
		logger.info("Add wishlist first product");
		log.info("Add wishlist first product");
		
		wl.Backward();
		logger.info("Browse backward for selecting another item");
		log.info("Browse backward for selecting another item");
		
		wl.ClickonProduct2();
		logger.info("Open the second product");
		log.info("Open the second product");
		
		wl.WishlishProduct();
		logger.info("Add wishlist second product");
		log.info("Add wishlist second product");
		
		wl.ClickOnWishList();
		logger.info("Open the basket item");
		log.info("Open the basket item");
		
		assertEquals(wl.NumWishListItems(), 2);
		logger.info("Wishlist item expected");
		log.info("Wishlist item expected");
	}

}
