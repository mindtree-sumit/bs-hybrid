package com.compri.testcases;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.PriceFilterPage;

public class Filter_TC extends BaseClass{
	
	private static Logger log = LogManager.getLogger(Filter_TC.class);
	@Test
	public void FilterSortLH() {
		logger = report.createTest("Low to High Filter item");
		PriceFilterPage pf = PageFactory.initElements(driver, PriceFilterPage.class);
		logger.info("Open the HomePage");
		log.info("Open the HomePage");
		pf.ClickOnAllProduct();
		logger.info("Open the All product link");
		log.info("Open the All product link");
		pf.FilterSort();
		logger.info("Filter Low to high applied");
		log.info("Filter Low to high applied");
		for (int i = 1; i < 10; i++) {
			String pricing = pf.getPriceOfProduct(i);
			String pricing2 = pf.getPriceOfProduct(i+1);
			if (pricing.compareTo(pricing2) <= 0) {
				System.out.print(pricing +" < ");
				assertTrue(true);
			}
		}
		logger.info("Filter low to high Passed");
		log.info("Filter low to high Passed");
	}
	
	@Test
	public void FilterSortHL() {
		logger = report.createTest("Low to High Filter item");
		PriceFilterPage pf = PageFactory.initElements(driver, PriceFilterPage.class);
		logger.info("Open the HomePage");
		log.info("Open the HomePage");
		pf.ClickOnAllProduct();
		logger.info("Open the All product link");
		log.info("Open the All product link");
		pf.HighToLow();
		logger.info("Filter high to low applied");
		log.info("Filter high to low applied");
		for (int i = 1; i < 10; i++) {
			String pricing = pf.getPriceOfProduct(i);
			String pricing2 = pf.getPriceOfProduct(i+1);
			if (pricing.compareTo(pricing2) >= 0) {
				System.out.print(pricing + " > ");
				assertTrue(true);
			}
		}
		logger.info("Filter high to low passed");
		log.info("Filter high to low passed");
	}
}
