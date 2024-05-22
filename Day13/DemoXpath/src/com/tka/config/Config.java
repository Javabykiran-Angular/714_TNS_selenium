package com.tka.config;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	WebDriver driver;
	
	public void browserSetting(String Url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
	}
	
	public void accessXpathw3school() {
		// Using Absolute xpath
	//	driver.findElement(By.xpath("/html/body/div[2]/div/nav/a[2]")).click();
		
		// relative xpath 
		driver.findElement(By.xpath("//div[@id='pagetop']/nav/a[2]")).click();
		System.out.println("===================");
		driver.findElement(By.xpath("//div[@id='pagetop']/nav/a[2]")).click();
		
		
	}
	
	public void accessRediffmail() {
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Sumit");
		//driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Sumit@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("sumit123");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("sumit123");
		
	
	
	
	
	
	
	}
	

}
