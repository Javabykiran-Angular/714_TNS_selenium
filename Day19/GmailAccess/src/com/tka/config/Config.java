package com.tka.config;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	
	public void gmailAccessTray() {
		
		driver.findElement(By.xpath("//div[@id='gbwa']/div/a")).click();
		driver.switchTo().frame("app");
	//	driver.findElement(By.xpath("(//div[@id='yDmH0d']/c-wiz//child::li)[4]/a")).click();
		
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.switchTo().defaultContent();
		
		
	}
	
	
	
	

}
