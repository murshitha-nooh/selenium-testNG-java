package com.listeners;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import com.utils.TestUtils;

public class ExceptionListener extends TestListener {
	public static void handle(Exception e, WebDriver driver, String testName) {
        if (e instanceof ElementClickInterceptedException) {
            System.out.println("Custom handling for ElementClickInterceptedException");
            TestUtils.captureScreenshot(driver, testName);
        } 
        
        else {
            System.out.println("Generic exception: " + e.getMessage());
        }
    }

    
}
