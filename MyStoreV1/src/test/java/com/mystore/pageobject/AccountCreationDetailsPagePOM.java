package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationDetailsPagePOM {
	// Create object of Web Driver
	WebDriver ldriver;

	// Constructor
	public AccountCreationDetailsPagePOM(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	// identify Web Elements

	@FindBy(id = "id_gender1")
	WebElement titleMr;
	
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id = "passwd")
	WebElement passWord;
	
	@FindBy(id = "submitAccount")
	WebElement registrBtn;
	
	
	//identify actions on web elements
	
	public void selectTitleMr()
	{
		titleMr.click();
	}
	
	public void enterCustomerFirstname(String firstNm)
	{
		firstName.sendKeys(firstNm);
	}
	
	public void enterCustomerLastname(String lastNm)
	{
		lastName.sendKeys(lastNm);
	}
	
	public void enterPassword(String pass)
	{
		passWord.sendKeys(pass);
	}	
	
	public void clickOnRegister()
	{
		registrBtn.click();
	}	
}
