package com.managers;

import java.io.File;

import org.testng.annotations.BeforeSuite;

import com.utils.PropertyReader;

public class TestConfig {
	
	public static String BROWSER;
	public static String BASE_URL_DEMOQA;
	public static String AD_BLOCK_EXTN_PATH;
	
	@BeforeSuite(alwaysRun=true)
	public void init() {
		setProperties();
		createScreenShotDir();
	}
	
	
	private void setProperties() {
		TestConfig.BROWSER = PropertyReader.loadProperty("BROWSER");
		TestConfig.BASE_URL_DEMOQA = PropertyReader.loadProperty("BASE_URL_DEMOQA");
		TestConfig.AD_BLOCK_EXTN_PATH= PropertyReader.loadProperty("AD_BLOCK_EXTN_PATH");
	}
	private TestConfig() {
		//no instantiation allowed
	}
	
	private void createScreenShotDir(){
		File dir = new File("screenshots");
		if (!dir.exists()) {
		    dir.mkdirs();
		}
	}

}
