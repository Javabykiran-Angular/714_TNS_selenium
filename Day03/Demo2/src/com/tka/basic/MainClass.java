package com.tka.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		String strUrl= driver.getCurrentUrl();
//		System.out.println("VAlue of url is "+strUrl);
		
		String strTitle= driver.getTitle();
		
//		System.out.println("Value of Title is "+strTitle);
		
		String strPageSourse= driver.getPageSource();
		System.out.println(strPageSourse);
		
		WebElement element= driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		String strLabel= element.getText();
		System.out.println("Label :: "+strLabel);
				

	}

}
