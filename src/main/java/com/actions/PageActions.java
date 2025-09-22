package com.actions;

import org.openqa.selenium.WebDriver;

import com.utils.AdBlockerUtil;

public class PageActions {

	public void load(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public void loadAdsBlocked(WebDriver driver, String url) {
		driver.get(url);
		AdBlockerUtil.blockAds(driver);
	}
}
