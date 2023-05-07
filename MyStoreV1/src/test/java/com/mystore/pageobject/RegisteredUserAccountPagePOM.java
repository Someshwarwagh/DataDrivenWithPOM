package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccountPagePOM {
	//Create object of Web Driver
		WebDriver ldriver;
		
		
		//Constructor
		public RegisteredUserAccountPagePOM(WebDriver rdriver)
		{
			ldriver=rdriver;
			
			PageFactory.initElements(rdriver, this);
		}
		
		
		//identify Web Elements
		
		@FindBy(xpath ="//a[@title='View my customer account']")
		WebElement userName;
		
		
		//identify action on webElement
		
		public String getUserName()
		{
			return userName.getText();
		}
}
