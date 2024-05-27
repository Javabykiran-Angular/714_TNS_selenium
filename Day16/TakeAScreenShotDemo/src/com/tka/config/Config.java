package com.tka.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting() {
		
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get(readUrl());
		
		
	}
	
	
	public String readUrl() {
		String url=null;
		try {
			FileInputStream fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\714_TNS_selenium\\configData\\myfile.properties");
			
			Properties props=new Properties();
			props.load(fis);
			
//			 url= props.getProperty("url");
			 url= props.getProperty("fbUrl");
			
			System.out.println(url);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return url;
		
	}
	
	public void screenShot() {
		
		TakesScreenshot tks=(TakesScreenshot) driver;
		File source= tks.getScreenshotAs(OutputType.FILE);
		
		File traget=new File("D:\\JavaByKiranSelenium\\Workspace\\714_TNS_selenium\\images\\login.png");
		
		try {
			FileHandler.copy(source, traget);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
