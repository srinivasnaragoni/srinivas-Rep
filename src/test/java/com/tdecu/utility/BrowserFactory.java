package com.tdecu.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static  WebDriver driver;
	
	//Create method for setup
	
	public static WebDriver startApplcation(WebDriver ldriver, String browsername, String appURL )
	{
		if(browsername.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else{
			System.out.println("No browser name is selected");
		}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(appURL);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			return driver;
	}
	
	public  static void closebrowser(WebDriver driver)
	{
		driver.quit();
	}

}
