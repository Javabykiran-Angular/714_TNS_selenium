package com.tka.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
		System.out.println("====== Username Test-------");
	}
	
	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
	
}
