package com.tka.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
	}
	
	public void login() {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		
	}
	
	

}
