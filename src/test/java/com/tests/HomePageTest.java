package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.ElementsPage;
import com.page.HomePage;

@Test(groups= {"regression","ui-flow"})
public class HomePageTest extends BaseTest{

	private HomePage homepage;
 
  @Test
  public void testHomePageLinks() {
	  homepage = new HomePage(driver);
	  homepage.navigateToHomePage();
	  ElementsPage elementsPage = homepage.clickElementsTile();
	  Assert.assertTrue(elementsPage.verifyMenuTextBoxDisplayed(),"Elements Menu not expanded");
  }
  
  @Test(groups= {"broken"})
  public void TestToFail() {
	  Assert.assertTrue(false,"Test set to fail");
  }
  
  
}
