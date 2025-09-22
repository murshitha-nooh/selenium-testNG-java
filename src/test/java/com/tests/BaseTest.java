package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.managers.DriverManager;
import com.managers.TestConfig;

@Listeners(ChainTestListener.class)
public class BaseTest {
	DriverManager driverManager;
	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeTest(alwaysRun = true)
	public void beforeSuite() {
		DriverManager.initDriver(TestConfig.BROWSER);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		this.driver = DriverManager.driver.get();
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		DriverManager.quitDriver();
	}

	@AfterTest
	public void afterSuite() {
		DriverManager.quitDriver();
	}

}
