package com.tka.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com/");
		
		driver.get("file:///D:/JavaByKiranSelenium/Selenium%20Softwares/Offline%20Website/index.html");
		

	}

}
