package com.compri.testcases;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.compri.pageobject.BaseClass;
import com.compri.pageobject.SignInPage;

public class SignIn_TC extends BaseClass{

	private static Logger log = LogManager.getLogger(SignIn_TC.class);
	
	@Test(priority = 0)
	public void LoginToStore() {
		SignInPage si = PageFactory.initElements(driver, SignInPage.class);
		logger = report.createTest("Sign in page Validate");
		
		logger.info("Open the Sign in page");
		log.info("Open the Sign in Page");
		si.SignInToStore(excel.getStringData("LoginDetail", 0, 0), excel.getStringData(0, 0, 1));
		
		if(driver.getPageSource().contains("iframe")) {
			System.out.println("Captcha required");
			logger.info("Captcha Captcha required");
			log.info("Captcha required");
			assertTrue(false);
		}
		assertTrue(driver.getPageSource().contains("Log Out"), "Sign in Success");
	}
	
	@Test(dataProvider = "Invalid-LoginData")
	public void LoginToStoreN(String email, String pw) {
		SignInPage si = PageFactory.initElements(driver, SignInPage.class);
		logger = report.createTest("Inavalid Sign in page Validate");
		
		logger.info("Open the Sign in page");
		log.info("Open the Sign in Page");
		si.SignInToStore(email,pw);
		
		if(driver.getPageSource().contains("iframe")) {
			System.out.println("Captcha required");
			logger.info("Captcha Captcha required");
			log.info("Captcha required");
			assertTrue(false);
		}
		assertTrue(driver.getPageSource().contains("Incorrect email or password"), "Sign expected behaviour");
		
	}
	
	@DataProvider (name = "Invalid-LoginData")
	public Object[][] dpMethod() {
	    return new Object [][] { 
	    	{"", "Selenium"},
	    	{"satox63548@idrct.com", ""},
	    	{"", ""}
	    };
	}
}
