package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.managers.TestConfig;

public class HomePage extends BasePage{
	WebDriver driver;
	String url;
	
	By elementsTile = By.xpath("//h5[text()='Elements']");
	
	public HomePage(WebDriver driver) {
		super();
		this.driver =driver;
		this.url = TestConfig.BASE_URL_DEMOQA;
	}
	
	public ElementsPage clickElementsTile() {
		element.click(driver.findElement(elementsTile));
		return new ElementsPage(this.driver);
	}

	public void navigateToHomePage() {
		page.load(driver,url);
	}
}
