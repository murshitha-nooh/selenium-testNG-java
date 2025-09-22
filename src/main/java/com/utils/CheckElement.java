package com.utils;

import org.openqa.selenium.WebElement;

public class CheckElement {
	public static boolean isElementVisible(WebElement element) {
		return element.isDisplayed();
	}
}
