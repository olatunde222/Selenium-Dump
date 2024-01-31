package com.eBankingPractical.testCases;

import org.testng.annotations.Test;

import com.eBankingPractical.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC1_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Home Page")) {
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}
}
