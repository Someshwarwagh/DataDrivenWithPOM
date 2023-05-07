package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPagePOM {
	//Create object of Web Driver
		WebDriver ldriver;
		
		public MyAccountPagePOM(WebDriver rdriver)
		{
			ldriver=rdriver;
			
			PageFactory.initElements(rdriver, this);
		}
		
		
		//identify Web Elements
		
		@FindBy(id = "email_create")
		WebElement createEmailId;
		
		@FindBy(id = "SubmitCreate")
		WebElement submitCreate;
		
		
		//identify action on webElement
		
		public void enterCreateEmailId(String email)
		{
			createEmailId.sendKeys(email);
		}
		
		public void clickOnSubmitCreate()
		{
			submitCreate.click();
		}
}
