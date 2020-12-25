package com.syntax.java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelNewTOur {

	public static String url="http://www.newtours.demoaut.com/";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*Using xl file that we created to new tour application (Book1)
		 * (http://www.newtours.demoaut.com/) create a data driven test: 
		 * Register to an account using 3-4 different sets of data
		 * (exclude passing values to the drop down and try to use different locators that you know if possible)
		 */
		 

		String filePath=System.getProperty("user.dir")+"/excel/Book1.xlsx";
	
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("newTour");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int colums=sheet.getRow(0).getLastCellNum();
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		
		
		List<Map<String, String>> listMap=new ArrayList<>();
		
		for (int r=1; r<rows;r++) {
			Map<String, String>map=new LinkedMap<>();
			driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
			for (int c=0; c<colums; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
				
				switch (key) {
				case "First Name":
					driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(map.get(key));
					break;
				case "Last Name":
					driver.findElement(By.name("lastName")).sendKeys(map.get(key));
					break;
				case "Phone":
					driver.findElement(By.name("phone")).sendKeys(map.get(key));
					break;
				case "email":
					driver.findElement(By.name("//input[@id='userName']")).sendKeys(map.get(key));
					break;
				case "Address":
					driver.findElement(By.cssSelector("input[size='40']")).sendKeys(map.get(key));
					break;
				case "City":
					driver.findElement(By.name("city")).sendKeys(key);
					break;
				case "State/Province":
					driver.findElement(By.xpath("//input[@maxlength='40']")).sendKeys(key);
					break;
				case "Postal Code":
					driver.findElement(By.name("postalCode")).sendKeys(key);
					break;
//				case "Country":
//				driver.findElement(By.cssSelector("select[size='1']")).click();
				
//				break;
				case "User name":
					driver.findElement(By.id("email")).sendKeys(map.get(key));
					break;
				case "Password":
					driver.findElement(By.name("password")).sendKeys(map.get(key));
					break;
				case "Confirm password":
					driver.findElement(By.name("confirmPassword")).sendKeys(map.get(key));
					break;
				}
			}
			Thread.sleep(1000);
			driver.findElement(By.name("register")).click(); //===> after filling we are submitting
			listMap.add(map);
		}
		
		
		
	}

}
