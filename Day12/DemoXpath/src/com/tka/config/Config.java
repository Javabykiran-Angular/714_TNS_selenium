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
		
		
	}
	

}
