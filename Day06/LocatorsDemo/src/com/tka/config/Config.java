package com.tka.config;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String Url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Url);
		
		
	}
	
	public void elementAccess() {
		
		//driver.findElement(By.linkText("Register a new membership")).click();
		
		driver.findElement(By.partialLinkText("Register ")).click();
		
		driver.findElement(By.id("name")).sendKeys("Sumit");
		
		WebElement mobileelement= driver.findElement(By.name("mobile"));
		mobileelement.sendKeys("7985412365");
		
		//driver.findElement(By.tagName("input")).sendKeys("sumit@gmail.com");
		
		List<WebElement> list= driver.findElements(By.tagName("input"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			WebElement element=list.get(i);
			
			String strplaceholder= element.getAttribute("placeholder");
			System.out.println(strplaceholder);
			
			if(strplaceholder.equalsIgnoreCase("email")) {
				System.out.println("U r in if loop...");
				
				element.sendKeys("sumit@gmail.com");
			}else if(strplaceholder.equalsIgnoreCase("Password")) {
				element.sendKeys("123456");
			}			
			
			
		}
		
		
	}
	

}
