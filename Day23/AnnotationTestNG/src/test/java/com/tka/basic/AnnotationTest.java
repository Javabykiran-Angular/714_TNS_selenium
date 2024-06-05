package com.tka.basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("============ Before Suite==============");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("++++++++++ before Test ++++++++++++++");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("------------ before Class ---------------");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("************* before Method ****************");
	}
	
	@Test(priority = 1)
	public void aTest() {
		System.out.println("--------- U r in atest ---------");
	}
	
	@Test(priority = 2)
	public void bTest() {
		System.out.println("--------- U r in bTest ---------");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("************* after Method ****************");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("------------ after Class ---------------");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("++++++++++ after Test ++++++++++++++");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("============ after Suite==============");
	}
	

}
