package com.tka.login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.config.Config;

public class LoginTest extends Config
{
	String Url=null;
	
	@BeforeTest
	public void beforeTest() {
		Url=readUrl();
	}
	
	@BeforeClass
	public void beforeClass() {
		browserSetting(Url);
	}
	
	@Test(priority = 1)
	public void usernametest() {
		WebElement emailElement= accessById("email");
		emailElement.sendKeys("sumit@gmail.com");
	}
	
	@Test(priority = 2)
	public void passwordtest() {
		WebElement passwordElement= accessById("password");
		passwordElement.sendKeys("12345");
		
		 accessByXapth("//button[@type='submit']").click();
		
	}
	
//	@Test(priority = 3)
//	public void errorMessageTest() {
//		
//		String strEmailActualResult= accessById("email_error").getText();	
//		// System.out.println(strEmailActualResult);
//		
//		String strEmailExpectedResult=" Please enter email as kiran@gmail.com";
//		
//		Assert.assertEquals(strEmailActualResult, strEmailExpectedResult);
//		
//		System.out.println(".........After Assert Statement.............");
//		
//		String strPasswordActualResult =accessById("password_error").getText();
//		
//		String strPasswordExpectedResult="Please enter password 123456";
//		
//		Assert.assertEquals(strPasswordActualResult, strPasswordExpectedResult);
//		
//		
//	}
	
	@Test(priority = 3)
	public void softAssertTestCase() {
		String strEmailActualResult= accessById("email_error").getText();
		String strPasswordActualResult =accessById("password_error").getText();
		// From BRD
		String strEmailExpectedResult="Please enter email as kiran@gmail.com";
		String strPasswordExpectedResult="Please enter password 123456";
		
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(strEmailActualResult,strEmailExpectedResult);
		System.out.println("============= After First Assert===============");
		softassert.assertEquals(strPasswordActualResult,strPasswordExpectedResult);
		
		System.out.println("============= After All Assert===============");
		softassert.assertAll();
		
	}
	
	
	
	
	
	
//	@AfterClass
//	public void afterClass() {
//		closeBrowser();
//	}
	
}
