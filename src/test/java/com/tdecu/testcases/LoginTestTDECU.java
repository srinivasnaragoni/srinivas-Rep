package com.tdecu.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tdecu.pages.BaseClass;
import com.tdecu.pages.LoginPage;
import com.tdecu.utility.BrowserFactory;
import com.tdecu.utility.ExlcleDataProvider;
import com.tdecu.utility.Helper;

public class LoginTestTDECU extends BaseClass{
	
	
	
	
	@Test
	
	
	public void login(){
		
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	loginpage.logintoCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
	//Assert.assertEquals("CMPRO", driver.getTitle());	
	Helper.captureScreenshot(driver);
	}
	
}
