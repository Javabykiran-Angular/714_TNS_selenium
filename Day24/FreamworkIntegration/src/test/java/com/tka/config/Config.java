package com.tka.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	
	public String readUrl() {
		FileInputStream fis=null;
		Properties props=null;
		String url=null;
		
		try {
			fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\maven\\714TNS\\configdata\\mavenConfig.properties");
			props=new Properties();
			props.load(fis);
			
			url=props.getProperty("url");
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
			
		}
		
		return url;
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public WebElement accessById(String idName) {
		
		return (driver.findElement(By.id(idName)));
		
	}
	
	public WebElement accessByXapth(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	
	
	
	

}
