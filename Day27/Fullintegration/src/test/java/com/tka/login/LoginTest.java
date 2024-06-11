package com.tka.login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.config.Config;

public class LoginTest extends Config {
	String Url=null;
	
	WebElement emailElement=null;
	WebElement passwordElement=null;
	WebElement btnElement=null;
	
	@BeforeTest
	public void readConfigData() {
		Url=readPropertyFile();
	}
	
	@BeforeClass
	public void openBrowser() {
		browserSetting(Url);
	}
	
	@BeforeMethod
	public void accessElement() {
		emailElement=accessById("email");
		passwordElement=accessById("password");
		btnElement=accessByXpath("//button[@type='submit']");
		
	}
	
	@Test(priority = 1,dataProvider = "logindata")
	public void loginTest(String emailid,String pwd) {
		System.out.println("U r in loginTest Method...");
		emailElement.sendKeys(emailid);
		passwordElement.sendKeys(pwd);		
		btnElement.click();
		SoftAssert softassert=null;
		
		TakesScreenshot tks=(TakesScreenshot) getDriver();
		
		File source=tks.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\JavaByKiranSelenium\\Workspace\\maven\\714TNS\\images\\"+emailid+".png");
		
		try {
			FileHandler.copy(source, destination);
			
		//	Thread.sleep(2000);
			
			String emailActualResult= accessById("email_error").getText();
			String pwdActulalResult=accessById("password_error").getText();
			
			// BRD
			String emailExpectedResult="Please enter email as kiran@gmail.com";
			String pwdExpectedResult ="Please enter password 123456";
			
			 softassert=new SoftAssert();
			softassert.assertEquals(emailActualResult, emailExpectedResult);
			softassert.assertEquals(pwdActulalResult, pwdExpectedResult);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		softassert.assertAll();
		
		
		
	}
	
	@AfterMethod
	public void clearElementData() {
		emailElement.clear();
		passwordElement.clear();
	}
	
	@DataProvider(name = "logindata")
	public Object[][] loginDataProvider(){
		Object [][] obj=readexcelsheet();
		
		return obj;
	}
	

}
