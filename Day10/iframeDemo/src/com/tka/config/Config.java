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
	
	public void accessiframe() {
		driver.switchTo().frame("moneyiframe");
		
		WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/a/span[1]"));
		
		String str= element.getText();
		System.out.println(str);
		
		driver.switchTo().defaultContent();
		
	}
	
	public void accessjbkTestFrame() {
		
		driver.switchTo().frame("webform");
		driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		
	}
	
	
	

}
