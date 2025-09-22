package com.listeners;

import java.util.List;

import org.testng.IMethodSelector;
import org.testng.IMethodSelectorContext;
import org.testng.ITestNGMethod;

public class CustomMethodSelector implements IMethodSelector{

	//not enabled in xml
	@Override
	public boolean includeMethod(IMethodSelectorContext context, ITestNGMethod method, boolean isTestMethod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTestMethods(List<ITestNGMethod> testMethods) {
		// TODO Auto-generated method stub
		
	}

}
