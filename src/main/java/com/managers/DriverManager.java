package com.managers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static void initDriver(String browser) {

		browser = browser.toUpperCase();

		if (DriverManager.driver.get()==null) {

			switch (browser) {
			case "CHROME":
				DriverManager.driver.set(createChromeDriver());
				break;
			case "FIREFOX":
				DriverManager.driver.set(createFirefoxDriver());
				break;
			case "EDGE":
				DriverManager.driver.set(createEdgeDriver());
				break;
			default:
				DriverManager.driver.set(createChromeDriver());
				break;
			}
		}
		
		driver.get().manage().window().maximize();

	}

	private static WebDriver createChromeDriver() {
		ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File(TestConfig.AD_BLOCK_EXTN_PATH));
		return new ChromeDriver(options);
	}

	private static WebDriver createFirefoxDriver() {
		return new FirefoxDriver();
	}

	private static WebDriver createEdgeDriver() {
		return new EdgeDriver();
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void quitDriver() {
		if(driver!=null)
			  driver.get().close();
			  driver.get().quit();
	}
}
