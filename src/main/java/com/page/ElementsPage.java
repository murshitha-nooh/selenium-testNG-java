package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.CheckElement;

public class ElementsPage extends BasePage {
	WebDriver driver;
	By menu_TextBox = By.xpath("//span[text()='Text Box']");

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyMenuTextBoxDisplayed() {
		return CheckElement.isElementVisible(driver.findElement(menu_TextBox));
	}
}
