package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actions.ElementActions;
import com.actions.PageActions;

public class BasePage {
	WebDriverWait wait;
	ElementActions element;
	PageActions page;
	
	protected BasePage() {
		element = new ElementActions();
		page = new PageActions();
	}
//Element actions
	
	
//Element checks	
	public boolean isElementVisible(WebElement element) {
		return element.isDisplayed();
	}

//Wait for elements	
	public void waitForElementLoad() {
		
	}
}
