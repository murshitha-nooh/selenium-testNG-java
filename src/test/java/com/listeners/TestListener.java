package com.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tests.BaseTest;
import com.utils.TestUtils;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseTest) currentClass).getDriver();
		Throwable throwable = result.getThrowable();
		
		if(throwable !=null) {
			System.out.println("Exception during execution");
			ExceptionListener.handle((Exception) throwable, driver, result.getName());
		}
		
		else {
			System.out.println("Assertion Failed" + result.getName());
			TestUtils.captureScreenshot(driver, result.getName());
		}
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test timeout and failed");
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	

}
