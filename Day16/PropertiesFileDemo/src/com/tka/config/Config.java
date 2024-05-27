package com.tka.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
			
			 url= props.getProperty("url");
			
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
	
	
	public void readFile() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\714_TNS_selenium\\configData\\myfile.properties");
		
			Properties props=new Properties();
			props.load(fis);
			
			String strName= props.getProperty("name");
			System.out.println("Name is => "+strName);
			String strId= props.getProperty("id");
			System.out.println("ID is => "+strId);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
