package com.compri.testcases;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.HomePage;
import com.compri.pageobject.PinCodeObject;

public class PostalCode_TC extends BaseClass{

	private static Logger log = LogManager.getLogger(PostalCode_TC.class);
	
	@Test(priority = 0)
	public void PinCodeValidation() {
		logger = report.createTest("Pin code Validation");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		PinCodeObject pc = PageFactory.initElements(driver, PinCodeObject.class);
		
		hp.ClickOnSocks();
		logger.info("Open the Socks category page");
		log.info("Open the Socks category page");
		
		hp.ClickOnFirstProduct();
		logger.info("Click on first product of the page");
		log.info("Click on first product of the page");
		
		pc.PinCheck("121001");
		logger.info("Enter the valid pin code");
		log.info("Enter the valid pin code");
		
		assertTrue(driver.getPageSource().contains("Expected delivery"), "Pin code validated");
		logger.info("Expected result");
		log.info("Expected result");
	}
	
	@Test(priority = 1)
	public void PinCodeValidationN() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		PinCodeObject pc = PageFactory.initElements(driver, PinCodeObject.class);
		driver.get("https://www.bigsmall.in/");
		
		hp.ClickOnSocks();
		logger.info("Open the Socks category page");
		log.info("Open the Socks category page");
		
		hp.ClickOnFirstProduct();
		logger.info("Click on first product of the page");
		log.info("Click on first product of the page");
		
		pc.PinCheck("000000");
		logger.info("Enter the invalid pin code");
		log.info("Enter the invalid pin code");
		
		assertTrue(driver.getPageSource().contains("not available"), "Pin code validated");
		logger.info("Expected result");
		log.info("Expected result");
	}
}
