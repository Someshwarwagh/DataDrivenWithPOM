package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPagePOM 
{
	//Create object of Web Driver
	WebDriver ldriver;
	
	
	//Constructor
	public IndexPagePOM(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	//identify Web Elements
	
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	
	//identify action on webElement
	
	public void clickOnSighIn()
	{
		signIn.click();
	}
	
	
}
