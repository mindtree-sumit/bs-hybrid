package com.compri.testcases;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.SearchProductObject;

@Test
public class ProductSearchVerify_TC extends BaseClass{

	private static Logger log = LogManager.getLogger(ProductSearchVerify_TC.class);
	public void RelevantProductList() {
		SearchProductObject sp = PageFactory.initElements(driver, SearchProductObject.class);
		logger = report.createTest("Relevant Searching Item Check");
		
		String searched = config.getDataFromConfig("SearchProduct");
		
		sp.SearchProduct(searched);
		logger.info("Search the Product");
		log.info("Search the Product");
		
		for (int i = 1; i < 10; i++) {
			if(sp.ProductListName(i).contains(searched))
				assertTrue(true, "All matching item");
			else {
				assertTrue(false, "Item irrelevant found");
			}	
		}
	}
}
