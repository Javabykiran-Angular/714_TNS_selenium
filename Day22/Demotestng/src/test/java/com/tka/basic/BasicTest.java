package com.tka.basic;

import org.testng.annotations.Test;

public class BasicTest {
	
	@Test(priority = 1)
	public void baxy1() {
		System.out.println("baxy1 test case execute....");
	}
	
	@Test(priority = 2)
	public void ab1() {
		System.out.println("ab1 test case execute....");
	}
	
	@Test(priority = -1)
	public void testCase3() {
		System.out.println("testCase3 test case execute....");
	}

}
