package com.compri.utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	public static WebDriver startApp(WebDriver driver,String browsname, String appURL) {
		if(browsname.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-notifications");
//	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        driver = new ChromeDriver(options);
		}
		else if(browsname.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
			System.out.println("Invalid browser name");
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
