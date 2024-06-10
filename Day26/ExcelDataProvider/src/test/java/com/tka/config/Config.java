package com.tka.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
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

}
