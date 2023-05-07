package com.mystore.testcases;

import org.testng.annotations.*;

import com.mystore.pageobject.AccountCreationDetailsPagePOM;
import com.mystore.pageobject.IndexPagePOM;
import com.mystore.pageobject.MyAccountPagePOM;
import com.mystore.pageobject.RegisteredUserAccountPagePOM;

import junit.framework.Assert;

public class TC_MyAccountPageTest extends BaseClass 
{
	
	@Test
	public void verifyRegistrationAndLogin()
	{
		
		//open url
		driver.get(url);
		logger.info("Url Opened");
		
		IndexPagePOM indexPg=new IndexPagePOM(driver);
		indexPg.clickOnSighIn();
		logger.info("Clicked on Sign In Link");
		
		MyAccountPagePOM myAccountPg=new MyAccountPagePOM(driver);
		myAccountPg.enterCreateEmailId("xyz11@gmail.com");
		logger.info("Email address entered in create account section");
		myAccountPg.clickOnSubmitCreate();
		logger.info("Clicked on Create account button");
		
		AccountCreationDetailsPagePOM acDetailsPg=new AccountCreationDetailsPagePOM(driver);
		acDetailsPg.selectTitleMr();
		acDetailsPg.enterCustomerFirstname("Someshwar");
		acDetailsPg.enterCustomerLastname("Wagh");
		acDetailsPg.enterPassword("Xyz@123");
		logger.info("entered user details on account creation page");
		
		acDetailsPg.clickOnRegister();
		logger.info("Clicked on Register button");
		
		RegisteredUserAccountPagePOM rua=new RegisteredUserAccountPagePOM(driver);
		String userName=rua.getUserName();
		Assert.assertEquals("Someshwar Wagh", userName);
		logger.info("Account Created Successfully");
		
		
		
	}
}
