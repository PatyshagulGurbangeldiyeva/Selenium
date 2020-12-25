package com.syntax.java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PersonInfo {
	
	
			
	public static void main(String[] args) throws IOException {
		//1. create an excel file 
		//2. create a sheet named facebook
		//3. write there info of signing up to facebook
		//4. here in java create a cell 
		//5. add info in excel
		//6.then print existing sheet
		
		
		
		
		// in order to write in excel we need to load it:
		
		//1. we need to have a path
		String filePath=System.getProperty("user.dir")+"/excel/Book1.xlsx";
		
		//2. we need to put our paht into FileInputStream
		FileInputStream fis=new FileInputStream(filePath);
		
		//3.we need to build an obg of workbook as we work with excel
		Workbook book=new XSSFWorkbook(fis);
		
		//4. create new sheet named facebook
		Sheet sheet=book.createSheet("facebook");
		
		//5. create a cell
		sheet.createRow(0).createCell(0).setCellValue("First Name");
		sheet.createRow(0).createCell(1).setCellValue("Last Name");
		sheet.createRow(0).createCell(2).setCellValue("Mpbile or phone number");
		sheet.createRow(0).createCell(3).setCellValue("New password");
		sheet.createRow(0).createCell(4).setCellValue("Month of birth");
		sheet.createRow(0).createCell(5).setCellValue("Date of birth");
		sheet.createRow(0).createCell(6).setCellValue("Year of birth");
		sheet.createRow(0).createCell(7).setCellValue("Gender");
		
		
		// 7. we need to push them into excel, so we will use FileOutPutStream
		FileOutputStream fos=new FileOutputStream(filePath);
		book.write(fos);
		
	
		}
	}


