package com.tka.signup;

import org.testng.annotations.Test;

public class SignUp {
	
	@Test(priority = 1)
	public void fnameTest() {
		System.out.println("++++++ fnameTest +++++++");
	}
	
	@Test(priority = 2,enabled = false)
	public void lnameTest() {
		System.out.println("********* lnameTest ***********");
	}
	
	@Test(priority = 3)
	public void genderTest() {
		System.out.println("********* genderTest ***********");
	}
	

}
