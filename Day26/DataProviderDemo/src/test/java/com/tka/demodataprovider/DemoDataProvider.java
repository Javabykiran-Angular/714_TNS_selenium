package com.tka.demodataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider = "logindata")
	public void loginTest(String emailid,int id) {
		System.out.println("U r in loginTest");
		
		System.out.println("Email Id => "+emailid);
		System.out.println(" Id => "+id);
		
		
	}
	
	@DataProvider(name = "logindata")
	public Object[][] loginDataProvider() {
		
	//	Object[][] obj=new Object[3][3];
		
		return (new Object [][] {
			{"sumit@gmail.com",9},
			{"kiran@gmail.com",6},
			{"spruha@gmail.com",3}			
		});
	}
	

}
