package com.tka.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\JavaByKiranSelenium\\Workspace\\714_TNS_selenium\\ExcelSheetData\\testdata.xlsx");
		
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			XSSFRow row=sheet.getRow(0);
			XSSFCell cell=row.getCell(1);
			
			String strCellData= cell.getStringCellValue();
			System.out.println(strCellData);
			
			
			workbook.close();
		
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
