package com.tka.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	
	
	public String readPropertyFile() {
		FileInputStream fis=null;
		Properties props=null;
		String url=null;
		
		try {
			fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\maven\\714TNS\\configdata\\mavenConfig.properties");
				props=new Properties();
				props.load(fis);
				url=props.getProperty("url1");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return url;
		
	}
	
	
	public String [][] readexcelsheet() {
		FileInputStream fis=null;
		XSSFWorkbook workbook=null;
		String [][] dataArray=null;
		int di=0,dj=0;
		
		try {
			fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\maven\\714TNS\\testingdata\\testdata.xlsx");
			workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			
			int rowsize=sheet.getLastRowNum();
			
			dataArray=new String[rowsize+1][2];
			
			for(int i=0;i<=rowsize;i++,di++) {
				
				XSSFRow row= sheet.getRow(i);
				dj=0;
				for(int j=0;j<2;j++,dj++) {
					
					XSSFCell cell= row.getCell(j);
					
					dataArray[di][dj]= cell.getStringCellValue();
					
				}				
				
				
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
				
				if(workbook!=null) {
					workbook.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return dataArray;
		
	}
	
	public WebElement accessById(String id) {
		return (driver.findElement(By.id(id)));
	}
	
	public WebElement accessByXpath(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	
	
	
	

	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



	public void closeBrowser(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
