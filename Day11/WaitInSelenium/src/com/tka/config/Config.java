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
	
	public void waitSelenium() {
		
		

	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.switchTo().frame("webform");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("webform[email]")));		
		
		element.sendKeys("sumit@gmail.com");
		
		//close the Frame		
	//	driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		
	}
	
	

}
