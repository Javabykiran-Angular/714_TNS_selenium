package com.tka.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tka.config.Config;

public class Signup extends Config {
	String Url = null;

	@BeforeTest
	public void readUrl() {
		Url = readPropertyFile();
	}

	@BeforeClass
	public void openBrowser() {
		browserSetting(Url);
	}
	
	@Test(priority = 1)
	public void rediffDOB() {
		System.out.println("rediffmail DOB ");
		WebElement dayElement= accessByXpath("//select[starts-with(@name,'DOB_Day')]");
		
		Select select=new Select(dayElement);
		
		select.selectByVisibleText("11");
		
		WebElement femaleRadioElelemnt= accessByXpath("//input[@value='f']");
		femaleRadioElelemnt.click();
		
		WebElement maleRadioElelemnt= accessByXpath("//input[@value='m']");
		
		boolean femaleactualResult=femaleRadioElelemnt.isSelected();
		
		boolean maleActularResult=maleRadioElelemnt.isSelected();
		
		System.out.println(femaleactualResult);
		//brd docs 
		boolean expectedResult=true;
		
		if(femaleactualResult==true && maleActularResult==false) {
			System.out.println("===================");
			Assert.assertEquals(femaleactualResult, expectedResult);
		}else {
			Assert.assertNotEquals(femaleactualResult,maleActularResult);
		}
		
		
		
	}
	

}
