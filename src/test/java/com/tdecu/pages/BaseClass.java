package com.tdecu.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.annotations.ITest;

import com.tdecu.utility.BrowserFactory;
import com.tdecu.utility.ConfigDataProvider;
import com.tdecu.utility.ExlcleDataProvider;
import com.tdecu.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExlcleDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite(){
		excel= new ExlcleDataProvider();
		config= new ConfigDataProvider();
	}
	@BeforeClass
	public void setup(){
	driver=BrowserFactory.startApplcation(driver, config.getBrowser(), config.getApp());
		
	}
	@AfterClass
	public void teaDown(){
		BrowserFactory.closebrowser(driver);
		
	}
	 @AfterMethod
	public void TakeScreenshot(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			Helper.captureScreenshot(driver);
		}
	}

}
