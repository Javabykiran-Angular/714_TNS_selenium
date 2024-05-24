package com.tka.config;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String Url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
	}
	
	
	public void scrollBarWindow() {
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		try {
			Thread.sleep(5000);
			
			action.sendKeys(Keys.PAGE_UP).build().perform();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void accessScrollBarWebElement() {
		
		driver.findElement(By.id("lbl_txt")).click();
		WebElement element= driver.findElement(By.cssSelector("#country_id>ul>li:nth-child(50)"));
		
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeAsyncScript("arguments[0].scrollIntoView(true);", element);
		

		Actions act=new Actions(driver);
		act.moveToElement(element);
		
			act.sendKeys(Keys.DOWN).perform();
//		
		
		
	}
	

}
