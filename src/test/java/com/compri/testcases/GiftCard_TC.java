package com.compri.testcases;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.GiftCardObject;

public class GiftCard_TC extends BaseClass{

	private static Logger log = LogManager.getLogger(GiftCard_TC.class);
	@Test
	public void GiftCardValidation() {
		logger = report.createTest("Multiple Gift Card Validation");
		GiftCardObject gc = PageFactory.initElements(driver, GiftCardObject.class);
		int QuantityNumber =2;
		logger.info("Open Bigsmall HomePage");
		log.info("Open Bigsmall HomePage");
		gc.addGiftCard(QuantityNumber);
		logger.info("Add 2 gift card");
		log.info("Add 2 gift card");
		String value = String.format("%,d", 500 *QuantityNumber);
		System.out.println(value);
		System.out.println(gc.TotalPriceOfCart());
		logger.info("Gift Card price matched with expected");
		assertTrue(value.contains(gc.TotalPriceOfCart()), "Passed");
		logger.info("Gift Card price matched with expected");
		log.info("Gift Card price matched with expected");
	}
}
