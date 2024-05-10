package com.tka.config;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browserSetting(String Url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
	}
	
	public void login() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	public void dashboard() {
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		
		handleWindow();
		
	}
	
	public void handleWindow() {
		
		ArrayList<String> windowList=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windowList.size());
		
		for(int i=0;i<windowList.size();i++) {
			
			if(i!=0) {
				driver.switchTo().window(windowList.get(i));
				driver.close();
			}
			
		}
		
		driver.switchTo().window(windowList.get(0));
		
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		
		
		
		
		
	}
	

}
