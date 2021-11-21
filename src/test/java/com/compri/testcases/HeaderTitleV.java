package com.compri.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.HomePage;

public class HeaderTitleV extends BaseClass{

	private static Logger log = LogManager.getLogger(HeaderTitleV.class);
	@Test
	public void SectionTitleValidation() {
		logger = report.createTest("Header title Validation");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		hp.ClickOnSocks();
		logger.info("Open the Socks in Shop Category");
		log.info("Open the Socks in Shop Category");
		
		assertEquals(hp.ShopTitleHeader(), config.getDataFromConfig("H1Validate"));
		logger.info("Shop Category Title Validation TC passed");
		log.info("Shop Category Title Validation TC passed");
	}
}
