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
	
	public void accessWebTable() {
		List<WebElement> rowList= driver.findElements(By.tagName("tr"));
	//	System.out.println("Row List => "+rowList.size());
		
		for(int i=0;i<rowList.size();i++) {
			List<WebElement> colList=null;
			
			if(i==0) {
				 colList= rowList.get(i).findElements(By.tagName("th"));
			}else {
				 colList= rowList.get(i).findElements(By.tagName("td"));
			}
			
		
			//System.out.println("Col list size "+colList.size());
			for(int j=0;j<8;j++) {
				
				if(i!=0) {
					WebElement element= colList.get(j);
					
					System.out.print(" \t"+element.getText());
				}else {
					WebElement element= colList.get(j);
					
					System.out.print(" \t"+element.getText());
				}
				
			}
			System.out.println("");
			
		}
		
	}
	

}
