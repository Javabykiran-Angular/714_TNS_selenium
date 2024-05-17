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
	
	public void downloadTables() {
		int a;
		
		List<WebElement> rowList= driver.findElements(By.tagName("tr"));
//		System.out.println(rowList.size());
		//
		
		for(int i=0;i<rowList.size();i++) {
			List<WebElement> collist=null;
			if(i==0) {
				 collist= rowList.get(i).findElements(By.tagName("th"));
			}else {
				collist= rowList.get(i).findElements(By.tagName("td"));
			}
			
			for(int j=0;j<collist.size();j++) {
				
				if(j!=1) {
					WebElement element=collist.get(j);
					
					System.out.print(element.getText()+"\t");
				}				
				
				
			}
			System.out.println("");
			
			
			
		}
		
	}

}
