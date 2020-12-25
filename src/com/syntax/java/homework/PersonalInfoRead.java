package com.syntax.java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PersonalInfoRead {

	public static void main(String[] args) throws IOException {
	
		//1. we need to have a path
		String filePath=System.getProperty("user.dir")+"/excel/Book1.xlsx";
				
		//2. we need to put our paht into FileInputStream
		FileInputStream fis=new FileInputStream(filePath);
				
		//3.we need to build an obg of workbook as we work with excel
		Workbook book=new XSSFWorkbook(fis);
		
		
		//4. we need to get sheet named "facebook"
		Sheet sheet1=book.getSheet("facebook");
		
		
		//5. so, right now we just need to find number of rows and colums in order to get info
		

		int rows=sheet1.getPhysicalNumberOfRows();
		int colums=sheet1.getRow(0).getLastCellNum();
		
		//6. we need to create an empty collection as we are going to add our maps that are in exel
		// EVERY ROW IS INDIVIDUAL MAP
		
		List <Map<String, String>> listMap=new ArrayList<>();
		
		for (int r=1; r<rows; r++) { // here we started from 1 as 0 index is fixed
			Map <String,String> map=new LinkedHashMap<>();
			for (int c=0;c<colums;c++) {
				String key=sheet1.getRow(0).getCell(c).toString();
				String value=sheet1.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
listMap.add(map);
	}
System.out.println(listMap);


}
}
