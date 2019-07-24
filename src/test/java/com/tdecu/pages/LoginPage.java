package com.tdecu.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver){
		this.driver=ldriver;
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement uname;
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	public void logintoCRM(String usernameApp,String passwordApp){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			
		}
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		login.click();
		
	}
}
