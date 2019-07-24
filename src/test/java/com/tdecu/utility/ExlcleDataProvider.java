package com.tdecu.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExlcleDataProvider {
	
	 public XSSFWorkbook wb;

	public ExlcleDataProvider(){
		
		File src= new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read the excel file"+e.getMessage());
			
		}
		
		
	}
	 //Using  sheet Index
	public String getStringData(int sheetIndex, int row, int col){
		
		 return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
		
	}
	
	//Using SheetName
	public String getStringData(String sheetName, int row, int col){
		 return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int col){
		
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
}
