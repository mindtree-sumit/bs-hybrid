package com.compri.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() {
		
		//main
		File src = new File("./config/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Unable to open load config file >>" +e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getStagingURl() {
		return pro.getProperty("qaURL");
	}
}
