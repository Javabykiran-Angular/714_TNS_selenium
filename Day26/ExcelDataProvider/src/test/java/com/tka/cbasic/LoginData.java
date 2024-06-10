package com.tka.cbasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tka.config.Config;

public class LoginData extends Config {
	
	@Test(priority = 1,dataProvider = "logindata")
	public void logintest(String emailid,String password) {
		System.out.println("u r in logintest.....");
		System.out.println("Email ID => "+emailid);
		System.out.println("\t Password  => "+password);
	}
	
	@DataProvider(name = "logindata")
	public Object[][] logindataprovider(){
		
		Object[][] obj=readexcelsheet();
		return obj;
		
	}
	

}
